package com.marke.marketmaker.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.marke.marketmaker.domain.Trade;
import org.jsoup.Connection;

import java.io.IOException;

public class Test {

    public static void main(String[] args) {

//        String param = "{\"symbol\":\"ethusdt\",\"size\":2}";
//        String param = "{}";
//       String result =  HttpUtil.doPost("https://api.huobi.br.com/market/history/trade?symbol=ethusdt&size=2",param,"utf-8");
//        System.out.println(result);
        try {
           Connection.Response response =  HttpUtil.get("https://api.huobi.br.com/market/trade?symbol=ethusdt");
            JSONObject object = JSONObject.parseObject(response.body());
            Trade trade = object.getJSONObject("tick").getJSONArray("data").getObject(0,Trade.class);
            System.out.println(trade);
        }catch (IOException e){
            System.out.println(e.getMessage());
        }


    }
}
