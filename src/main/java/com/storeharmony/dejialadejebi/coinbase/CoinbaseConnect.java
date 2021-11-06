/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.storeharmony.dejialadejebi.coinbase;

import com.storeharmony.dejialadejebi.coinbase.model.CoinbaseRequestBody;
import com.storeharmony.dejialadejebi.coinbase.model.CoinbaseServerResponse;
import com.storeharmony.dejialadejebi.coinbase.model.CoinbaseArrayDataResponse;
import com.storeharmony.dejialadejebi.coinbase.model.CoinbaseLineData;
import com.storeharmony.dejialadejebi.coinbase.model.CoinbaseAddressResponse;
import com.google.gson.Gson;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/**
 * 'CB-ACCESS-SIGN': signature, 'CB-ACCESS-TIMESTAMP': timestamp,
 * 'CB-ACCESS-KEY': apiKey, 'CB-VERSION': '2015-07-22'
 *
 * @author deji aladejebi
 */
public class CoinbaseConnect {

    private CoinbaseCredentials cred;

    public static enum APIMode {
        TEST, LIVE

    }
    private final static String COINBASE_APIBASE_URL = "https://api.coinbase.com";

    public static final MediaType JSON
            = MediaType.parse("application/json; charset=utf-8");

    public CoinbaseConnect(CoinbaseCredentials cred) {
        this.cred = cred;

    }

    protected Map<String, String> getAccounts() throws Exception {
        Map<String, String> accountsMap;
        accountsMap = new HashMap<>();
        CoinbaseArrayDataResponse bdata;

        bdata = call(CoinCalls.ACCOUNTS);
        List<CoinbaseLineData> accounts = bdata.getData();

        for (CoinbaseLineData account : accounts) {
            accountsMap.put(account.getBalance().getCurrency(), account.getId());
        }

        return accountsMap;
    }

    protected CoinbaseArrayDataResponse call(CoinCalls call) throws Exception {
        return call(call, new CoinbaseRequestBody());
    }

    protected CoinbaseArrayDataResponse call(CoinCalls call, CoinbaseRequestBody body) throws Exception {
        CoinbaseLineData tt = getServerTime();

        String sign;
        switch (call.getType()) {
            case GET:
                sign = call.createSignature(cred.getSecret(), tt.getEpoch());
                break;
            case POST:
                sign = call.createSignature(cred.getSecret(), tt.getEpoch(), body);
                break;
            default:
                sign = call.createSignature(cred.getSecret(), tt.getEpoch());
        }

        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        Request request = new Request.Builder()
                .url(COINBASE_APIBASE_URL
                        + call.getUrl())
                .method(call.getType().name(), call.getType() == RestCallType.GET ? null : RequestBody.create(JSON, body.toString()))
                .addHeader("CB-ACCESS-SIGN", sign)
                .addHeader("CB-ACCESS-TIMESTAMP", "" + tt.getEpoch())
                .addHeader("CB-ACCESS-KEY", cred.getApiKey())
                .addHeader("CB-VERSION", "2017-02-12")
                .build();
        Response response = client.newCall(request).execute();
        String data = response.body().string();
        Gson gs = new Gson();
        CoinbaseArrayDataResponse rate = gs.fromJson(data, CoinbaseArrayDataResponse.class);
        return rate;
    }

    public final CoinbaseAddressResponse callAccount(CoinCalls call, String account, CoinbaseRequestBody body) throws Exception {
        CoinbaseLineData tt = getServerTime();

        String sign;
        switch (call.getType()) {
            case GET:
                sign = call.createSignature(cred.getSecret(), tt.getEpoch(), account);
                break;
            case POST:
                sign = call.createSignature(cred.getSecret(), tt.getEpoch(), account, body);
                break;
            default:
                sign = call.createSignature(cred.getSecret(), tt.getEpoch(), account);
        }

        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        String url = COINBASE_APIBASE_URL
                + call.getUrlForVariables(account);
        Request request = new Request.Builder()
                .url(url)
                .method(call.getType().name(), call.getType() == RestCallType.GET ? null : RequestBody.create(JSON, body.toString()))
                .addHeader("CB-ACCESS-SIGN", sign)
                .addHeader("CB-ACCESS-TIMESTAMP", "" + tt.getEpoch())
                .addHeader("CB-ACCESS-KEY", cred.getApiKey())
                .addHeader("CB-VERSION", "2017-02-12")
                .build();
        Response response = client.newCall(request).execute();
        String data = response.body().string();
        Gson gs = new Gson();
        CoinbaseAddressResponse rate = gs.fromJson(data, CoinbaseAddressResponse.class);
        return rate;
    }

    public final CoinbaseLineData getServerTime() throws IOException {
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        CoinCalls call = CoinCalls.GET_TIME;
        Request request = new Request.Builder()
                .url(COINBASE_APIBASE_URL
                        + call.getUrl())
                .method(call.getType().name(), null)
                .build();
        Response response = client.newCall(request).execute();

        String data = response.body().string();
        Gson gs = new Gson();
        CoinbaseServerResponse rate = gs.fromJson(data, CoinbaseServerResponse.class);
        return rate.getData();
    }
}
