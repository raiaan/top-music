package com.example.rayaan.musicapp.viewHolders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.rayaan.musicapp.R;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by Rayaan on 03/11/2016.
 */
public class TrackHeaderViewHolder extends RecyclerView.ViewHolder {
    public ImageView trackImage;
    public TextView tracktitle;
    public TextView artistname;
    public TextView summuray;
    public TrackHeaderViewHolder(View itemView) {
        super(itemView);
        trackImage=(ImageView)itemView.findViewById(R.id.track_img);
        tracktitle=(TextView)itemView.findViewById(R.id.track_title);
        artistname=(TextView)itemView.findViewById(R.id.track_artist_name);
        summuray=(TextView)itemView.findViewById(R.id.summary);

    }
}
