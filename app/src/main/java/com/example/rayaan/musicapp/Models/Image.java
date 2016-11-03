package com.example.rayaan.musicapp.Models;


import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Image implements Serializable{

    @SerializedName("#text")
    private String text;
    private String size;

    /**
     * 
     * @return
     *     The text
     */
    public String getText() {
        return text;
    }

    /**
     * 
     * @param text
     *     The #text
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * 
     * @return
     *     The size
     */
    public String getSize() {
        return size;
    }

    /**
     * 
     * @param size
     *     The size
     */
    public void setSize(String size) {
        this.size = size;
    }

}
