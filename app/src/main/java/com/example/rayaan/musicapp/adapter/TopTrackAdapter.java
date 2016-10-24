package com.example.rayaan.musicapp.adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.rayaan.musicapp.R;
import com.example.rayaan.musicapp.top_tracks_model.Track;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by Rayaan on 15/10/2016.
 */
public class TopTrackAdapter extends BaseAdapter {
    List<Track> tracks;
    Context context;
    public TopTrackAdapter(List<Track> tracks, Context context){
        this.tracks = tracks;
        this.context=context;
    }
    @Override
    public int getCount() {
        return tracks.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.main_item, viewGroup, false);
        TextView textView = (TextView)view.findViewById(R.id.name);
        ImageView imageView=(ImageView)view.findViewById(R.id.music_img);
        textView.setText(tracks.get(i).getName().toString());
        Log.v("ddata"," "+tracks.get(i).getImage().get(3).getText());
        Picasso.with(context).load(tracks.get(i).getImage().get(3).getText()).into(imageView);
        return view;
    }
}
