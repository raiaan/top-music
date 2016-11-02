package com.example.rayaan.musicapp;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.rayaan.musicapp.Models.artist_info.ArtistInfo;
import com.example.rayaan.musicapp.Models.atrist_top_track.ArtistTopTrack;
import com.example.rayaan.musicapp.Models.top_artist_model.Artist_;
import com.example.rayaan.musicapp.retrofitCallingBack.ArtistInfoCallingBack;
import com.example.rayaan.musicapp.retrofit_imp.ApiInterface;
import com.example.rayaan.musicapp.retrofit_imp.Connect;

import butterknife.Bind;
import butterknife.ButterKnife;
import retrofit2.Call;


/**
 * A placeholder fragment containing a simple view.
 */
public class ArtistInfoFragment extends Fragment {

    Call<ArtistInfo>infoCall;
    ApiInterface apiInterface;
    Call<ArtistTopTrack>topTrackCall;
    @Bind(R.id.artist_gridView)
    GridView similar_artist_and_top_track_gridView;
    Artist_ artist;
    public ArtistInfoFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.artist_info_fragment, container, false);
        ButterKnife.bind(this,view);
        apiInterface=Connect.getClient().create(ApiInterface.class);
        update_view(getActivity().getIntent().getExtras());
        return view;
    }
    public void update_view(Bundle p){
        artist =(Artist_) p.getSerializable("artist");
        infoCall=apiInterface.getArtistInfo(FinalData.api_key,FinalData.formate,artist.getName(),"artist.getinfo");
        topTrackCall=apiInterface.getTopTrack(FinalData.api_key,FinalData.formate,"artist.gettoptracks",artist.getName());
        infoCall.enqueue(new ArtistInfoCallingBack(artist, similar_artist_and_top_track_gridView,getActivity(),topTrackCall));
    }

}
