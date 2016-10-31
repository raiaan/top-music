package com.example.rayaan.musicapp.retrofitCallingBack;

import android.content.Context;
import android.widget.GridView;
import android.widget.TextView;

import com.example.rayaan.musicapp.Models.artist_info.ArtistInfo;
import com.example.rayaan.musicapp.Models.artist_info.Artist_;
import com.example.rayaan.musicapp.adapter.ArtistGridViewAdapter;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Rayaan on 30/10/2016.
 */
public class ArtistInfoCallingBack implements Callback<ArtistInfo> {
    TextView bio;
    Artist_ artist;
    GridView gridView;
    Context context;
    public ArtistInfoCallingBack(TextView bio, GridView gridView,Context context) {
        this.bio = bio;
        this.gridView=gridView;
        this.context=context;
    }

    @Override
    public void onResponse(Call<ArtistInfo> call, Response<ArtistInfo> response) {
        artist=response.body().getArtist();
        bio.setText(artist.getBio().getContent());
        gridView.setAdapter(new ArtistGridViewAdapter(artist.getSimilar().getArtist(),context));
    }
    @Override
    public void onFailure(Call<ArtistInfo> call, Throwable t) {

    }
}
