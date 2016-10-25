
package com.example.rayaan.musicapp.Models.artist_info;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Tags {

    @SerializedName("tag")
    private List<Tag> tag = new ArrayList<Tag>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Tags() {
    }

    /**
     * 
     * @param tag
     */
    public Tags(List<Tag> tag) {
        this.tag = tag;
    }

    /**
     * 
     * @return
     *     The tag
     */
    public List<Tag> getTag() {
        return tag;
    }

    /**
     * 
     * @param tag
     *     The tag
     */
    public void setTag(List<Tag> tag) {
        this.tag = tag;
    }

}
