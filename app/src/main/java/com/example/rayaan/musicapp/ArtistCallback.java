package com.example.rayaan.musicapp;

import android.content.Context;
import android.widget.GridView;

import com.example.rayaan.musicapp.Models.top_artist_model.Artist;
import com.example.rayaan.musicapp.Models.top_artist_model.Artist_;
import com.example.rayaan.musicapp.adapter.TopArtistAdapter;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Rayaan on 25/10/2016.
 */
public class ArtistCallback implements Callback<Artist> {
    GridView gridView;
    Context context;

    public ArtistCallback(GridView gridView, Context context) {
        this.gridView = gridView;
        this.context = context;
    }

    @Override
    public void onResponse(Call<Artist> call, Response<Artist> response) {
        List<Artist_>artistList=response.body().getArtists().getArtist();
        gridView.setAdapter(new TopArtistAdapter(artistList,context));
    }

    @Override
    public void onFailure(Call<Artist> call, Throwable t) {

    }
}
