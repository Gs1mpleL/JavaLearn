package com.wanfeng.javalearn.springEventListener;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class EventPublisher {
    @Resource
    private ApplicationContext context;

    public void publishEvent(String str){
        context.publishEvent(new Event(str));
    }
}
