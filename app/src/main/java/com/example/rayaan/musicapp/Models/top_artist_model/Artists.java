
package com.example.rayaan.musicapp.Models.top_artist_model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Artists {

    private List<Artist_> artist = new ArrayList<Artist_>();
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Artists() {
    }

    /**
     *
     * @param artist
     */
    public Artists(List<Artist_> artist) {
        this.artist = artist;
    }

    /**
     * 
     * @return
     *     The artist
     */
    public List<Artist_> getArtist() {
        return artist;
    }

    /**
     * 
     * @param artist
     *     The artist
     */
    public void setArtist(List<Artist_> artist) {
        this.artist = artist;
    }


    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
