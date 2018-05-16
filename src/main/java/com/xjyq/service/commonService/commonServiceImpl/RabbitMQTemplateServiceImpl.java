package com.xjyq.service.commonService.commonServiceImpl;

import com.xjyq.config.RabbitConfig;
import com.xjyq.service.commonService.RabbitMQTemplateService;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.rabbit.support.CorrelationData;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.UUID;

@Service
public class RabbitMQTemplateServiceImpl implements RabbitMQTemplateService {

    @Resource
    private RabbitTemplate rabbitTemplate;


    /**
     *  MQ生成消息
     *  exchange:交换机名称
     *  routingKey:路由关键字
     *  object:发送的消息内容
     *  correlationData:消息ID
     *  @param object
     */
    @Override
    public void sendMesage(Object object) {
        CorrelationData correlationId = new CorrelationData(UUID.randomUUID().toString());
        rabbitTemplate.convertAndSend(RabbitConfig.EXCHANGE, RabbitConfig.ROUTINGKEY, object, correlationId);
    }
}