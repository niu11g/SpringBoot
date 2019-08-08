package com.liuy.springboot.dubbo.consumer;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import com.liuy.springboot.dubbo.consumer.quickstart.QuickConsumer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@EnableDubboConfiguration
public class ConsumerApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run;
		run = SpringApplication.run(ConsumerApplication.class, args);

		QuickConsumer consumer = (QuickConsumer) run.getBean("quickConsumer");
		consumer.sendMessage("你好");


	}

}
