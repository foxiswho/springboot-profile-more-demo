package com.foxwho.springbootprofilemoredemo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 首页
 *
 * @author fox
 */
@Slf4j
@RestController
public class IndexController {
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
    @GetMapping("/")
    public String index() {
        log.info("appId={}", appId);
        log.info("appKey={}", appKey);
        log.info("remark={}", remark);
        log.info("title={}", title);
        log.info("active={}", active);

        StringBuilder sb = new StringBuilder();
        sb.append("title=");
        sb.append(title);
        sb.append("<br/>\n");
        sb.append("active=");
        sb.append(active);
        sb.append("<br/>\n");
        return sb.toString();
    }

    @GetMapping("/all")
    public String all() {
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
        return sb.toString();
    }
}
