package com.github.youshu.utils;

/**
 * @Description:
 * @Author: fun
 * @Date: 2021/11/30 9:53
 */

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.util.Random;

public class YoushuApiSignature {
    String app_id ;
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
            SecretKeySpec secretKey = new SecretKeySpec(app_secret.getBytes("UTF-8"), mac.getAlgorithm());
            mac.init(secretKey);
            byte[] bytes = mac.doFinal(str.getBytes("UTF-8"));
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

    public static void main(String[] args) throws Exception {
        System.out.println(new YoushuApiSignature().sign());
    }
}