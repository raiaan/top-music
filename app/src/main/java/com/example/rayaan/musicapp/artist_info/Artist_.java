
package com.example.rayaan.musicapp.artist_info;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Artist_ {

    @SerializedName("name")
    private String name;
    @SerializedName("mbid")
    private String mbid;
    @SerializedName("url")
    private String url;
    @SerializedName("image")
    private List<Image> image = new ArrayList<Image>();
    @SerializedName("streamable")
    private String streamable;
    @SerializedName("ontour")
    private String ontour;
    @SerializedName("stats")
    private Stats stats;
    @SerializedName("similar")
    private Similar similar;
    @SerializedName("tags")
    private Tags tags;
    @SerializedName("bio")
    private Bio bio;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Artist_() {
    }

    /**
     * 
     * @param tags
     * @param ontour
     * @param mbid
     * @param bio
     * @param stats
     * @param name
     * @param streamable
     * @param image
     * @param url
     * @param similar
     */
    public Artist_(String name, String mbid, String url, List<Image> image, String streamable, String ontour, Stats stats, Similar similar, Tags tags, Bio bio) {
        this.name = name;
        this.mbid = mbid;
        this.url = url;
        this.image = image;
        this.streamable = streamable;
        this.ontour = ontour;
        this.stats = stats;
        this.similar = similar;
        this.tags = tags;
        this.bio = bio;
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
     *     The ontour
     */
    public String getOntour() {
        return ontour;
    }

    /**
     * 
     * @param ontour
     *     The ontour
     */
    public void setOntour(String ontour) {
        this.ontour = ontour;
    }

    /**
     * 
     * @return
     *     The stats
     */
    public Stats getStats() {
        return stats;
    }

    /**
     * 
     * @param stats
     *     The stats
     */
    public void setStats(Stats stats) {
        this.stats = stats;
    }

    /**
     * 
     * @return
     *     The similar
     */
    public Similar getSimilar() {
        return similar;
    }

    /**
     * 
     * @param similar
     *     The similar
     */
    public void setSimilar(Similar similar) {
        this.similar = similar;
    }

    /**
     * 
     * @return
     *     The tags
     */
    public Tags getTags() {
        return tags;
    }

    /**
     * 
     * @param tags
     *     The tags
     */
    public void setTags(Tags tags) {
        this.tags = tags;
    }

    /**
     * 
     * @return
     *     The bio
     */
    public Bio getBio() {
        return bio;
    }

    /**
     * 
     * @param bio
     *     The bio
     */
    public void setBio(Bio bio) {
        this.bio = bio;
    }

}
