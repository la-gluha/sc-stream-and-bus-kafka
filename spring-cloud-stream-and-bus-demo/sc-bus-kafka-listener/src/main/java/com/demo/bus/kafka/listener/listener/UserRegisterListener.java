package com.demo.bus.kafka.listener.listener;

import com.demo.bus.kafka.listener.event.UserRegisterEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class UserRegisterListener implements ApplicationListener<UserRegisterEvent> {
    private Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public void onApplicationEvent(UserRegisterEvent userRegisterEvent) {
        logger.info("[onApplicationEvent][监听到用户({}) 注册]", userRegisterEvent.getUsername());
    }
}
