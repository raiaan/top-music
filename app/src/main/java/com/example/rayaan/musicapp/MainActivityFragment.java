package com.example.rayaan.musicapp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import com.example.rayaan.musicapp.Models.top_artist_model.Artist;
import com.example.rayaan.musicapp.retrofitCallingBack.ArtistCallback;
import com.example.rayaan.musicapp.retrofitCallingBack.TrackCallback;
import com.example.rayaan.musicapp.retrofit_imp.ApiInterface;
import com.example.rayaan.musicapp.retrofit_imp.Connect;
import com.example.rayaan.musicapp.Models.top_tracks_model.TopTrack;

import butterknife.Bind;
import butterknife.ButterKnife;
import retrofit2.Call;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {
    Call<Artist> artistCall;
    ApiInterface apiInterface;
    Call<TopTrack>trackCall;
    Intent intent;
    SharedPreferences sharedPreferences;
    String selectedType;
    @Bind(R.id.tops_gridview)
    GridView gridView;
    Boolean is2bane ;
    ArtistCallback artistCallback;
    TrackCallback trackCallback;
    ArtistTrackDetailFragment artist_track;
    CheckIf2PaneOrNot checkIf2PaneOrNot;
    public MainActivityFragment() {}
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view  = inflater.inflate(R.layout.main_fragment, container, false);
        ButterKnife.bind(this,view);
        setHasOptionsMenu(true);
        is2bane=checkIf2PaneOrNot.is2pane();
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
        if(item.getItemId()==R.id.action_sitting)
        {
            Intent intent= new Intent(getContext(),SettingsActivity.class);
            startActivity(intent);
            return true;
        }


        //writeToSharedPref(selectedType);
        gettingArtistOrTrackFromCloud();
        return super.onOptionsItemSelected(item);
    }

    public String readFromSharePref(){
        sharedPreferences= PreferenceManager.getDefaultSharedPreferences(getActivity());
        String selected =sharedPreferences.getString("type","chart.gettopartists");
        return selected;
    }


     void gettingArtistOrTrackFromCloud(){
         if(selectedType.equals("chart.gettopartists")){
             artistCallback=new ArtistCallback(gridView,getActivity(),intent,is2bane);
             artistCall = apiInterface.getArtist(FinalData.api_key,FinalData.formate,"chart.gettopartists");
             artistCall.enqueue(artistCallback );
         }
         else
         {
             trackCallback = new TrackCallback(gridView,getActivity(),intent,is2bane);
             trackCall=apiInterface.getTopTrack(FinalData.api_key,FinalData.formate,"chart.gettoptracks");
             trackCall.enqueue(trackCallback);
         }
     }
    public interface CheckIf2PaneOrNot{
        public Boolean is2pane();
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try{
            checkIf2PaneOrNot=(CheckIf2PaneOrNot) activity;
        }catch (Exception e){

        }
    }
}
