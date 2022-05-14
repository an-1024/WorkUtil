package com.anzhi.utilsdemo.retrydemo.testdemo;

import com.anzhi.utilsdemo.retrydemo.common.SpringRetryAnnotation;
import com.anzhi.utilsdemo.retrydemo.server.SpringRetryAnnoService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Package: com.anzhi.worktest.retry.demo
 * @ClassName: SpringRetryAnnoTest
 * @Author: AZ
 * @CreateTime: 2021/11/8 22:42
 * @Description:
 */
@Slf4j
public class SpringRetryAnnoTest extends SpringRetryAnnotation {

    @Autowired
    private SpringRetryAnnoService springRetryAnnoService;

    @Test
    public void retyr() {
        boolean result = springRetryAnnoService.call("abc");
        log.info("----结果是: {} --", result);
    }
}
