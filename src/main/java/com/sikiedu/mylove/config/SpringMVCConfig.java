package com.sikiedu.mylove.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author Administrator
 * @date 2020/9/3 0003 09:42:44
 * @description
 */
@Configuration
public class SpringMVCConfig implements WebMvcConfigurer {

    //匹配文件的路径
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/upload/**").addResourceLocations("file:D:/music/");
    }
















}
