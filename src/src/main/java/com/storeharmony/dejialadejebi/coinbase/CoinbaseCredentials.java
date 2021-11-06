/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.storeharmony.dejialadejebi.coinbase;

/**
 *
 * @author deji aladejebi
 */
public class CoinbaseCredentials {
 
    
    private final String secret;
    private final String apikey;

    public CoinbaseCredentials(String secret, String apikey) {
        this.secret = secret;
        this.apikey = apikey;
    }

    public String getSecret() {
        return secret;
    }

    public String getApiKey() {
        return apikey;
    }
    
    
}
