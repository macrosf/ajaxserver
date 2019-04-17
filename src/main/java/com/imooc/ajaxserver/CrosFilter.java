package com.imooc.ajaxserver;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

/**
 * @author 2000105922
 */
public class CrosFilter implements Filter {
	@Override
	public void init(FilterConfig filterConfig) {

	}

	@Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletResponse res = (HttpServletResponse) servletResponse;
        res.setHeader("Access-Control-Allow-Origin", "http://localhost:8081");
        res.setHeader("Access-Control-Allow-Methods", "GET");
        filterChain.doFilter(servletRequest,servletResponse);
    }
	@Override
	public void destroy() {

	}
}
