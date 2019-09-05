package com.nag.filter;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;


public class MyGenericFilter implements Filter {

    public MyGenericFilter() {
        // TODO Auto-generated constructor stub
    }

	public void destroy() {
		this.filterconf = null;
	}
	private FilterConfig filterconf = null;
	public FilterConfig getFilterConfig() {
		return filterconf;
	}

	public void setFilterConfig(final FilterConfig filterconf) {
		this.filterconf = filterconf;
	}

	public void doFilter(final ServletRequest request, final ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here

		// pass the request along the filter chain
		chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig filterconf) throws ServletException {
		this.filterconf = filterconf;
	}

}
