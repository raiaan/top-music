
package com.example.rayaan.musicapp.Models.atrist_top_track;

import java.io.Serializable;

public class ArtistTopTrack implements Serializable {

    private Toptracks toptracks;

    /**
     * 
     * @return
     *     The toptracks
     */
    public Toptracks getToptracks() {
        return toptracks;
    }

    /**
     * 
     * @param toptracks
     *     The toptracks
     */
    public void setToptracks(Toptracks toptracks) {
        this.toptracks = toptracks;
    }

}
