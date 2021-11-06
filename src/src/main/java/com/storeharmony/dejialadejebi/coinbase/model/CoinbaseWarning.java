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
import java.util.List;

/**
 *
 * @author dabar
 */
public class CoinbaseWarning {

    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("details")
    @Expose
    private String details;
    @SerializedName("image_url")
    @Expose
    private String imageUrl;
    @SerializedName("options")
    @Expose
    private List<CoinbaseOption> options = null;

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        Gson op = new GsonBuilder().setPrettyPrinting().create();
        return op.toJson(this);
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public List<CoinbaseOption> getOptions() {
        return options;
    }

    public void setOptions(List<CoinbaseOption> options) {
        this.options = options;
    }
}
