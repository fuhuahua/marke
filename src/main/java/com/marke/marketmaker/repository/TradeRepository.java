package com.marke.marketmaker.repository;

import com.marke.marketmaker.domain.Trade;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TradeRepository extends MongoRepository<Trade,Long> {


}
