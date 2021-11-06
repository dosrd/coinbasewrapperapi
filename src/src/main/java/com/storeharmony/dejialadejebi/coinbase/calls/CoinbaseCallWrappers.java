/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.storeharmony.dejialadejebi.coinbase.calls;

import com.storeharmony.dejialadejebi.coinbase.CoinCalls;
import com.storeharmony.dejialadejebi.coinbase.CoinbaseConnect;
import com.storeharmony.dejialadejebi.coinbase.CoinbaseCredentials;
import com.storeharmony.dejialadejebi.coinbase.CoinbaseException;
import com.storeharmony.dejialadejebi.coinbase.model.CoinbaseAddressResponse;
import com.storeharmony.dejialadejebi.coinbase.model.CoinbaseRequestBody;
import java.util.Map;

/**
 *
 * @author deji aladejebi
 */
public class CoinbaseCallWrappers extends CoinbaseConnect {

    public CoinbaseCallWrappers(CoinbaseCredentials cred) {
        super(cred);
    }

    public CoinbaseAddressResponse createBitcoinAddress(String addressTitle) throws Exception {
        String btcAccount = getBitcoinAccount();
        CoinbaseRequestBody bd = new CoinbaseRequestBody();
        bd.setName(addressTitle);

        return callAccount(CoinCalls.CREATE_ADDRESS, btcAccount, bd);
    }

    public String getAccountForTag(String tag) throws Exception {
        Map<String, String> act = getAccounts();
        if (act.isEmpty()) {
            throw new Exception("Account not found");
        }
        return act.get(tag);
    }

    public String getAccountForTag(Map<String, String> accMap, String tag) throws Exception {

        if (accMap.isEmpty()) {
            throw new Exception("Account not found");
        }
        return accMap.get(tag);
    }

    public String getBitcoinAccount(Map<String, String> accMap) throws CoinbaseException, Exception {

        if (accMap.isEmpty()) {
            throw new CoinbaseException("Account not found");
        }
        return accMap.get("BTC");
    }

    public String getBitcoinAccount() throws CoinbaseException, Exception {
        Map<String, String> act = getAccounts();
        if (act.isEmpty()) {
            throw new CoinbaseException("Account not found");
        }
        return act.get("BTC");
    }

    public String getAccountForCoin(Map<String, String> accMap, String coinTicker) throws CoinbaseException, Exception {

        if (accMap.isEmpty()) {
            throw new CoinbaseException("Account not found");
        }
        return accMap.get(coinTicker);
    }

    public String getAccountForCoin(String coinTicker) throws CoinbaseException, Exception {
        Map<String, String> act = getAccounts();
        if (act.isEmpty()) {
            throw new CoinbaseException("Account not found");
        }
        return act.get(coinTicker);
    }
}
