package com.xjyq.task;

import org.springframework.context.annotation.Lazy;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Lazy(false)
@EnableScheduling
@Component
public class TestTask {

    @Scheduled(cron = "0/20 * * * * ?")
    public void  get(){
        System.out.print("============Task 任务测试=======================");
    }
}