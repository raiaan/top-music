package com.example.rayaan.musicapp.retrofitCallingBack;

import android.content.Context;
import android.util.Log;
import android.widget.GridView;
import android.widget.TextView;

import com.example.rayaan.musicapp.Models.artist_info.ArtistInfo;
import com.example.rayaan.musicapp.Models.artist_info.Artist_;
import com.example.rayaan.musicapp.Models.atrist_top_track.ArtistTopTrack;
import com.example.rayaan.musicapp.Models.atrist_top_track.Toptracks;
import com.example.rayaan.musicapp.Models.top_tracks_model.TopTrack;
import com.example.rayaan.musicapp.adapter.ArtistGridViewAdapter;
import com.example.rayaan.musicapp.adapter.TopTrackAdapter;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Rayaan on 30/10/2016.
 */
public class ArtistInfoCallingBack implements Callback<ArtistInfo> {

    Artist_ artistinfo;
    com.example.rayaan.musicapp.Models.top_artist_model.Artist_ artist;
    Context context;
    Call<ArtistTopTrack> topTrackCall;
    public ArtistInfoCallingBack(com.example.rayaan.musicapp.Models.top_artist_model.Artist_ artist
            , Context context, Call<ArtistTopTrack> topTrackCall) {
        this.artist=artist;
        this.context=context;
        this.topTrackCall=topTrackCall;
    }

    @Override
    public void onResponse(Call<ArtistInfo> call, Response<ArtistInfo> response) {
        artistinfo=response.body().getArtist();
        topTrackCall.enqueue(new Callback<ArtistTopTrack>() {
            @Override
            public void onResponse(Call<ArtistTopTrack> call, Response<ArtistTopTrack> response) {
                Toptracks tracks=response.body().getToptracks();
            }

            @Override
            public void onFailure(Call<ArtistTopTrack> call, Throwable t) {

            }
        });
    }
    @Override
    public void onFailure(Call<ArtistInfo> call, Throwable t) {

    }
}
