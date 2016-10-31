
package com.example.rayaan.musicapp.Models.top_artist_model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("serial")
public class Image implements Serializable {

    @SerializedName("#text")
    private String text;
    private String size;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();


    public Image() {
    }

    public Image(String text, String size) {
        this.text = text;
        this.size = size;
    }
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
