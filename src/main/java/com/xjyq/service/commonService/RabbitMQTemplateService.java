package com.xjyq.service.commonService;

public interface RabbitMQTemplateService {


    /***
     * 生产者
     */
    void sendMesage(Object object);
}