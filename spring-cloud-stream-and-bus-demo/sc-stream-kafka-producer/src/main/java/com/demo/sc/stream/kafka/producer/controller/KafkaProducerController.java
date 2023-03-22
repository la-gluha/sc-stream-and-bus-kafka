package com.demo.sc.stream.kafka.producer.controller;

import com.demo.sc.stream.kafka.producer.message.MySource;
import com.demo.sc.stream.kafka.producer.message.StreamMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@RequestMapping("/stream")
@EnableBinding(MySource.class)
public class KafkaProducerController {
    @Autowired
    private MySource mySource;

    @GetMapping("/send")
    public boolean send(){
        StreamMessage message = new StreamMessage(new Random().nextInt());
        Message<StreamMessage> springMessage = MessageBuilder.withPayload(message).build();
        return mySource.streamDemo().send(springMessage);
    }
}
