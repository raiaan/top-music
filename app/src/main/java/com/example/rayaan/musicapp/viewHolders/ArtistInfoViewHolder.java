package com.example.rayaan.musicapp.viewHolders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.rayaan.musicapp.R;

/**
 * Created by Rayaan on 03/11/2016.
 */
public class ArtistInfoViewHolder extends RecyclerView.ViewHolder {
    public ImageView artistImage;
    public TextView artistName;
    public TextView biography;
    public ArtistInfoViewHolder(View itemView) {
        super(itemView);
        artistImage=(ImageView)itemView.findViewById(R.id.artist_image);
        artistName=(TextView)itemView.findViewById(R.id.artist_name);
        biography=(TextView)itemView.findViewById(R.id.biography);
    }
}
