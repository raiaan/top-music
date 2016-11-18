package com.example.rayaan.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import com.example.rayaan.musicapp.Models.atrist_top_track.Artist;

public class MainActivity extends AppCompatActivity implements MainActivityFragment.CheckIf2PaneOrNot{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }


    @Override
    public Boolean is2pane() {
        MainActivityFragment leftfragment=(MainActivityFragment)getSupportFragmentManager().findFragmentById(R.id.left_fragment);
        if(leftfragment!=null)
            return true;
        return false;
    }
}
