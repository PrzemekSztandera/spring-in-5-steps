package com.in28minutes.springbasics.springin5steps.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SomeExternalService {

    // from app.properties file: external.service.url
    @Value("${external.service.url}")
    private String url;

    public String returnServiceUrl() {
        return url;
    }
}
