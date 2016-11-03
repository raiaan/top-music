
package com.example.rayaan.musicapp.Models.artist_info;


import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Links implements Serializable {

    @SerializedName("link")
    private Link link;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Links() {
    }

    /**
     * 
     * @param link
     */
    public Links(Link link) {
        this.link = link;
    }

    /**
     * 
     * @return
     *     The link
     */
    public Link getLink() {
        return link;
    }

    /**
     * 
     * @param link
     *     The link
     */
    public void setLink(Link link) {
        this.link = link;
    }

}
