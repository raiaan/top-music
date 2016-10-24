package com.example.rayaan.musicapp;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.rayaan.musicapp.artist_info.ArtistInfo;
import com.example.rayaan.musicapp.artist_info.Artist_;
import com.example.rayaan.musicapp.retrofit_imp.ApiInterface;
import com.example.rayaan.musicapp.retrofit_imp.Connect;
import com.example.rayaan.musicapp.top_artist_model.Artist;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


/**
 * A placeholder fragment containing a simple view.
 */
public class Main2ActivityFragment extends Fragment {

    Call<ArtistInfo>infoCall;
    ApiInterface apiInterface;
    ArtistInfo info;
    public Main2ActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_main2, container, false);
        apiInterface=Connect.getClient().create(ApiInterface.class);
        infoCall=apiInterface.getArtistInfo(FinalData.api_key,FinalData.formate,"Coldplay","artist.getinfo");
        infoCall.enqueue(new Callback<ArtistInfo>() {
            @Override
            public void onResponse(Call<ArtistInfo> call, Response<ArtistInfo> response) {
                String x=response.body().getArtist().getBio().getContent();
                Log.v("data",""+x);
            }

            @Override
            public void onFailure(Call<ArtistInfo> call, Throwable t) {

            }
        });
        return view;
    }


}
