
package com.example.rayaan.musicapp.artist_info;


import com.google.gson.annotations.SerializedName;

public class Image {
    @SerializedName("#text")
    private String _text;
    @SerializedName("size")
    private String size;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Image() {
    }

    /**
     * 
     * @param _text
     * @param size
     */
    public Image(String _text, String size) {
        this._text = _text;
        this.size = size;
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
