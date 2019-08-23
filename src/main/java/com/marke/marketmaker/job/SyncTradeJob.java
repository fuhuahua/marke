package com.marke.marketmaker.job;

import com.marke.marketmaker.domain.Trade;
import com.marke.marketmaker.service.TradeService;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.quartz.QuartzJobBean;

public class SyncTradeJob extends QuartzJobBean {

    private static final Logger LOGGER = LoggerFactory.getLogger(SyncTradeJob.class.getName());

    @Autowired
    private TradeService tradeService;

    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        LOGGER.info("start sync trade data...");
        Trade trade = new Trade();
        tradeService.save(trade);

    }
}
