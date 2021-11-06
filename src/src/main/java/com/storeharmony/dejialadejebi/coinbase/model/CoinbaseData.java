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
public class CoinbaseData {
    
    private String iso;
    private long epoch;

    public String getIso() {
        return iso;
    }

    public long getEpoch() {
        return epoch;
    }
    @SerializedName(value = "id")
    @Expose
    private String id;
    @SerializedName(value = "address")
    @Expose
    private String address;
    @SerializedName(value = "name")
    @Expose
    private String name;
    @SerializedName(value = "created_at")
    @Expose
    private String createdAt;
    @SerializedName(value = "updated_at")
    @Expose
    private String updatedAt;
    @SerializedName(value = "network")
    @Expose
    private String network;
    @SerializedName(value = "resource")
    @Expose
    private String resource;
    @SerializedName(value = "resource_path")
    @Expose
    private String resourcePath;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getNetwork() {
        return network;
    }

    public void setNetwork(String network) {
        this.network = network;
    }

    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }

    public String getResourcePath() {
        return resourcePath;
    }

    public void setResourcePath(String resourcePath) {
        this.resourcePath = resourcePath;
    }

    @Override
    public String toString() {
        Gson op = new GsonBuilder().setPrettyPrinting().create();
        return op.toJson(this);
    }
    
}
