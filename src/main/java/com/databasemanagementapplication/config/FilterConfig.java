package com.databasemanagementapplication.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.databasemanagementapplication.filters.RequestLoggingFilter;


@Configuration
public class FilterConfig {

    @Bean
    public RequestLoggingFilter requestLoggingFilter() {
        return new RequestLoggingFilter();
    }
}
