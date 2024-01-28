package com.tama;

import java.util.HashMap;
import java.util.Map;

public class MapMain {
    public static void main(String[] args) {
        Map<String, String> userMap = new HashMap<>();
        userMap.put("京都", "名物は抹茶です。");
        userMap.put("香川", "名物はうどんです。");
        userMap.put("北海道", "名物は海鮮です。");
        userMap.put("大阪", "名物はたこ焼きです。");

        System.out.println(userMap.get("大阪"));

        try {
            System.out.println(userMap.get("東京"));
            {
                throw new Exception();
            }
        } catch (Exception e) {
            System.out.println("該当なし");
        }
    }
}
