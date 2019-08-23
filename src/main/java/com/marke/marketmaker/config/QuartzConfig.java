package com.marke.marketmaker.config;

import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.springframework.context.annotation.Configuration;

@Configuration
public class QuartzConfig {

    public JobDetail synTradeJobDetail(){
        return JobBuilder.newJob().build();
    }

    public Trigger synTradeJobTrigger(){
        return TriggerBuilder.newTrigger().build();
    }
}
