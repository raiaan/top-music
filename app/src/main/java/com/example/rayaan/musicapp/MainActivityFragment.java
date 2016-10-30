package com.example.rayaan.musicapp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

import com.example.rayaan.musicapp.adapter.TopArtistAdapter;
import com.example.rayaan.musicapp.adapter.TopTrackAdapter;
import com.example.rayaan.musicapp.Models.top_artist_model.Artist;
import com.example.rayaan.musicapp.Models.top_artist_model.Artist_;
import com.example.rayaan.musicapp.retrofit_imp.ApiInterface;
import com.example.rayaan.musicapp.retrofit_imp.Connect;
import com.example.rayaan.musicapp.Models.top_tracks_model.TopTrack;
import com.example.rayaan.musicapp.Models.top_tracks_model.Track;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {
    Call<Artist> artistCall;
    ApiInterface apiInterface;
    Call<TopTrack>trackCall;
    Intent intent;
    SharedPreferences sharedPreferences;
    Boolean selectedType;
    @Bind(R.id.top_artist_gridview)
    GridView gridView;
    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view  = inflater.inflate(R.layout.main_fragment, container, false);
        ButterKnife.bind(this,view);
        setHasOptionsMenu(true);
        apiInterface= Connect.getClient().create(ApiInterface.class);
        selectedType=readFromSharePref();
        intent=new Intent(getActivity(),Main2Activity.class);
        gettingArtistOrTrackFromCloud();
        return view;
    }


    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
        inflater.inflate(R.menu.menu_main,menu);
    }


    @Override
    public void onResume() {
        super.onResume();
        selectedType=readFromSharePref();
        gettingArtistOrTrackFromCloud();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()==R.id.top_artist)
            selectedType=true;
        else if(item.getItemId()==R.id.top_track)
            selectedType=false;
        writeToSharedPref(selectedType);
        gettingArtistOrTrackFromCloud();
        return super.onOptionsItemSelected(item);
    }


    void writeToSharedPref(Boolean type){
        sharedPreferences=getActivity().getSharedPreferences("type",getActivity().MODE_PRIVATE);
        SharedPreferences.Editor editor= sharedPreferences.edit();
        editor.putBoolean("trackOrArtist",type);
        editor.commit();
    }


    Boolean readFromSharePref(){
        sharedPreferences=getActivity().getSharedPreferences("type",getActivity().MODE_PRIVATE);
        Boolean selected =sharedPreferences.getBoolean("trackOrArtist",true);
        return selected;
    }


     void gettingArtistOrTrackFromCloud(){
         if(selectedType==true){
             artistCall = apiInterface.getArtist(FinalData.api_key,FinalData.formate,"chart.gettopartists");
             artistCall.enqueue(new ArtistCallback(gridView,getActivity()));
         }
         else
         {
             trackCall=apiInterface.getTopTrack(FinalData.api_key,FinalData.formate,"chart.gettoptracks");
             trackCall.enqueue(new TrackCallback(gridView,getActivity(),intent));
         }
     }
}
