package com.marke.marketmaker.domain;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.sql.Timestamp;
import java.util.Date;

/**
 * @author xingkong
 * @date 19-8-22 下午12:00
 */

@Data
@Document(collection = "coin_update")
public class CoinUpdate {

    /**
     * 更新类型
     * 1,实时更新 2,历史数据
     */
    private Integer updateType;

    /**
     * 整个循环更新的开始时间
     */
    private Timestamp startTime;

    /**
     * 更新时对应日期
     */
    private Date priceDay;

    /**
     * 历史记录的开始时间
     */
    private Timestamp priceStartTime;

    /**
     * 历史记录的结束时间
     */
    private Timestamp priceEndTime;

    /**
     * 价格获得时间
     */
    private Timestamp priceTime;

    /**
     * 获得的所有的价格的个数
     */
    private Integer totalPriceNumber;

    /**
     * 更新的价格的个数
     */
    private Integer priceNumber;

    /**
     * 状态：
     * 1 - 更新未开始；2 - 更新已开始；3 - 更新成功；9 - 更新失败
     */
    private Integer status;


    /**
     * 交易所币种数量
     */
    private Integer cmcCoinNumber;

    private Integer cmcExchangeNumber;

    /**
     * 交易所总市值
     */
    private Double cmcTotalMarketCap;

    /**
     * 交易所24小时流通量
     */
    private Double cmcTotalVolume24h;

    /**
     * btc主导
     */
    private Double cmcBtcPercentageOfMarketCap;

    /**
     * 最后更新时间
     */
    private Timestamp cmcLastUpdatedTime;

}
