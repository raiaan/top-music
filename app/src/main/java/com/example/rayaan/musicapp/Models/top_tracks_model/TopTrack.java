
package com.example.rayaan.musicapp.Models.top_tracks_model;

import com.google.gson.annotations.SerializedName;

public class TopTrack {

    private Tracks tracks;
    @SerializedName("toptracks")
    private Tracks track;


    public Tracks getTracks() {
        return tracks;
    }


    public void setTracks(Tracks tracks) {
        this.tracks = tracks;
    }

    public Tracks getTrack() {
        return track;
    }

    public void setTrack(Tracks track) {
        this.track = track;
    }
}
