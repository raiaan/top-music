package com.example.rayaan.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;

import com.example.rayaan.musicapp.Models.top_artist_model.Artist_;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Bundle p = getIntent().getExtras();
        ArtistTrackDetailFragment detailFragment = (ArtistTrackDetailFragment)getFragmentManager().findFragmentById(R.id.detail_fragment);
        detailFragment.get_data_at_one_pane(p);
    }

}
