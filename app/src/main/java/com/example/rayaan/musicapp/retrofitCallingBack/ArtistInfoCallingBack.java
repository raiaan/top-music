package com.example.rayaan.musicapp.retrofitCallingBack;

import android.content.Context;
import android.support.v7.widget.RecyclerView;

import com.example.rayaan.musicapp.Models.artist_info.ArtistInfo;
import com.example.rayaan.musicapp.Models.artist_info.Artist_;
import com.example.rayaan.musicapp.Models.atrist_top_track.ArtistTopTrack;
import com.example.rayaan.musicapp.Models.atrist_top_track.Toptracks;
import com.example.rayaan.musicapp.adapter.ArtistRecyclerAdapter;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Rayaan on 30/10/2016.
 */
public class ArtistInfoCallingBack implements Callback<ArtistInfo> {

    ArtistInfo artistinfo;
    Context context;
    RecyclerView recyclerView;
    Call<ArtistTopTrack> topTrackCall;
    public ArtistInfoCallingBack( Context context, Call<ArtistTopTrack> topTrackCall, RecyclerView recyclerView) {
        this.recyclerView=recyclerView;
        this.context=context;
        this.topTrackCall=topTrackCall;
    }

    @Override
    public void onResponse(Call<ArtistInfo> call, Response<ArtistInfo> response) {
        artistinfo=response.body();
        topTrackCall.enqueue(new Callback<ArtistTopTrack>() {
            @Override
            public void onResponse(Call<ArtistTopTrack> call, Response<ArtistTopTrack> response) {
                Toptracks tracks=response.body().getToptracks();
                recyclerView.setAdapter(new ArtistRecyclerAdapter(artistinfo,context,tracks));
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
