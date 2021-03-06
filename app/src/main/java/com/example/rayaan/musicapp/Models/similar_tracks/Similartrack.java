package com.example.rayaan.musicapp.Models.similar_tracks;

import java.util.ArrayList;
import java.util.List;

public class Similartrack {

    private List<Track> track = new ArrayList<Track>();
    private Attr attr;

    /**
     * 
     * @return
     *     The track
     */
    public List<Track> getTrack() {
        return track;
    }

    /**
     * 
     * @param track
     *     The track
     */
    public void setTrack(List<Track> track) {
        this.track = track;
    }

    /**
     * 
     * @return
     *     The attr
     */
    public Attr getAttr() {
        return attr;
    }

    /**
     * 
     * @param attr
     *     The @attr
     */
    public void setAttr(Attr attr) {
        this.attr = attr;
    }

}
