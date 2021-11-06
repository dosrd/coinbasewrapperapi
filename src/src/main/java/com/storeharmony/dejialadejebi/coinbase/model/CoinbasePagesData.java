package com.storeharmony.dejialadejebi.coinbase.model;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CoinbasePagesData {

    @SerializedName("ending_before")
    @Expose
    private Object endingBefore;
    @SerializedName("starting_after")
    @Expose
    private Object startingAfter;
    @SerializedName("limit")
    @Expose
    private Integer limit;
    @SerializedName("order")
    @Expose
    private String order;
    @SerializedName("previous_uri")
    @Expose
    private Object previousUri;
    @SerializedName("next_uri")
    @Expose
    private Object nextUri;

    public Object getEndingBefore() {
        return endingBefore;
    }

    @Override
    public String toString() {
        Gson op = new GsonBuilder().setPrettyPrinting().create();
        return op.toJson(this);
    }

    public void setEndingBefore(Object endingBefore) {
        this.endingBefore = endingBefore;
    }

    public Object getStartingAfter() {
        return startingAfter;
    }

    public void setStartingAfter(Object startingAfter) {
        this.startingAfter = startingAfter;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public Object getPreviousUri() {
        return previousUri;
    }

    public void setPreviousUri(Object previousUri) {
        this.previousUri = previousUri;
    }

    public Object getNextUri() {
        return nextUri;
    }

    public void setNextUri(Object nextUri) {
        this.nextUri = nextUri;
    }

}
