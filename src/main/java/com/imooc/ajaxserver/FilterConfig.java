package com.imooc.ajaxserver;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 2000105922
 */
@Configuration
public class FilterConfig {
//使用NGINX处理消息头，服务端可以不用FILTER
//    @Bean
//    public FilterRegistrationBean<CrosFilter> registFilter() {
//        FilterRegistrationBean<CrosFilter> registration = new FilterRegistrationBean<>();
//        registration.setFilter(new CrosFilter());
//        registration.addUrlPatterns("/*");
//        registration.setName("CrosFilter");
//        registration.setOrder(1);
//        return registration;
//    }
}
