package com.anzhi.utilsdemo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.retry.annotation.EnableRetry;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @Package: com.anzhi.worktest
 * @ClassName: WorkTestApplication
 * @Author: AZ
 * @CreateTime: 2021/11/7 17:20
 * @Description:
 */
@SpringBootApplication(scanBasePackages = "com.anzhi.utilsdemo.*")
@EnableRetry // 支持Spring boot 重试机制
@Slf4j
public class WorkTestApplication {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        List<String> list1 = new LinkedList<>();
        
        System.setProperty("workTest", "workTest");
        SpringApplication.run(WorkTestApplication.class, args);
    }
}
