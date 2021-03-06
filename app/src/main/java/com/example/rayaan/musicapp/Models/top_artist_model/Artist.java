
package com.example.rayaan.musicapp.Models.top_artist_model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("serial")
public class Artist implements Serializable {

    private Artists artists;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Artist() {
    }

    /**
     * 
     * @param artists
     */
    public Artist(Artists artists) {
        this.artists = artists;
    }

    /**
     * 
     * @return
     *     The artists
     */
    public Artists getArtists() {
        return artists;
    }

    /**
     * 
     * @param artists
     *     The artists
     */
    public void setArtists(Artists artists) {
        this.artists = artists;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
