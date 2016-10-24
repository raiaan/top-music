package com.example.rayaan.musicapp;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

import com.example.rayaan.musicapp.adapter.TopArtistAdapter;
import com.example.rayaan.musicapp.adapter.TopTrackAdapter;
import com.example.rayaan.musicapp.top_artist_model.Artist;
import com.example.rayaan.musicapp.top_artist_model.Artist_;
import com.example.rayaan.musicapp.retrofit_imp.ApiInterface;
import com.example.rayaan.musicapp.retrofit_imp.Connect;
import com.example.rayaan.musicapp.top_tracks_model.TopTrack;
import com.example.rayaan.musicapp.top_tracks_model.Track;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment implements Callback<Artist>, AdapterView.OnItemClickListener{
    Call<Artist> artistCall;
    ApiInterface apiInterface;
    Call<TopTrack>trackCall;
    List<Artist_> artistList;
    List<Track> tracks;
    Intent intent;
    int selectedType;
    @Bind(R.id.top_artist_gridview)
    GridView gridView;
    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view  = inflater.inflate(R.layout.main_fragment, container, false);
        ButterKnife.bind(this,view);
        apiInterface= Connect.getClient().create(ApiInterface.class);
        if(selectedType==1){
            artistCall = apiInterface.getArtist(FinalData.api_key,FinalData.formate,"chart.gettopartists");
            artistCall.enqueue(this);
        }
        else
        {
            trackCall=apiInterface.getTopTrack(FinalData.api_key,FinalData.formate,"chart.gettoptracks");
            trackCall.enqueue(new Callback<TopTrack>() {
                @Override
                public void onResponse(Call<TopTrack> call, Response<TopTrack> response) {
                    tracks=response.body().getTracks().getTrack();
                    gridView.setAdapter(new TopTrackAdapter(tracks,getActivity()));
                }

                @Override
                public void onFailure(Call<TopTrack> call, Throwable t) {

                }
            });
        }
        gridView.setOnItemClickListener(this);
        return view;
    }

    @Override
    public void onResponse(Call<Artist> call, Response<Artist> response) {
        artistList=response.body().getArtists().getArtist();
        gridView.setAdapter(new TopArtistAdapter(artistList,getActivity()));
    }

    @Override
    public void onFailure(Call<Artist> call, Throwable t) {

    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        intent=new Intent(getActivity(),Main2Activity.class);
        startActivity(intent);
    }
}
