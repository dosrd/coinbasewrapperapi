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
public class CoinbaseDataResponse {

    @SerializedName("pagination")
    @Expose
    private CoinbasePagesData pagination;
    @SerializedName("data")
    @Expose
    private CoinbaseLineData data = null;

    public CoinbasePagesData getPagination() {
        return pagination;
    }

    public void setPagination(CoinbasePagesData pagination) {
        this.pagination = pagination;
    }

    public CoinbaseLineData getData() {
        return data;
    }

    public void setData(CoinbaseLineData data) {
        this.data = data;
    }

    @Override
    public String toString() {
        Gson op = new GsonBuilder().setPrettyPrinting().create();
        return op.toJson(this);
    }
}
