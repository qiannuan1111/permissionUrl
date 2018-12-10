package com.sunny.permission.Utils;


import com.sunny.permission.exception.BaseException;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5 {

    public String getMD5ofstr(String password){
        try {
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            password = new BigInteger(1, md5.digest(password.getBytes())).toString(32);
            password = new String(password.getBytes());
        } catch (NoSuchAlgorithmException e) {
            new BaseException("MD5出现异常");
            e.printStackTrace();
        }
        return password;
    };

}
