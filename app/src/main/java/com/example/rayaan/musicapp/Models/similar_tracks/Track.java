
package com.example.rayaan.musicapp.Models.similar_tracks;

import com.example.rayaan.musicapp.Models.Image;

import java.util.ArrayList;
import java.util.List;

public class Track {

    private String name;
    private Integer playcount;
    private String mbid;
    private Double match;
    private String url;
    private Streamable streamable;
    private Integer duration;
    private Artist artist;
    private List<Image> image = new ArrayList<Image>();

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
    public Integer getPlaycount() {
        return playcount;
    }

    /**
     * 
     * @param playcount
     *     The playcount
     */
    public void setPlaycount(Integer playcount) {
        this.playcount = playcount;
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
     *     The match
     */
    public Double getMatch() {
        return match;
    }

    /**
     * 
     * @param match
     *     The match
     */
    public void setMatch(Double match) {
        this.match = match;
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
     *     The duration
     */
    public Integer getDuration() {
        return duration;
    }

    /**
     * 
     * @param duration
     *     The duration
     */
    public void setDuration(Integer duration) {
        this.duration = duration;
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

}
