package com.example.rayaan.musicapp.Models.atrist_top_track;

import com.example.rayaan.musicapp.Models.Image;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Track implements Serializable {

    private String name;
    private String playcount;
    private String listeners;
    private String mbid;
    private String url;
    private String streamable;
    private Artist artist;
    private List<Image> image = new ArrayList<Image>();
    private Attr attr;

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
     *     The streamable
     */
    public String getStreamable() {
        return streamable;
    }

    /**
     * 
     * @param streamable
     *     The streamable
     */
    public void setStreamable(String streamable) {
        this.streamable = streamable;
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
     *     The image
     */
    public List<Image> getImage() {
        return image;
    }

    /**
     * 
     * @param image
     *     The image
     */
    public void setImage(List<Image> image) {
        this.image = image;
    }

    /**
     * 
     * @return
     *     The attr
     */
    public Attr getAttr() {
        return attr;
    }

    /**
     * 
     * @param attr
     *     The @attr
     */
    public void setAttr(Attr attr) {
        this.attr = attr;
    }

}
