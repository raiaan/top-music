package com.example.rayaan.musicapp.retrofitCallingBack;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
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
public class ArtistCallback implements Callback<Artist> ,AdapterView.OnItemClickListener{
    GridView gridView;
    Context context;
    Intent intent;
    List<Artist_>artistList;
    public ArtistCallback(GridView gridView, Context context, Intent intent) {
        this.gridView = gridView;
        this.context = context;
        this.intent=intent;
    }

    @Override
    public void onResponse(Call<Artist> call, Response<Artist> response) {
        artistList=response.body().getArtists().getArtist();
        gridView.setAdapter(new TopArtistAdapter(artistList,context));
        gridView.setOnItemClickListener(this);
    }

    @Override
    public void onFailure(Call<Artist> call, Throwable t) {

    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        intent.putExtra("artist",artistList.get(i));
        context.startActivity(intent);
    }
}
