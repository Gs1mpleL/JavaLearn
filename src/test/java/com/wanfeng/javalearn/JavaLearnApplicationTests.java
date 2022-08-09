package com.wanfeng.javalearn;

import com.wanfeng.javalearn.mybatisPlus.BizEntity;
import com.wanfeng.javalearn.mybatisPlus.BizMapper;
import com.wanfeng.javalearn.mybatisPlus.BizService;
import com.wanfeng.javalearn.mybatisPlus.BizServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

@SpringBootTest(classes = JavaLearnApplication.class)
class JavaLearnApplicationTests {
    @Autowired
    private BizServiceImpl bizService;
    @Test
    void contextLoads() {
    }
    @Test
    void test(){
        List<BizEntity> list = bizService.list();
    }

}
