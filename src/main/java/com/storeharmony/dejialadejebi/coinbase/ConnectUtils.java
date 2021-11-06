/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.storeharmony.dejialadejebi.coinbase;

import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/**
 *
 * @author deji aladejebi
 */
public class ConnectUtils {

    private static final String HMAC_SHA_256 = "HmacSHA256";
    private static final String UTF_8 = "UTF-8";

    public static byte[] hmacSha256(final String data, final byte[] key)
            throws NoSuchAlgorithmException, InvalidKeyException, IllegalStateException, UnsupportedEncodingException {
        final Mac mac = Mac.getInstance(HMAC_SHA_256);
        mac.init(new SecretKeySpec(key, HMAC_SHA_256));
        return mac.doFinal(data.getBytes(UTF_8));
    }

    public static String binHexaData(byte[] data) {
        if (data == null) {
            return "";
        }
        StringBuilder builder = new StringBuilder();
        String dataHex = "";
        for (byte b : data) {
            if (b >= 0) {
                dataHex = Integer.toHexString(b);
            }
            if (b < 0) {
                dataHex = Integer.toHexString(b).substring(6);
            }

            if (dataHex.length() == 1) {
                builder.append(0).append(dataHex);
            } else {
                builder.append(dataHex);
            }
        }
        return builder.toString();
    }
}
