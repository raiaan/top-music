
package com.example.rayaan.musicapp.Models.artist_info;

import com.google.gson.annotations.SerializedName;

public class ArtistInfo {

    @SerializedName("artist")
    private Artist_ artist;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ArtistInfo() {
    }

    /**
     * 
     * @param artist
     */
    public ArtistInfo(Artist_ artist) {
        this.artist = artist;
    }

    /**
     * 
     * @return
     *     The artist
     */
    public Artist_ getArtist() {
        return artist;
    }

    /**
     * 
     * @param artist
     *     The artist
     */
    public void setArtist(Artist_ artist) {
        this.artist = artist;
    }

}
