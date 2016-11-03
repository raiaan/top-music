package com.example.rayaan.musicapp.Models.similar_tracks;

public class Artist {

    private String name;
    private String mbid;
    private String url;

    /**
     * 
     * @return
     *     The name
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return
     *     The mbid
     */
    public String getMbid() {
        return mbid;
    }

    /**
     * 
     * @param mbid
     *     The mbid
     */
    public void setMbid(String mbid) {
        this.mbid = mbid;
    }

    /**
     * 
     * @return
     *     The url
     */
    public String getUrl() {
        return url;
    }

    /**
     * 
     * @param url
     *     The url
     */
    public void setUrl(String url) {
        this.url = url;
    }

}
