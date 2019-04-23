package com.imooc.ajaxserver;

import org.springframework.util.StringUtils;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author 2000105922
 */
//@WebFilter(urlPatterns = "/*", filterName = "crosFilter")
public class CrosFilter implements Filter {
	@Override
	public void init(FilterConfig filterConfig) {

	}

	@Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletResponse res = (HttpServletResponse) servletResponse;

        //带cookie的时候，orgin必须是全匹配，不能使用'*'
        //res.addHeader("Access-Control-Allow-Origin", "http://localhost:8081");

		//带cookie的时候如果需要支持所有的域名，则需要从Request中取得请求方的域名信息，然后把这个域名信息写回到'Access-Control-Allow-Origin'中里面去。
		HttpServletRequest req =(HttpServletRequest) servletRequest;
		String origin = req.getHeader("Origin");
		if (!StringUtils.isEmpty(origin)) {
			res.addHeader("Access-Control-Allow-Origin", origin);
		}

        res.addHeader("Access-Control-Allow-Methods", "GET");
        //预检命令响应头
		res.addHeader("Access-Control-Allow-Headers", "Content-Type, x-header1, x-header2");
		//预检命令缓存响应头
		res.addHeader("Access-Control-Max-Age", "3600");

		//enable cookie
		res.addHeader("Access-Control-Allow-Credentials", "true");
        filterChain.doFilter(servletRequest,servletResponse);
    }
	@Override
	public void destroy() {

	}
}
