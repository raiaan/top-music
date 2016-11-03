package com.example.rayaan.musicapp.retrofitCallingBack;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.example.rayaan.musicapp.Models.similar_tracks.SimilarTracks;
import com.example.rayaan.musicapp.Models.similar_tracks.Similartrack;
import com.example.rayaan.musicapp.Models.top_tracks_model.Track;
import com.example.rayaan.musicapp.Models.track_info.TrackInfo;
import com.example.rayaan.musicapp.adapter.TrackRecyclerAdapter;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Rayaan on 03/11/2016.
 */
public class TrackInfoAndSimilarTrackCallingBack implements Callback<SimilarTracks> {
    Call<SimilarTracks> tracksCall;
    Call<TrackInfo>trackInfoCall;
    RecyclerView recyclerView;
    Track track;
    Context context;
    public TrackInfoAndSimilarTrackCallingBack(Call<SimilarTracks> tracksCall, Track track,Context context,
                                               Call<TrackInfo>trackInfoCall,RecyclerView recyclerView) {
        this.tracksCall = tracksCall;
        this.track=track;
        this.trackInfoCall=trackInfoCall;
        this.recyclerView=recyclerView;
        this.context=context;
    }

    @Override
    public void onResponse(Call<SimilarTracks> call, Response<SimilarTracks> response) {
        final Similartrack similarTracks=response.body().getSimilartracks();
        trackInfoCall.enqueue(new Callback<TrackInfo>() {
            @Override
            public void onResponse(Call<TrackInfo> call, Response<TrackInfo> response) {
                recyclerView.setAdapter(new TrackRecyclerAdapter(context,track,response.body(),similarTracks));
            }

            @Override
            public void onFailure(Call<TrackInfo> call, Throwable t) {
                Log.v("test",t.getMessage());
            }
        });

    }

    @Override
    public void onFailure(Call<SimilarTracks> call, Throwable t) {

    }
}
