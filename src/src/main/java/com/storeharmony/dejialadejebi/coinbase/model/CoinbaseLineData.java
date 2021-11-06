package com.storeharmony.dejialadejebi.coinbase.model;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;

public class CoinbaseLineData {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("amount")
    @Expose
    private CoinbaseAmount amount;
    @SerializedName("native_amount")
    @Expose
    private CoinbaseAmount nativeAmount;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;
    @SerializedName("resource")
    @Expose
    private String resource;
    @SerializedName("resource_path")
    @Expose
    private String resourcePath;
    @SerializedName("network")
    @Expose
    private CoinbaseNetwork network;
    @SerializedName("from")
    @Expose
    private CoinbaseFromData from;

    @SerializedName("balance")
    @Expose
    private CoinbaseBalance balance;

    @SerializedName("native_balance")
    @Expose
    private CoinbaseBalance nativeBalance;

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
    @SerializedName("address")
    @Expose
    private String address;
    @SerializedName("address_info")
    @Expose
    private CoinbaseAddressInfo addressInfo;

    public String getId() {
        return id;
    }

    private String iso;
    private long epoch;

    public String getIso() {
        return iso;
    }

    public long getEpoch() {
        return epoch;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public CoinbaseAmount getAmount() {
        return amount;
    }

    public void setAmount(CoinbaseAmount amount) {
        this.amount = amount;
    }

    public CoinbaseAmount getNativeAmount() {
        return nativeAmount;
    }

    public void setNativeAmount(CoinbaseAmount nativeAmount) {
        this.nativeAmount = nativeAmount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public CoinbaseBalance getBalance() {
        return balance;
    }

    public void setBalance(CoinbaseBalance balance) {
        this.balance = balance;
    }

    public CoinbaseBalance getNativeBalance() {
        return nativeBalance;
    }

    public void setNativeBalance(CoinbaseBalance nativeBalance) {
        this.nativeBalance = nativeBalance;
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

    public CoinbaseNetwork getNetwork() {
        return network;
    }

    public void setNetwork(CoinbaseNetwork network) {
        this.network = network;
    }

    public CoinbaseFromData getFrom() {
        return from;
    }

    public void setFrom(CoinbaseFromData from) {
        this.from = from;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public CoinbaseAddressInfo getAddressInfo() {
        return addressInfo;
    }

    public void setAddressInfo(CoinbaseAddressInfo addressInfo) {
        this.addressInfo = addressInfo;
    }

    @Override
    public String toString() {
        Gson op = new GsonBuilder().setPrettyPrinting().create();
        return op.toJson(this);
    }

}
