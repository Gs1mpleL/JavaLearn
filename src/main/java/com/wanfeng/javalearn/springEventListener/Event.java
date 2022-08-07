package com.wanfeng.javalearn.springEventListener;


import org.springframework.context.ApplicationEvent;


public class Event extends ApplicationEvent {
    public Event(String eventStr){super(eventStr);}
}
