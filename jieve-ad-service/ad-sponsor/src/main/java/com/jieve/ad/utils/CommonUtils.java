package com.jieve.ad.utils;

import org.apache.commons.codec.digest.DigestUtils;

/**
 * @author Jieve
 */
public class CommonUtils {

    private CommonUtils() {
    }

    public static String md5(String value){
        return DigestUtils.md5Hex(value).toUpperCase();
    }
}
