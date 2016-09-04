package com.tn.restful.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by thangnguyen-imac on 9/3/16.
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.tn.restful")
public class MessageConfiguration {
}
