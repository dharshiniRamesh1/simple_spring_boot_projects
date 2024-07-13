package com.project1.Myapp.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.project1.Myapp", "com.project2.myapp.bean"})
public class BeanConfig {
}
