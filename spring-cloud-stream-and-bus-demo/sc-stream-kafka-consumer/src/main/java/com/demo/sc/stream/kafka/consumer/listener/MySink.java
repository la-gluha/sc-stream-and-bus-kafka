package com.demo.sc.stream.kafka.consumer.listener;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface MySink {
    String STREAM_DEMO_INPUT = "stream-demo-input";

    @Input(STREAM_DEMO_INPUT)
    SubscribableChannel streamInput();
}
