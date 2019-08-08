package com.liuy.springboot.dubbo.consumer.quickstart;

import com.alibaba.dubbo.config.annotation.Reference;
import com.liuy.springboot.dubbo.ServiceAPI;
import org.springframework.stereotype.Component;

@Component
public class QuickConsumer{

//    @Reference(url = "dubbo://localhost:20880")
    @Reference(interfaceClass = ServiceAPI.class)
    private ServiceAPI serviceAPI;

    public void sendMessage(String message) {
        System.out.println(serviceAPI.sendMessage(message));
    }
}
