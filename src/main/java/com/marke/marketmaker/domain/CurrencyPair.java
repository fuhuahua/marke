package com.marke.marketmaker.domain;

import com.marke.marketmaker.common.BasicDomain;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author xingkong
 * @date 19-8-23 下午3:38
 */
@Data
@Document(collection = "currency_pair")
public class CurrencyPair extends BasicDomain {

    private String currencyPairName;

}
