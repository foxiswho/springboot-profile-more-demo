package com.foxwho.springbootprofilemoredemo;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Profile;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("test")
@Slf4j
@SpringBootTest
class SpringbootProfileMoreDemoApplicationTests {
    @Value("${fox.config.appId:}")
    private String appId;
    @Value("${fox.config.appKey:}")
    private String appKey;
    @Value("${fox.config.remark:}")
    private String remark;
    @Value("${fox.title:}")
    private String title;
    @Value("${spring.profiles.active:}")
    private String active;

    @Test
    void contextLoads() {
        log.info("appId={}", appId);
        log.info("appKey={}", appKey);
        log.info("remark={}", remark);
        log.info("title={}", title);
        log.info("active={}", active);

        StringBuilder sb = new StringBuilder();
        sb.append("appId=");
        sb.append(appId);
        sb.append("<br/>\n");
        sb.append("appKey=");
        sb.append(appKey);
        sb.append("<br/>\n");
        sb.append("remark=");
        sb.append(remark);
        sb.append("<br/>\n");
        sb.append("title=");
        sb.append(title);
        sb.append("<br/>\n");
        sb.append("active=");
        sb.append(active);
        sb.append("<br/>\n");
        log.info("{}", sb.toString());
    }

}
