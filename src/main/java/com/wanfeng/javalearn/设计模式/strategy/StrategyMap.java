package com.wanfeng.javalearn.设计模式.strategy;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class StrategyMap implements ApplicationContextAware {
    public HashMap<String, IStrategy> strategyHashMap = new HashMap<>();

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        Map<String, IStrategy> beansOfType = applicationContext.getBeansOfType(IStrategy.class);
        beansOfType.values().forEach(e -> strategyHashMap.put(e.getName(),e));
    }
}
