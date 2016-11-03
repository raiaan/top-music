
package com.example.rayaan.musicapp.Models.atrist_top_track;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Toptracks implements Serializable {

    private List<Track> track = new ArrayList<Track>();
    private Attr_ attr;

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
    public Attr_ getAttr() {
        return attr;
    }

    /**
     * 
     * @param attr
     *     The @attr
     */
    public void setAttr(Attr_ attr) {
        this.attr = attr;
    }

}
