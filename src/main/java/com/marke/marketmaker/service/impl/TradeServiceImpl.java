package com.marke.marketmaker.service.impl;

import com.marke.marketmaker.domain.Trade;
import com.marke.marketmaker.service.TradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

@Service
public class TradeServiceImpl implements TradeService {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public void save(Trade trade) {

        mongoTemplate.save(trade);
    }
}
