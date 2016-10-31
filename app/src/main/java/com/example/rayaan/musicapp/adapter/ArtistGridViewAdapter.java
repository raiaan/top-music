package com.example.rayaan.musicapp.adapter;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.rayaan.musicapp.Models.artist_info.Artist__;
import com.example.rayaan.musicapp.Models.artist_info.Similar;
import com.example.rayaan.musicapp.R;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by Rayaan on 31/10/2016.
 */
public class ArtistGridViewAdapter extends BaseAdapter {
    List<Artist__>similars;
    Context context;

    public ArtistGridViewAdapter(List<Artist__> similars, Context context) {
        this.similars = similars;
        this.context = context;
    }

    @Override
    public int getCount() {
        return similars.size();
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
        LinearLayout linearLayout= (LinearLayout)view.findViewById(R.id.item_background);
        TextView textView = (TextView)view.findViewById(R.id.name);
        ImageView imageView=(ImageView)view.findViewById(R.id.music_img);
        textView.setText(similars.get(i).getName());
        Picasso.with(context).load(similars.get(i).getImage().get(3).get_text()).into(imageView);
        return view;
    }

}
