package com.ShopifyStore.utility;

import org.apache.commons.codec.binary.Base64;

/**
 * @author manup on 6/30/2022
 */
public class EncodingAndDecoding {

    public String encodeString(String str) {
        byte[] encodedString = Base64.encodeBase64(str.getBytes());
        return new String(encodedString);
    }

    public  String decodedString(String encodedString){
        byte[] decodedString = Base64.decodeBase64(encodedString);
        return new String(decodedString);

    }
}
