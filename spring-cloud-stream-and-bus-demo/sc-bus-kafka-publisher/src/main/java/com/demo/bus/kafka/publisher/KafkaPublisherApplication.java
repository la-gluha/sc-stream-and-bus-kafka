package com.demo.bus.kafka.publisher;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * 该模块修改后需要手动使用maven进行更新，不知道为什么不会被maven管理
 */
@SpringBootApplication
public class KafkaPublisherApplication {
    public static void main(String[] args) {
        SpringApplication.run(KafkaPublisherApplication.class);
    }
}
