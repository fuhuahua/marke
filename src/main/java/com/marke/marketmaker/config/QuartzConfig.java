package com.marke.marketmaker.config;

import com.marke.marketmaker.job.SyncTradeJob;
import org.quartz.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class QuartzConfig {

    @Bean
    public JobDetail synTradeJobDetail(){

        return JobBuilder.newJob(SyncTradeJob.class).withIdentity("synTradeJob").storeDurably().build();
    }

    @Bean
    public Trigger synTradeJobTrigger(){

        SimpleScheduleBuilder simpleScheduleBuilder = SimpleScheduleBuilder.simpleSchedule().withIntervalInSeconds(1).repeatForever();
        return TriggerBuilder.newTrigger().forJob(synTradeJobDetail()).withDescription("synTradeJobTrigger").withSchedule(simpleScheduleBuilder).build();
    }
}
