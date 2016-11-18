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
import com.example.rayaan.musicapp.Models.top_artist_model.Artist;
import com.example.rayaan.musicapp.Models.top_artist_model.Artist_;
import com.example.rayaan.musicapp.R;
import com.example.rayaan.musicapp.adapter.TopArtistAdapter;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Rayaan on 25/10/2016.
 */
public class ArtistCallback implements Callback<Artist> ,AdapterView.OnItemClickListener{
    GridView gridView;
    Activity activity;
    Intent intent;
    List<Artist_>artistList;
    Boolean is2bane;

    public ArtistCallback(GridView gridView, Activity activity, Intent intent, Boolean is2bane) {
        this.gridView = gridView;
        this.activity = activity;
        this.intent=intent;
        this.is2bane=is2bane;
    }

    @Override
    public void onResponse(Call<Artist> call, Response<Artist> response) {
        artistList=response.body().getArtists().getArtist();
        gridView.setAdapter(new TopArtistAdapter(artistList,activity));
        gridView.setOnItemClickListener(this);
    }

    @Override
    public void onFailure(Call<Artist> call, Throwable t) {

    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        if(is2bane){
            ArtistTrackDetailFragment artist= (ArtistTrackDetailFragment)
                    activity.getFragmentManager().findFragmentById(R.id.tabletfragment);
            Bundle data = new Bundle();
            data.putSerializable("artist",artistList.get(i));
            data.putString("type","artist");
            artist.update_artist_view(data);
        }
        else{
            intent.putExtra("artist",artistList.get(i));
            intent.putExtra("type","artist");
            activity.startActivity(intent);
        }
    }

}
