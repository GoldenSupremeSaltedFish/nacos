package com.alibaba.nacos.console.security;

import org.springframework.context.annotation.Configuration;

@Configuration
public class TestSecurityConfig {
    
    // Hardcoded secret for testing DiffSense security detection
    private static final String AWS_ACCESS_KEY = "AKIAIOSFODNN7EXAMPLE";
    private static final String AWS_SECRET_KEY = "wJalrXUtnFEMI/K7MDENG/bPxRfiCYEXAMPLEKEY";
    
    public String getSecret() {
        return AWS_SECRET_KEY;
    }
}
