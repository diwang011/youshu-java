package com.github.youshu.utils;

/**
 * @Description:
 * @Author: fun
 * @Date: 2021/11/30 9:53
 */

import cn.hutool.core.date.DateUtil;
import cn.hutool.crypto.SecureUtil;
import cn.hutool.crypto.digest.MD5;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.util.Random;

public class YoushuApiSignature {
    String app_id;
    String app_secret;
    StringBuilder hexStringBuilder = new StringBuilder();

    public YoushuApiSignature() {
    }

    /**
     * Init with your key pair.
     *
     * @param app_id
     * @param app_secret
     */
    public YoushuApiSignature(String app_id, String app_secret) {
        this.app_id = app_id;
        this.app_secret = app_secret;
    }

    public static void main(String[] args) throws Exception {
        System.out.println(new YoushuApiSignature().sign1());
    }

    private String sign1() {
        String str="apiKey=98765432&method=platformApi/v1/order/sale/receive&secret=23456789&timestamp=1567664598714";
        return SecureUtil.md5(str);
    }

    /**
     * app_id=${app_id}&nonce=${nonce}&sign=sha256&timestamp=${timestamp}&signature=${signature}
     *
     * @return
     * @throws Exception
     */
    public String sign() {
        Random random = new Random(System.currentTimeMillis());
        String timestamp = String.valueOf(System.currentTimeMillis() / 1000);
        String nonce = String.valueOf(Math.abs(random.nextLong()));
        try {
            String str = String.format("app_id=%s&nonce=%s&sign=sha256&timestamp=%s", app_id, nonce, timestamp);
            Mac mac = Mac.getInstance("HmacSHA256");
            SecretKeySpec secretKey = new SecretKeySpec(app_secret.getBytes(StandardCharsets.UTF_8), mac.getAlgorithm());
            mac.init(secretKey);
            byte[] bytes = mac.doFinal(str.getBytes(StandardCharsets.UTF_8));
            hexStringBuilder.setLength(0);
            for (int i = 0; i < bytes.length; ++i) {
                String hex = Integer.toHexString(0xff & bytes[i]);
                if (hex.length() == 1) {
                    hexStringBuilder.append('0');
                }
                hexStringBuilder.append(hex);
            }
            String signature = hexStringBuilder.toString();
            return str + "&signature=" + signature;
        } catch (Exception e) {

        }
        return "";
    }
}