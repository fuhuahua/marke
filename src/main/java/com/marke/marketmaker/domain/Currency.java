package com.marke.marketmaker.domain;

import com.marke.marketmaker.common.BasicDomain;
import lombok.Data;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.sql.Timestamp;

/**
 * @author xingkong
 * @date 19-8-22 上午11:59
 */
@Data
@Document(collection = "currency")
public class Currency extends BasicDomain {

    /**
     * 币种名称
     */
    @Indexed
    private String symbolName;

    /**
     * 英文名
     */
    private String nameEnUs;

    /**
     * 中文名
     */
    private String nameZhCn;

    /**
     * 简介
     */
    private String introduction;

    /**
     * logo URL
     */
    private String logoUrl;


    /**
     * 总流通量
     */
    private Double circulatingSupply;

    /**
     *
     */
    private Double totalSupply;

    /**
     *
     */
    private Double maxSupply;

    /**
     * 交易所Id
     */
    @Indexed
    private Long cmcId;

    /**
     * 交易所地址
     */
    private String cmcUrl;

    /**
     * 对美元价格
     */
    private Double price;

    /**
     * 对BTC价格
     */
    private Double priceBtc;

    /**
     * 对eth价格
     */
    private Double priceEth;

    /**
     * 市值(美元)
     */
    private Double marketCap;

    /**
     * 24小时交易量
     */
    private Double volume24h;

    /**
     * 1小时变化量
     */
    private Double percentChange1h;

    /**
     * 24小时变化量
     */
    private Double percentChange24h;

    /**
     * 7天变化量
     */
    private Double percentChange7d;

    /**
     * cmc上最早的交易美元价格
     */
    private Timestamp cmcInitialTradingTime;

    /**
     * cmc上最早的交易美元价格
     */
    private Double cmcInitialTradingPrice;

    /**
     * cmc上最早的交易btc价格
     */
    private Double cmcInitialTradingPriceBtc;

    /**
     * 最早的交易美元价格
     */
    private Double initialTradingPrice;

    /**
     * 最早的交易btc价格
     */
    private Double initialTradingPriceBtc;

    /**
     * cmc上最早的市值
     */
    private Double cmcInitialMarketCap;

    /**
     * cmc上最早的btc市值
     */
    private Double cmcInitialMarketCapBtc;

    /**
     * 最早的市值
     */
    private Double initialMarketCap;

    /**
     * 最早的btc市值
     */
    private Double initialMarketCapBtc;

    /**
     * 排名
     */
    private Integer rank;

    /**
     * ico时候的币总供应量
     */
    private Double icoSupply;

    /**
     * 基石时的美元价格
     */
    private Double cornerstonePrice;

    /**
     * 基石时的btc价格
     */
    private Double cornerstonePriceBtc;

    /**
     * 私募时的eth价格
     */
    private Double cornerstonePriceEth;

    /**
     * 私募时的美元价格
     */
    private Double privateSalePrice;

    /**私募时的btc价格
     *
     */
    private Double privateSalePriceBtc;

    /**
     * 私募时的eth价格
     */
    private Double privateSalePriceEth;

    /**
     * ico时的美元价格
     */
    private Double icoPrice;

    /**
     * ico时的btc价格
     */
    private Double icoPriceBtc;

    /**
     * ico时的eth价格
     */
    private Double icoPriceEth;


}
