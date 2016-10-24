
package com.example.rayaan.musicapp.artist_info;


import com.google.gson.annotations.SerializedName;

public class Stats {
    @SerializedName("listeners")
    private String listeners;
    @SerializedName("playcount")
    private String playcount;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Stats() {
    }

    /**
     * 
     * @param listeners
     * @param playcount
     */
    public Stats(String listeners, String playcount) {
        this.listeners = listeners;
        this.playcount = playcount;
    }

    /**
     * 
     * @return
     *     The listeners
     */
    public String getListeners() {
        return listeners;
    }

    /**
     * 
     * @param listeners
     *     The listeners
     */
    public void setListeners(String listeners) {
        this.listeners = listeners;
    }

    /**
     * 
     * @return
     *     The playcount
     */
    public String getPlaycount() {
        return playcount;
    }

    /**
     * 
     * @param playcount
     *     The playcount
     */
    public void setPlaycount(String playcount) {
        this.playcount = playcount;
    }

}
