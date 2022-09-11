package com.wanfeng.javalearn;


import com.wanfeng.javalearn.设计模式.strategy.DemoService;
import com.wanfeng.javalearn.监听.EventPublisher;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.BeansException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.kafka.annotation.EnableKafka;

/**
 * @author liuzhuohao
 */
@SpringBootApplication
public class JavaLearnApplication implements ApplicationContextAware {
    private static ApplicationContext applicationContext;


    public static void main(String[] args) {
        SpringApplication.run(JavaLearnApplication.class, args);
        DemoService demoService = applicationContext.getBean("demoService", DemoService.class);
        demoService.getStrategy("A").doStrategy();
        EventPublisher eventPublisher = applicationContext.getBean("eventPublisher", EventPublisher.class);
        eventPublisher.publishEvent("消息");
    }

    @Override
    public void setApplicationContext(@NotNull ApplicationContext applicationContext) throws BeansException {
        JavaLearnApplication.applicationContext = applicationContext;
    }


}
