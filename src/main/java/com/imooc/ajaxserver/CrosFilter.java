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

        //带cookie的时候，orgin必须是全匹配，不能使用*
        res.addHeader("Access-Control-Allow-Origin", "http://localhost:8081");
        res.addHeader("Access-Control-Allow-Methods", "GET");
        //预检命令响应头
		res.addHeader("Access-Control-Allow-Headers", "Content-Type");
		//预检命令缓存响应头
		res.addHeader("Access-Control-Max-Age", "3600");

		//enable cookie
		res.addHeader("Access-Control-Allow-Credential", "true");
        filterChain.doFilter(servletRequest,servletResponse);
    }
	@Override
	public void destroy() {

	}
}
