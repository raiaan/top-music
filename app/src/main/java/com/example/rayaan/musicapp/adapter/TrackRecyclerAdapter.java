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

import com.example.rayaan.musicapp.Models.similar_tracks.Similartrack;
import com.example.rayaan.musicapp.Models.top_tracks_model.Track;
import com.example.rayaan.musicapp.Models.track_info.TrackInfo;
import com.example.rayaan.musicapp.R;
import com.example.rayaan.musicapp.viewHolders.SimilarViewHolder;
import com.example.rayaan.musicapp.viewHolders.TrackHeaderViewHolder;
import com.squareup.picasso.Picasso;

/**
 * Created by Rayaan on 03/11/2016.
 */
public class TrackRecyclerAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    Context context;
    TrackInfo trackInfo;
    Similartrack similartrack;
    Track track;
    public static final int is_not_gridview=0;
    public static final int is_gridview=1;

    public TrackRecyclerAdapter(Context context,Track track, TrackInfo trackInfo, Similartrack similartrack) {
        this.context = context;
        this.trackInfo = trackInfo;
        this.similartrack = similartrack;
        this.track=track;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if(viewType==is_not_gridview)
        {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.track_header_item,parent,false);
            return new TrackHeaderViewHolder(view);
        }
        else
        {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.gridview_part,parent,false);
            return new SimilarViewHolder(view);
        }
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (getItemViewType(position)==is_not_gridview){
            TrackHeaderViewHolder header=(TrackHeaderViewHolder)holder;
            header.artistname.setText(trackInfo.getTrack().getArtist().getName());
            header.tracktitle.setText(trackInfo.getTrack().getName());
            header.summuray.setText(Html.fromHtml(trackInfo.getTrack().getWiki().getSummary()));
            Picasso.with(context).load(track.getImage().get(3).getText()).into(header.trackImage);
        }
        else {
            SimilarViewHolder similar=(SimilarViewHolder) holder;
            ((SimilarViewHolder) holder).gridView.setAdapter(new GridviewAdapter());
        }

    }

    @Override
    public int getItemCount() {
        return 2;
    }

    @Override
    public int getItemViewType(int position) {
        if(position==0)
            return is_not_gridview;
        return is_gridview;
    }

    class GridviewAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return similartrack.getTrack().size();
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
            textView.setText(similartrack.getTrack().get(i).getName());
            Picasso.with(context).load(similartrack.getTrack().get(i).getImage().get(2).getText()).into(imageView);
            return view;
        }
    }
}
