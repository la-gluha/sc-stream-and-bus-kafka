package com.demo.bus.kafka.publisher.controller;

import com.demo.bus.kafka.publisher.event.UserRegisterEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.bus.ServiceMatcher;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bus")
public class PublisherController {
    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private ApplicationEventPublisher publisher;

    @Autowired
    private ServiceMatcher serviceMatcher;

    @GetMapping("/register")
    public String register(String username){
        logger.info("[register][执行用户({}) 的注册逻辑]", username);
        publisher.publishEvent(
                new UserRegisterEvent(this,
                        serviceMatcher.getServiceId(),
                        null,
                        username));
        return "success";
    }
}
