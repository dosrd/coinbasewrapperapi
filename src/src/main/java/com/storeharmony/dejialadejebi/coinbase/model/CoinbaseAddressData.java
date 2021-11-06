package com.storeharmony.dejialadejebi.coinbase.model;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;

public class CoinbaseAddressData {

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

    @SerializedName("uri_scheme")
    @Expose
    private String uriScheme;

    @SerializedName("warnings")
    @Expose
    private List<CoinbaseWarning> warnings = null;
    @SerializedName("deposit_uri")
    @Expose
    private String depositUri;
    @SerializedName("callback_url")
    @Expose
    private Object callbackUrl;

    @SerializedName("address_info")
    @Expose
    private CoinbaseAddressInfo addressInfo;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUriScheme() {
        return uriScheme;
    }

    public void setUriScheme(String uriScheme) {
        this.uriScheme = uriScheme;
    }

    public List<CoinbaseWarning> getWarnings() {
        return warnings;
    }

    public void setWarnings(List<CoinbaseWarning> warnings) {
        this.warnings = warnings;
    }

    public String getDepositUri() {
        return depositUri;
    }

    public void setDepositUri(String depositUri) {
        this.depositUri = depositUri;
    }

    public Object getCallbackUrl() {
        return callbackUrl;
    }

    public void setCallbackUrl(Object callbackUrl) {
        this.callbackUrl = callbackUrl;
    }

    public CoinbaseAddressInfo getAddressInfo() {
        return addressInfo;
    }

    public void setAddressInfo(CoinbaseAddressInfo addressInfo) {
        this.addressInfo = addressInfo;
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
