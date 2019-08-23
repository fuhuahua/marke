package com.marke.marketmaker.domain;

import lombok.Data;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;
import java.sql.Timestamp;

@Data
@Document(collection = "trade")
public class Trade implements Serializable {

    private static final long serialVersionUID = -6383393809739910647L;

    @Field("id")
    private Long id;

    /**
     * 币种名称
     */
    @Indexed
    @Field("currency_name")
    private String currencyName;

    /**
     * 交易所返回交易唯一编号
     */
    @Field("trade_id")
    private Long tradeId;

    /**
     * 时间
     */
    @Field("time")
    private Timestamp time;

    /**
     * 币对
     */
    @Indexed
    @Field("currency_pair")
    private String currencyPair;

    /**
     * 币价
     */
    @Field("price")
    private Double price;

    /**
     * 当前交易额
     */
    @Field("amount")
    private Double amount;

    /**
     * 交易方向
     */
    @Field("direction")
    private String direction;
}
