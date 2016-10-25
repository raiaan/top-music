
package com.example.rayaan.musicapp.Models.artist_info;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Similar {
    @SerializedName("artist")
    private List<Artist__> artist = new ArrayList<Artist__>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Similar() {
    }

    /**
     * 
     * @param artist
     */
    public Similar(List<Artist__> artist) {
        this.artist = artist;
    }

    /**
     * 
     * @return
     *     The artist
     */
    public List<Artist__> getArtist() {
        return artist;
    }

    /**
     * 
     * @param artist
     *     The artist
     */
    public void setArtist(List<Artist__> artist) {
        this.artist = artist;
    }

}
