package com.xjyq.service.commonService;

public interface RabbitMQService {

    /**
     * 服务生产者
     *
     */
    void send(String message);
}