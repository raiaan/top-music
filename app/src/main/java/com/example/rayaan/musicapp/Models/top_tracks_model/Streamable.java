package com.example.rayaan.musicapp.Models.top_tracks_model;

import java.io.Serializable;

public class Streamable implements Serializable {

    private String text;
    private String fulltrack;

    /**
     * 
     * @return
     *     The text
     */
    public String getText() {
        return text;
    }

    /**
     * 
     * @param text
     *     The #text
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * 
     * @return
     *     The fulltrack
     */
    public String getFulltrack() {
        return fulltrack;
    }

    /**
     * 
     * @param fulltrack
     *     The fulltrack
     */
    public void setFulltrack(String fulltrack) {
        this.fulltrack = fulltrack;
    }

}
