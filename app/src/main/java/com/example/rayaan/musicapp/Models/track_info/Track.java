
package com.example.rayaan.musicapp.Models.track_info;


public class Track {

    private String name;
    private String mbid;
    private String url;
    private String duration;
    private Streamable streamable;
    private String listeners;
    private String playcount;
    private Artist artist;
    private Album album;
    private Toptags toptags;
    private Wiki wiki;

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

    /**
     * 
     * @return
     *     The duration
     */
    public String getDuration() {
        return duration;
    }

    /**
     * 
     * @param duration
     *     The duration
     */
    public void setDuration(String duration) {
        this.duration = duration;
    }

    /**
     * 
     * @return
     *     The streamable
     */
    public Streamable getStreamable() {
        return streamable;
    }

    /**
     * 
     * @param streamable
     *     The streamable
     */
    public void setStreamable(Streamable streamable) {
        this.streamable = streamable;
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

    /**
     * 
     * @return
     *     The artist
     */
    public Artist getArtist() {
        return artist;
    }

    /**
     * 
     * @param artist
     *     The artist
     */
    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    /**
     * 
     * @return
     *     The album
     */
    public Album getAlbum() {
        return album;
    }

    /**
     * 
     * @param album
     *     The album
     */
    public void setAlbum(Album album) {
        this.album = album;
    }

    /**
     * 
     * @return
     *     The toptags
     */
    public Toptags getToptags() {
        return toptags;
    }

    /**
     * 
     * @param toptags
     *     The toptags
     */
    public void setToptags(Toptags toptags) {
        this.toptags = toptags;
    }

    /**
     * 
     * @return
     *     The wiki
     */
    public Wiki getWiki() {
        return wiki;
    }

    /**
     * 
     * @param wiki
     *     The wiki
     */
    public void setWiki(Wiki wiki) {
        this.wiki = wiki;
    }

}
