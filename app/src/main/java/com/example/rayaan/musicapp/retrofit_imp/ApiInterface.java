package com.example.rayaan.musicapp.retrofit_imp;
import com.example.rayaan.musicapp.Models.artist_info.ArtistInfo;
import com.example.rayaan.musicapp.Models.atrist_top_track.ArtistTopTrack;
import com.example.rayaan.musicapp.Models.top_artist_model.Artist;
import com.example.rayaan.musicapp.Models.top_tracks_model.TopTrack;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.OPTIONS;
import retrofit2.http.Query;

/**
 * Created by Rayaan on 21/09/2016.
 */
public interface ApiInterface {
    @GET("/2.0/")
    Call<Artist> getArtist(@Query("api_key") String api_Key, @Query("format") String format, @Query("method")String method);
    @GET("/2.0/")
    Call<ArtistInfo> getArtistInfo(@Query("api_key") String api_Key, @Query("format") String format,
                                   @Query("artist") String name, @Query("method")String method);
    @GET("/2.0/")
    Call<TopTrack> getTopTrack(@Query("api_key") String api_Key, @Query("format") String format,
                               @Query("method")String method  );
    @GET("/2.0/")
    Call<ArtistTopTrack> getTopTrack(@Query("api_key") String api_Key, @Query("format") String format,
                                     @Query("method")String method, @Query("artist") String name  );

}
