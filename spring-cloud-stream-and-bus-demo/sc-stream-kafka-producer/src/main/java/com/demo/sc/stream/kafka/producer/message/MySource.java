package com.demo.sc.stream.kafka.producer.message;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface MySource {
    @Output("stream-demo-output")
    MessageChannel streamDemo();
}
