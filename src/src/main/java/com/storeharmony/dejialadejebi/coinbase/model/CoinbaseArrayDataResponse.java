package com.storeharmony.dejialadejebi.coinbase.model;

import com.storeharmony.dejialadejebi.coinbase.model.CoinbaseLineData;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CoinbaseArrayDataResponse {

    @SerializedName("pagination")
    @Expose
    private CoinbasePagesData pagination;
    @SerializedName("data")
    @Expose
    private List<CoinbaseLineData> data = null;

    public CoinbasePagesData getPagination() {
        return pagination;
    }

    public void setPagination(CoinbasePagesData pagination) {
        this.pagination = pagination;
    }

    public List<CoinbaseLineData> getData() {
        return data;
    }

    public void setData(List<CoinbaseLineData> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        Gson op = new GsonBuilder().setPrettyPrinting().create();
        return op.toJson(this);
    }
}
