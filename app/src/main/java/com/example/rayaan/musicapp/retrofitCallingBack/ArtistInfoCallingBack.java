package com.example.rayaan.musicapp.retrofitCallingBack;

import com.example.rayaan.musicapp.Models.artist_info.ArtistInfo;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Rayaan on 30/10/2016.
 */
public class ArtistInfoCallingBack implements Callback<ArtistInfo> {
    @Override
            public void onResponse(Call<ArtistInfo> call, Response<ArtistInfo> response) {
                String x=response.body().getArtist().getBio().getContent();
            }
            @Override
            public void onFailure(Call<ArtistInfo> call, Throwable t) {

            }
}
