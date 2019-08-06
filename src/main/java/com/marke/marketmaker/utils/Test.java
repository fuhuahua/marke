package com.marke.marketmaker.utils;

import org.jsoup.Connection;

import java.io.IOException;

public class Test {

    public static void main(String[] args) {

//        String param = "{\"symbol\":\"ethusdt\",\"size\":2}";
//        String param = "{}";
//       String result =  HttpUtil.doPost("https://api.huobi.br.com/market/history/trade?symbol=ethusdt&size=2",param,"utf-8");
//        System.out.println(result);
        try {
           Connection.Response response =  HttpUtil.get("https://api.huobi.br.com/market/history/trade?symbol=ethusdt&size=2");
            System.out.println(response.body());
        }catch (IOException e){
            System.out.println(e.getMessage());
        }


    }
}
