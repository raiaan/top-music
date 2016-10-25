
package com.example.rayaan.musicapp.Models.artist_info;

import com.google.gson.annotations.SerializedName;

public class Tag {

    @SerializedName("name")
    private String name;
    @SerializedName("url")
    private String url;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Tag() {
    }

    /**
     * 
     * @param name
     * @param url
     */
    public Tag(String name, String url) {
        this.name = name;
        this.url = url;
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
