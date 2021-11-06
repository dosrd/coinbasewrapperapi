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
public class CoinbaseAddressResponse {

    @SerializedName("pagination")
    @Expose
    private CoinbasePagesData pagination;
    @SerializedName("data")
    @Expose
    private CoinbaseAddressData data = null;

    public CoinbasePagesData getPagination() {
        return pagination;
    }

    public void setPagination(CoinbasePagesData pagination) {
        this.pagination = pagination;
    }

    public CoinbaseAddressData getData() {
        return data;
    }

    public void setData(CoinbaseAddressData data) {
        this.data = data;
    }

    @Override
    public String toString() {
        Gson op = new GsonBuilder().setPrettyPrinting().create();
        return op.toJson(this);
    }
}
