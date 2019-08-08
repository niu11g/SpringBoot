package com.liuy.springboot.dubbo.provider.quickstart;

import com.alibaba.dubbo.config.annotation.Service;
import com.liuy.springboot.dubbo.ServiceAPI;
import org.springframework.stereotype.Component;

@Service(interfaceClass = ServiceAPI.class)
@Component
public class QuickStartImpl implements ServiceAPI {
    @Override
    public String sendMessage(String message) {
        return "provider message:"+message;
    }
}
