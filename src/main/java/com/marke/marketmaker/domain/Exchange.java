package com.marke.marketmaker.domain;

import com.marke.marketmaker.common.BasicDomain;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.sql.Timestamp;

/**
 * @author xingkong
 * @date 19-8-22 上午11:58
 */
@Data
@Document(collection = "exchange")
public class Exchange extends BasicDomain {


    /**
     * 中文名称
     */
    private String nameCN;
    /**
     * 英文名称
     */
    private String nameUS;
    /**
     * 日文名称
     */
    private String nameJP;
    /**
     * 韩文名称
     */
    private String nameKR;
    /**
     * 俄文名称
     */
    private String nameRU;

    /**
     * logo URL
     */
    private String logoUrl;

    /**
     * 简介
     */
    private String introduction;

    /**
     * 国家编号
     */
    private Integer countryId;

    /**
     * 标签
     * 现货/期货/支持法币
     */
    private String labels;

    /**
     * 官网URL
     */
    private String websiteUrl;

    /**
     * 上线时间
     */
    private Timestamp onlineTime;

    /**
     * 交易状态
     * 1,上线 2,测试 3,不可用
     */
    private Integer onlineStatus;



}
