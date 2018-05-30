package com.xjyq.service.commonService.commonServiceImpl;

import com.xjyq.config.RabbitConfig;
import com.xjyq.service.commonService.RabbitMQService;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class RabbitMQServiceImpl implements RabbitMQService {


    @Resource
    private AmqpTemplate rabbitTemplate;

    @Override
    public void send(String message) {
        this.rabbitTemplate.convertAndSend(RabbitConfig.EXCHANGE, RabbitConfig.ROUTINGKEY, message);
    }
}