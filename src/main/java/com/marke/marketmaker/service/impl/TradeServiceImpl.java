package com.marke.marketmaker.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.marke.marketmaker.domain.Trade;
import com.marke.marketmaker.service.TradeService;
import com.marke.marketmaker.utils.HttpUtil;
import com.mongodb.client.MongoCollection;
import org.bson.Document;
import org.jsoup.Connection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class TradeServiceImpl implements TradeService {

//    private static final String URL = "https://api.huobi.br.com/market/trade?symbol=ethusdt";
    private static final String URL = "https://api.huobi.br.com/market/trade?symbol=lambusdt";

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public void save(Trade trade) {

        Query query = new Query().addCriteria(Criteria.where("id").is(trade.getId()));
        Trade oldTrade = mongoTemplate.findOne(query,Trade.class);
        if (oldTrade == null) {
            mongoTemplate.save(trade);
        }
    }

    @Override
    public Trade getTradeData(String coin, String coinPair) {
        try {
            Connection.Response response =  HttpUtil.get(URL);
            JSONObject object = JSONObject.parseObject(response.body());
            Trade trade = object.getJSONObject("tick").getJSONArray("data").getObject(0,Trade.class);
//            trade.setCurrencyName("eth");
//            trade.setCurrencyPair("ethusdt");
            trade.setCurrencyName("lamb");
            trade.setCurrencyPair("lambusdt");
            return trade;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
