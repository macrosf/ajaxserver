package com.imooc.ajaxserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
//@ServletComponentScan("com.imooc.ajaxserver.CrosFilter")
public class AjaxserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(AjaxserverApplication.class, args);
	}

//	NO USE
//	@Bean
//	public FilterRegistrationBean registerFilter() {
//		FilterRegistrationBean bean = new FilterRegistrationBean();
//		bean.addUrlPatterns("/");
//		bean.setFilter(new CrosFilter());
//
//		return bean;
//	}


}
