package com.marke.marketmaker.utils;

public class Test {

    public static void main(String[] args) {
       String result =  HttpUtil.doPost("https://api.huobi.br.com/market/detail?symbol=ethusdt");

    }
}
