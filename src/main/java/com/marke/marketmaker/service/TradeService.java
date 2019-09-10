package com.marke.marketmaker.service;

import com.marke.marketmaker.domain.Trade;

public interface TradeService {

    /**
     * 新增交易数据
     * @param trade
     */
    void save(Trade trade);

    /**
     * 获取交易数据
     * @return
     */
    Trade getTradeData(String coin, String coinPair);
}
