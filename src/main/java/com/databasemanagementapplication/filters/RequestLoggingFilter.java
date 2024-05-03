package com.databasemanagementapplication.filters;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.filter.OncePerRequestFilter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RequestLoggingFilter extends OncePerRequestFilter {

    private final Logger logger = LoggerFactory.getLogger(RequestLoggingFilter.class);

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        logger.info("Request URL: {}, Method: {}", request.getRequestURI(), request.getMethod());
        // You can log additional request details like headers, parameters, etc., if needed

        filterChain.doFilter(request, response); // Continue with the filter chain
    }
}
