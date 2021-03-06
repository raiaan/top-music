package com.example.rayaan.musicapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.rayaan.musicapp.Models.artist_info.ArtistInfo;
import com.example.rayaan.musicapp.Models.top_artist_model.Artist_;
import com.example.rayaan.musicapp.R;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by Rayaan on 22/09/2016.
 */
public class TopArtistAdapter extends BaseAdapter {
    List<Artist_>artist;
    Context context;
    ArtistInfo artistInfo;
    public TopArtistAdapter(List<Artist_> artist, Context context) {
        this.artist = artist;
        this.context=context;
    }

    public TopArtistAdapter(ArtistInfo artistInfo, Context context) {
        this.artistInfo=artistInfo;
        this.context=context;
    }

    @Override
    public int getCount() {
        if (artistInfo==null)
            return artist.size();
        else return artistInfo.getArtist().getSimilar().getArtist().size();
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
        if (artist!=null)
        {
            textView.setText(artist.get(i).getName().toString());
            Picasso.with(context).load(artist.get(i).getImage().get(3).getText()).into(imageView);

        }
        else{
            textView.setText(artistInfo.getArtist().getSimilar().getArtist().get(i).getName());
            Picasso.with(context).load(artistInfo.getArtist().getSimilar().getArtist().get(i).getImage().get(3).get_text()).into(imageView);
        }
        return view;
    }
}
