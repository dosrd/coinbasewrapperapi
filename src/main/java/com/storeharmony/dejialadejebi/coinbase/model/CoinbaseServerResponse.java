/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.storeharmony.dejialadejebi.coinbase.model;

import com.storeharmony.dejialadejebi.coinbase.model.CoinbaseLineData;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 *
 * @author dabar
 */
public class CoinbaseServerResponse {
    
    private CoinbaseLineData data;

    @Override
    public String toString() {
        Gson op = new GsonBuilder().setPrettyPrinting().create();
        return op.toJson(this);
    }

    public CoinbaseLineData getData() {
        return data;
    }
    
}
