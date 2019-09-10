package com.marke.marketmaker.service;

import com.marke.marketmaker.domain.Trade;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class TradeServiceTest {

    @Autowired
    private TradeService tradeService;

    @Test
    public void save() {
        Trade trade = new Trade();
        trade.setCurrencyName("LAMB");
        trade.setId(500848670l);
        trade.setAmount(0.0212);
        trade.setCurrencyPair("ethusdt");
        trade.setDirection("sell");
        trade.setPrice(7962.62);
        tradeService.save(trade);
    }
}