
package com.example.rayaan.musicapp.Models.artist_info;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Artist__ implements Serializable {

    @SerializedName("name")
    private String name;
    @SerializedName("url")
    private String url;
    @SerializedName("image")
    private List<Image_> image = new ArrayList<Image_>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Artist__() {
    }

    /**
     * 
     * @param name
     * @param image
     * @param url
     */
    public Artist__(String name, String url, List<Image_> image) {
        this.name = name;
        this.url = url;
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
    public List<Image_> getImage() {
        return image;
    }

    /**
     * 
     * @param image
     *     The image
     */
    public void setImage(List<Image_> image) {
        this.image = image;
    }

}
