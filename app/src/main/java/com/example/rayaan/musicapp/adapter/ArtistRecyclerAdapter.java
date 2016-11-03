package com.example.rayaan.musicapp.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.rayaan.musicapp.Models.artist_info.ArtistInfo;
import com.example.rayaan.musicapp.Models.artist_info.Artist_;
import com.example.rayaan.musicapp.Models.atrist_top_track.Toptracks;
import com.example.rayaan.musicapp.R;
import com.example.rayaan.musicapp.viewHolders.ArtistInfoViewHolder;
import com.example.rayaan.musicapp.viewHolders.ArtistTopTrackViewHolder;
import com.example.rayaan.musicapp.viewHolders.SimilarViewHolder;
import com.example.rayaan.musicapp.viewHolders.TrackHeaderViewHolder;
import com.squareup.picasso.Picasso;

/**
 * Created by Rayaan on 31/10/2016.
 */
public class ArtistRecyclerAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    ArtistInfo artistinfo;
    Context context;
    Toptracks toptracks;
    static final int headerpart=0;
    static final int similarpart=1;
    static final int toptrackpart=2;

    public ArtistRecyclerAdapter( ArtistInfo artistinfo, Context context , Toptracks toptracks) {
        this.context = context;
        this.toptracks=toptracks;
        this.artistinfo=artistinfo;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (viewType == headerpart){
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.artist_header_item,parent,false);
            return new ArtistInfoViewHolder(view);
        }
        else if (viewType==similarpart){
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.gridview_part,parent,false);
            return new SimilarViewHolder(view);
        }
        else{
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.main_fragment,parent,false);
            return new ArtistTopTrackViewHolder(view);
        }
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (getItemViewType(position)==headerpart){
            ArtistInfoViewHolder header= (ArtistInfoViewHolder)holder;
            Picasso.with(context).load(artistinfo.getArtist().getImage().get(3).getText()).into(header.artistImage);
            header.artistName.setText(artistinfo.getArtist().getName());
            header.biography.setText(Html.fromHtml(artistinfo.getArtist().getBio().getSummary()));
        }
        else if (getItemViewType(position)==similarpart){
            SimilarViewHolder similar=(SimilarViewHolder)holder;
            similar.gridView.setAdapter(new TopArtistAdapter(artistinfo,context));
        }
        else{
            ArtistTopTrackViewHolder toptracksSection=(ArtistTopTrackViewHolder)holder;
            toptracksSection.toptracksection.setText("top tracks :-");
            toptracksSection.gridView.setAdapter(new TopTrackAdapter(toptracks,context));
        }

    }

    @Override
    public int getItemCount() {
        return 3;
    }

    @Override
    public int getItemViewType(int position) {
        if (position==0)
            return headerpart;
        else if(position==1)
            return similarpart;
        else return toptrackpart;
    }

}
