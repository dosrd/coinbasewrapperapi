/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.storeharmony.dejialadejebi.coinbase.model;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 *
 * @author dabar
 */
public class CoinbaseOption {

    @SerializedName("text")
    @Expose
    private String text;
    @SerializedName("style")
    @Expose
    private String style;
    @SerializedName("id")
    @Expose
    private String id;

    public String getText() {
        return text;
    }
@Override
    public String toString() {
        Gson op = new GsonBuilder().setPrettyPrinting().create();
        return op.toJson(this);
    }
    public void setText(String text) {
        this.text = text;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
