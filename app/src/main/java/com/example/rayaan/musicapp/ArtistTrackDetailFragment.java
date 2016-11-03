package com.example.rayaan.musicapp;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import com.example.rayaan.musicapp.Models.artist_info.ArtistInfo;
import com.example.rayaan.musicapp.Models.atrist_top_track.ArtistTopTrack;
import com.example.rayaan.musicapp.Models.similar_tracks.SimilarTracks;
import com.example.rayaan.musicapp.Models.top_artist_model.Artist_;
import com.example.rayaan.musicapp.Models.top_tracks_model.Track;
import com.example.rayaan.musicapp.Models.track_info.TrackInfo;
import com.example.rayaan.musicapp.retrofitCallingBack.ArtistInfoCallingBack;
import com.example.rayaan.musicapp.retrofitCallingBack.TrackInfoAndSimilarTrackCallingBack;
import com.example.rayaan.musicapp.retrofit_imp.ApiInterface;
import com.example.rayaan.musicapp.retrofit_imp.Connect;

import butterknife.Bind;
import butterknife.ButterKnife;
import retrofit2.Call;


/**
 * A placeholder fragment containing a simple view.
 */
public class ArtistTrackDetailFragment extends Fragment {

    ApiInterface apiInterface;
    String type;
    @Bind(R.id.recycler_view)
    RecyclerView recyclerView;
    public ArtistTrackDetailFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.track_artist_info_and_similar, container, false);
        ButterKnife.bind(this,view);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setHasFixedSize(true);
        apiInterface=Connect.getClient().create(ApiInterface.class);
        Bundle p = getActivity().getIntent().getExtras();
        type = p.getString("type");
        if (type.equals("artist"))
        {
            update_view(p);
        }
        else{
            update_track_view(p);
        }
        return view;
    }
    public void update_view(Bundle p){
        Call<ArtistInfo>infoCall;
        Call<ArtistTopTrack>topTrackCall;
        Artist_ artist =(Artist_) p.getSerializable("artist");
        infoCall=apiInterface.getArtistInfo(FinalData.api_key,FinalData.formate,artist.getName(),"artist.getinfo");
        topTrackCall=apiInterface.getTopTrack(FinalData.api_key,FinalData.formate,"artist.gettoptracks",artist.getName());
        infoCall.enqueue(new ArtistInfoCallingBack( getActivity(),topTrackCall,recyclerView));
    }
    public  void update_track_view(Bundle p){
        Call<SimilarTracks>similartrackCall;
        Track track=(Track)p.getSerializable("track");
        Call<TrackInfo>trackInfoCall;
        trackInfoCall=apiInterface.getTrackInfo(FinalData.api_key,FinalData.formate,"track.getinfo",track.getArtist().getName(),track.getName());
        similartrackCall=apiInterface.getSimilarTrcks(FinalData.api_key,FinalData.formate,"track.getsimilar",track.getArtist().getName(),track.getName());
        similartrackCall.enqueue(new TrackInfoAndSimilarTrackCallingBack(similartrackCall,track,getActivity(),trackInfoCall,recyclerView));
    }

}
