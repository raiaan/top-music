package com.example.rayaan.musicapp.retrofitCallingBack;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
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
public class TrackCallback implements Callback<TopTrack> , AdapterView.OnItemClickListener{
    GridView gridView;
    Context context;
    List<Track> tracks;
    Intent intent;
    public TrackCallback(GridView gridView, Context context , Intent intent) {
        this.gridView = gridView;
        this.context = context;
        this.intent=intent;
    }

    @Override
    public void onResponse(Call<TopTrack> call, Response<TopTrack> response) {
        tracks=response.body().getTracks().getTrack();
        gridView.setAdapter(new TopTrackAdapter(tracks,context));
        gridView.setOnItemClickListener(this);
    }

    @Override
    public void onFailure(Call<TopTrack> call, Throwable t) {

    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        intent.putExtra("type","track");
        intent.putExtra("track",tracks.get(i));
        context.startActivity(intent);
    }
}
