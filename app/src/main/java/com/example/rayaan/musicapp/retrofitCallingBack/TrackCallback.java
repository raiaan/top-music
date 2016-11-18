package com.example.rayaan.musicapp.retrofitCallingBack;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import com.example.rayaan.musicapp.ArtistTrackDetailFragment;
import com.example.rayaan.musicapp.MainActivityFragment;
import com.example.rayaan.musicapp.Models.top_tracks_model.TopTrack;
import com.example.rayaan.musicapp.Models.top_tracks_model.Track;
import com.example.rayaan.musicapp.R;
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
    Activity activity;
    List<Track> tracks;
    Intent intent;
    Boolean is2bane;

    public TrackCallback(GridView gridView, Activity activity , Intent intent, Boolean is2bane) {
        this.gridView = gridView;
        this.activity = activity;
        this.intent=intent;
        this.is2bane=is2bane;
    }

    @Override
    public void onResponse(Call<TopTrack> call, Response<TopTrack> response) {
        tracks=response.body().getTracks().getTrack();
        gridView.setAdapter(new TopTrackAdapter(tracks,activity));
        gridView.setOnItemClickListener(this);
    }

    @Override
    public void onFailure(Call<TopTrack> call, Throwable t) {

    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        if (is2bane){
            ArtistTrackDetailFragment trackDetailFragment= (ArtistTrackDetailFragment)
                    activity.getFragmentManager().findFragmentById(R.id.tabletfragment);
            Bundle data = new Bundle();
            data.putSerializable("track",tracks.get(i));
            data.putString("type","track");
            trackDetailFragment.update_track_view(data);
        }
        else{
            intent.putExtra("type","track");
            intent.putExtra("track",tracks.get(i));
            activity.startActivity(intent);
        }
    }

}
