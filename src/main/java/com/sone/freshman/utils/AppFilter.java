package com.sone.freshman.utils;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class AppFilter implements javax.servlet.Filter {
	public void doFilter(ServletRequest servReq, ServletResponse servRes, FilterChain chain) throws IOException, ServletException {
		
		HttpServletRequest request = (HttpServletRequest) servReq;
		HttpServletResponse response = (HttpServletResponse) servRes;
	    String servletPath = request.getServletPath();
	    
	    if (servletPath.equals("/login")){
	         chain.doFilter(request, response);
	         return;
	    }	   
	    HttpSession session = request.getSession(false);
	    if(session!=null){
	    	 chain.doFilter(request, response);
	         return;	    	
	    }else{
	    	String baseUrl = request.getContextPath()+"/login";
	    	response.sendRedirect(baseUrl);	
			return;
	    }
	    
	}
	public void init(FilterConfig fConfig) throws ServletException {}

	@Override
	public void destroy() {	}

}
