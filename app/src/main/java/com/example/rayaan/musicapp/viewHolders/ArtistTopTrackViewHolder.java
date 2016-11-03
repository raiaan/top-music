package com.example.rayaan.musicapp.viewHolders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.GridView;
import android.widget.TextView;

import com.example.rayaan.musicapp.R;

/**
 * Created by Rayaan on 03/11/2016.
 */
public class ArtistTopTrackViewHolder extends RecyclerView.ViewHolder  {
    public GridView gridView;
    public TextView toptracksection;
    public ArtistTopTrackViewHolder(View itemView) {
        super(itemView);
        gridView=(GridView)itemView.findViewById(R.id.tops_gridview);
        toptracksection=(TextView)itemView.findViewById(R.id.if_it_is_artist_top_track);
    }
}
