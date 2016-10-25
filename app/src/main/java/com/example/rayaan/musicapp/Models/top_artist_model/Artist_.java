
package com.example.rayaan.musicapp.Models.top_artist_model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Artist_ {

    private String name;
    private String playcount;
    private String listeners;
    private String mbid;
    private String url;
    private String streamable;
    private List<Image> image = new ArrayList<Image>();
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Artist_() {
    }

    /**
     * 
     * @param listeners
     * @param mbid
     * @param name
     * @param image
     * @param streamable
     * @param playcount
     * @param url
     */
    public Artist_(String name, String playcount, String listeners, String mbid, String url, String streamable, List<Image> image) {
        this.name = name;
        this.playcount = playcount;
        this.listeners = listeners;
        this.mbid = mbid;
        this.url = url;
        this.streamable = streamable;
        this.image = image;
    }

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

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
