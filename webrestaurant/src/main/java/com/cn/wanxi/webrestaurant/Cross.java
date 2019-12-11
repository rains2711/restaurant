package com.cn.wanxi.webrestaurant;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * 解决跨域问题和后缀问题
 */
@Configuration
public class Cross extends WebMvcConfigurationSupport {
    /**
     * -设置url后缀模式匹配规则
     * -该设置匹配所有的后缀，使用.do或.action都可以
     */
    @Override
    public void configurePathMatch(PathMatchConfigurer configurer) {
        configurer.setUseSuffixPatternMatch(false)	//设置是否是后缀模式匹配,即:/test.*
                .setUseTrailingSlashMatch(false);	//设置是否自动后缀路径模式匹配,即：/test/
    }
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        // 设置允许跨域的路径
        registry.addMapping("/**")
                // 设置允许跨域请求的域名
                .allowedOrigins("*")
                // 是否允许证书 不再默认开启
                .allowCredentials(true)
                // 设置允许的方法
                .allowedMethods("*")
                //允许所有请求头
                .allowedHeaders("*")
                // 跨域允许时间
                .maxAge(3600);
    }
}
