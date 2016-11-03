package com.example.rayaan.musicapp.viewHolders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.GridView;

import com.example.rayaan.musicapp.R;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by Rayaan on 03/11/2016.
 */
public class SimilarViewHolder extends RecyclerView.ViewHolder {
    public GridView gridView;
    public SimilarViewHolder(View itemView) {
        super(itemView);
        gridView=(GridView)itemView.findViewById(R.id.similar_gridview);
    }
}
