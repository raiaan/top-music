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
import com.example.rayaan.musicapp.Models.top_artist_model.Artist_;
import com.example.rayaan.musicapp.retrofitCallingBack.ArtistInfoCallingBack;
import com.example.rayaan.musicapp.retrofit_imp.ApiInterface;
import com.example.rayaan.musicapp.retrofit_imp.Connect;
import com.squareup.picasso.Picasso;

import butterknife.Bind;
import butterknife.ButterKnife;
import retrofit2.Call;


/**
 * A placeholder fragment containing a simple view.
 */
public class ArtistInfoFragment extends Fragment {

    Call<ArtistInfo>infoCall;
    ApiInterface apiInterface;
    ArtistInfo info;
    @Bind(R.id.track_image)
    ImageView image;
    @Bind(R.id.artist_name)
    TextView artist_name;
    @Bind(R.id.biography)
    TextView biography;
    @Bind(R.id.top_artist_gridview)
    GridView gridView;
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
        Picasso.with(getActivity()).load(artist.getImage().get(3).getText()).into(image);
        artist_name.setText(artist.getName());
        infoCall=apiInterface.getArtistInfo(FinalData.api_key,FinalData.formate,artist.getName(),"artist.getinfo");
        infoCall.enqueue(new ArtistInfoCallingBack(biography,gridView,getActivity()));
    }
}
