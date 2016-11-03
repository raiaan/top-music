
package com.example.rayaan.musicapp.Models.track_info;

import java.util.ArrayList;
import java.util.List;

public class Toptags {

    private List<Tag> tag = new ArrayList<Tag>();

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
