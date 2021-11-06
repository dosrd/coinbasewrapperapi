/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.storeharmony.dejialadejebi.coinbase;

import com.storeharmony.dejialadejebi.coinbase.model.CoinbaseRequestBody;

/**
 *  
 *
 * @author deji aladejebi
 */
public enum CoinCalls {
    ACCOUNTS("/v2/accounts", RestCallType.GET),
    GET_TIME("/v2/time", RestCallType.GET),
    CREATE_ADDRESS("/v2/accounts/:account_id/addresses", RestCallType.POST),
    LIST_ADDRESS_TRANSACTION("/v2/accounts/:account_id/addresses/:address_id/transactions", RestCallType.GET);
    private final String url;
    private final RestCallType type;

    private CoinCalls(String url, RestCallType type) {
        this.url = url;
        this.type = type;
    }

    public RestCallType getType() {
        return type;
    }

    public String getUrl() {
        return url;
    }

    public String getUrlForVariables(String accountId) {
        return url.replaceAll(":account_id", accountId);
    }

    public String getUrlForVariables(String accountId, String addressId) {
        return url.replaceAll(":address_id", addressId);
    }

    public String getUrl(String path) {
        return url + "/" + path;
    }

    public String createSignature(String apiSecret, long timestamp, String accountId) throws Exception {

        String message = timestamp + getType().name() + getUrlForVariables(accountId) + "";

        byte[] hmacmessage = ConnectUtils.hmacSha256(message, apiSecret.getBytes());
        return ConnectUtils.binHexaData(hmacmessage);
    }

    public String createSignature(String apiSecret, long timestamp, String accountId, CoinbaseRequestBody body) throws Exception {

        String message = timestamp + getType().name() + getUrlForVariables(accountId) + body.toString();

        byte[] hmacmessage = ConnectUtils.hmacSha256(message, apiSecret.getBytes());
        return ConnectUtils.binHexaData(hmacmessage);
    }

    public String createSignature(String apiSecret, long timestamp, String accountId, String addressId) throws Exception {

        String message = timestamp + getType().name() + getUrlForVariables(accountId, addressId) + "";

        byte[] hmacmessage = ConnectUtils.hmacSha256(message, apiSecret.getBytes());
        return ConnectUtils.binHexaData(hmacmessage);
    }

    public String createSignature(String apiSecret, long timestamp) throws Exception {

        String message = timestamp + getType().name() + getUrl() + "";
        byte[] hmacmessage = ConnectUtils.hmacSha256(message, apiSecret.getBytes());
        return ConnectUtils.binHexaData(hmacmessage);
    }

    public String createSignature(String apiSecret, long timestamp, CoinbaseRequestBody body) throws Exception {

        String message = timestamp + getType().name() + getUrl() + body.toString();

        byte[] hmacmessage = ConnectUtils.hmacSha256(message, apiSecret.getBytes());
        return ConnectUtils.binHexaData(hmacmessage);
    }

}
