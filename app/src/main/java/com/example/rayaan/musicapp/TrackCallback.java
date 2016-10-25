package com.example.rayaan.musicapp;

import android.content.Context;
import android.widget.GridView;

import com.example.rayaan.musicapp.Models.top_tracks_model.TopTrack;
import com.example.rayaan.musicapp.Models.top_tracks_model.Track;
import com.example.rayaan.musicapp.adapter.TopTrackAdapter;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Rayaan on 25/10/2016.
 */
public class TrackCallback implements Callback<TopTrack> {
    GridView gridView;
    Context context;

    public TrackCallback(GridView gridView, Context context) {
        this.gridView = gridView;
        this.context = context;
    }

    @Override
    public void onResponse(Call<TopTrack> call, Response<TopTrack> response) {
        List<Track> tracks=response.body().getTracks().getTrack();
        gridView.setAdapter(new TopTrackAdapter(tracks,context));
    }

    @Override
    public void onFailure(Call<TopTrack> call, Throwable t) {

    }
}
