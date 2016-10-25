
package com.example.rayaan.musicapp.Models.artist_info;


import com.google.gson.annotations.SerializedName;

public class Bio {

    @SerializedName("links")
    private Links links;
    @SerializedName("published")
    private String published;
    @SerializedName("summary")
    private String summary;
    @SerializedName("content")
    private String content;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Bio() {
    }

    /**
     * 
     * @param content
     * @param summary
     * @param links
     * @param published
     */
    public Bio(Links links, String published, String summary, String content) {
        this.links = links;
        this.published = published;
        this.summary = summary;
        this.content = content;
    }

    /**
     * 
     * @return
     *     The links
     */
    public Links getLinks() {
        return links;
    }

    /**
     * 
     * @param links
     *     The links
     */
    public void setLinks(Links links) {
        this.links = links;
    }

    /**
     * 
     * @return
     *     The published
     */
    public String getPublished() {
        return published;
    }

    /**
     * 
     * @param published
     *     The published
     */
    public void setPublished(String published) {
        this.published = published;
    }

    /**
     * 
     * @return
     *     The summary
     */
    public String getSummary() {
        return summary;
    }

    /**
     * 
     * @param summary
     *     The summary
     */
    public void setSummary(String summary) {
        this.summary = summary;
    }

    /**
     * 
     * @return
     *     The content
     */
    public String getContent() {
        return content;
    }

    /**
     * 
     * @param content
     *     The content
     */
    public void setContent(String content) {
        this.content = content;
    }

}
