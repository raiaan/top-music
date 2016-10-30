package com.example.rayaan.musicapp;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.rayaan.musicapp.Models.artist_info.ArtistInfo;
import com.example.rayaan.musicapp.retrofit_imp.ApiInterface;
import com.example.rayaan.musicapp.retrofit_imp.Connect;
import com.squareup.picasso.Picasso;

import butterknife.Bind;
import butterknife.ButterKnife;
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
    //@Bind(R.id.track_image)
    ImageView image;
    Bundle p;
    public Main2ActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_main2, container, false);
        //ButterKnife.bind(this,view);
        image = (ImageView) view.findViewById(R.id.track_image);
        apiInterface=Connect.getClient().create(ApiInterface.class);
        infoCall=apiInterface.getArtistInfo(FinalData.api_key,FinalData.formate,"Coldplay","artist.getinfo");
        infoCall.enqueue(new Callback<ArtistInfo>() {
            @Override
            public void onResponse(Call<ArtistInfo> call, Response<ArtistInfo> response) {
                String x=response.body().getArtist().getBio().getContent();
                //Log.v("data",""+x);
            }

            @Override
            public void onFailure(Call<ArtistInfo> call, Throwable t) {

            }
        });
//        Picasso.with(getActivity()).
//                load(p.getString("image","https://lastfm-img2.akamaized.net/i/u/300x300/7e78dd01402296b4b210a0ff5c27c260.png"))
//                .into(image);
        return view;
    }
    public  void update_track(Bundle p){
        Log.v("image fragment"," "+getArguments().getString("image","OOOPsssss error"));
        Picasso.with(getActivity()).load(p.getString("image","https://lastfm-img2.akamaized.net/i/u/300x300/7e78dd01402296b4b210a0ff5c27c260.png")).into(image);
    }
}
