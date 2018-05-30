package com.xjyq.service.commonService;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * MQ消息接收服务
 *
 * @author
 *
 */
@Component
@RabbitListener(queues = "queue_one_key")
public class RabbitMQConsumer {

    @RabbitHandler
    public void process(String message) {
        System.out.println("接收者 queue_one_key:" + message);
    }

}