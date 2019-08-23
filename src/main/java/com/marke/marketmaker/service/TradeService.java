package com.marke.marketmaker.service;

import com.marke.marketmaker.domain.Trade;

public interface TradeService {

    /**
     * 新增交易数据
     * @param trade
     */
    void save(Trade trade);
}
