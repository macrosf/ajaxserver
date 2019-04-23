package com.imooc.ajaxserver;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 2000105922
 */
@Configuration
public class FilterConfig {
    @Bean
    public FilterRegistrationBean<CrosFilter> registFilter() {
        FilterRegistrationBean<CrosFilter> registration = new FilterRegistrationBean<>();
        registration.setFilter(new CrosFilter());
        registration.addUrlPatterns("/*");
        registration.setName("CrosFilter");
        registration.setOrder(1);
        return registration;
    }
}
