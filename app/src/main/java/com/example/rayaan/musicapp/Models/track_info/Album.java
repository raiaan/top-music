package com.example.rayaan.musicapp.Models.track_info;


import com.example.rayaan.musicapp.Models.Image;

import java.util.ArrayList;
import java.util.List;

public class Album {

    private String artist;
    private String title;
    private String mbid;
    private String url;
    private List<Image> image = new ArrayList<Image>();
    private Attr attr;

    /**
     * 
     * @return
     *     The artist
     */
    public String getArtist() {
        return artist;
    }

    /**
     * 
     * @param artist
     *     The artist
     */
    public void setArtist(String artist) {
        this.artist = artist;
    }

    /**
     * 
     * @return
     *     The title
     */
    public String getTitle() {
        return title;
    }

    /**
     * 
     * @param title
     *     The title
     */
    public void setTitle(String title) {
        this.title = title;
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
