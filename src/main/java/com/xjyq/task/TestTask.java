package com.xjyq.task;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Lazy;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Lazy(false)
@EnableScheduling
@Component
@Slf4j
public class TestTask {

    @Scheduled(cron = "0/5 * * * * ?")
    public void  get(){
        log.info("============Task 任务测试=======================");
        log.error("============Task 任务测试=======================");

        log.warn("============Task 任务测试=======================");

        log.trace("============Task 任务测试=======================");

    }
}