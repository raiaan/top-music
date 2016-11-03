package com.example.rayaan.musicapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.rayaan.musicapp.Models.artist_info.Artist_;
import com.example.rayaan.musicapp.Models.atrist_top_track.Toptracks;
import com.example.rayaan.musicapp.R;
import com.squareup.picasso.Picasso;

/**
 * Created by Rayaan on 31/10/2016.
 */
public class ArtistGridViewAdapter extends BaseAdapter {
    Artist_ artistinfo;
    com.example.rayaan.musicapp.Models.top_artist_model.Artist_ artist;
    Context context;
    Toptracks toptracks;

    public ArtistGridViewAdapter(com.example.rayaan.musicapp.Models.top_artist_model.Artist_ artist,
                                 Artist_ artistinfo,Context context ,Toptracks toptracks) {
        this.artist=artist;
        this.context = context;
        this.toptracks=toptracks;
        this.artistinfo=artistinfo;
    }

    @Override
    public int getCount() {
        return artistinfo.getSimilar().getArtist().size()
                +toptracks.getTrack().size()+2;
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
        if(i==0)
        {
            view=LayoutInflater.from(viewGroup.getContext())
                    .inflate(R.layout.artist_header_item, viewGroup, false);
            infoSection(view);
            return view;
        }
        else {
            if (i<toptracks.getTrack().size()+1){
                view=LayoutInflater.from(viewGroup.getContext())
                        .inflate(R.layout.main_item, viewGroup, false);
                topTracksSection(view,i-1);
                return view;
            }
            else if(i>toptracks.getTrack().size()+1){
                view=LayoutInflater.from(viewGroup.getContext())
                        .inflate(R.layout.main_item, viewGroup, false);
                similarArtistSection(view,i-toptracks.getTrack().size()-2);
                return view;
            }
            else{
                view=LayoutInflater.from(viewGroup.getContext())
                        .inflate(R.layout.main_item, viewGroup, false);
                return view;
            }
        }
    }
    public void infoSection(View view){
        ImageView artistImage=(ImageView)view.findViewById(R.id.artist_image);
        TextView artistName=(TextView)view.findViewById(R.id.artist_name);
        TextView artistBiography=(TextView)view.findViewById(R.id.biography);
        Picasso.with(context).load(artist.getImage().get(3).getText()).into(artistImage);
        artistName.setText(artist.getName());
        artistBiography.setText(artistinfo.getBio().getSummary());
    }


    public void topTracksSection(View view,int itemCount){
        ImageView trackImage=(ImageView)view.findViewById(R.id.music_img);
        TextView trackTitle=(TextView)view.findViewById(R.id.name);
        trackTitle.setText(toptracks.getTrack().get(itemCount).getName());
        Picasso.with(context).load(toptracks.getTrack().get(itemCount).getImage().get(3).getText()).into(trackImage);
    }
    public void similarArtistSection(View view,int itemCount){
        ImageView artistImage=(ImageView)view.findViewById(R.id.music_img);
        TextView artistName=(TextView)view.findViewById(R.id.name);
        Picasso.with(context).load(artistinfo.getSimilar().getArtist().get(itemCount).getImage().get(3).get_text()).into(artistImage);
        artistName.setText(artistinfo.getSimilar().getArtist().get(itemCount).getName());
    }
}
