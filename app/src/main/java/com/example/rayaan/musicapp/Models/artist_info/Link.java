
package com.example.rayaan.musicapp.Models.artist_info;


import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Link implements Serializable {

    @SerializedName("#text")
    private String _text;
    @SerializedName("rel")
    private String rel;
    @SerializedName("href")
    private String href;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Link() {
    }

    /**
     * 
     * @param _text
     * @param rel
     * @param href
     */
    public Link(String _text, String rel, String href) {
        this._text = _text;
        this.rel = rel;
        this.href = href;
    }

    /**
     * 
     * @return
     *     The _text
     */
    public String get_text() {
        return _text;
    }

    /**
     * 
     * @param _text
     *     The #text
     */
    public void set_text(String _text) {
        this._text = _text;
    }

    /**
     * 
     * @return
     *     The rel
     */
    public String getRel() {
        return rel;
    }

    /**
     * 
     * @param rel
     *     The rel
     */
    public void setRel(String rel) {
        this.rel = rel;
    }

    /**
     * 
     * @return
     *     The href
     */
    public String getHref() {
        return href;
    }

    /**
     * 
     * @param href
     *     The href
     */
    public void setHref(String href) {
        this.href = href;
    }

}
