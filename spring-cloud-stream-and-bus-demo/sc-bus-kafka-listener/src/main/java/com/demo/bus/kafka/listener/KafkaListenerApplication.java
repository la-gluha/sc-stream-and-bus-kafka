package com.demo.bus.kafka.listener;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.bus.jackson.RemoteApplicationEventScan;

@SpringBootApplication
@RemoteApplicationEventScan
public class KafkaListenerApplication {
    public static void main(String[] args) {
        SpringApplication.run(KafkaListenerApplication.class);
    }
}
