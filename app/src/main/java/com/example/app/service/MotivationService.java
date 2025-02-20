package com.example.app.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MotivationService {

    private final RestTemplate restTemplate;

    public MotivationService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String getMotivationalQuote() {
        String apiUrl = "http://localhost:8081/quote/random"; // Corrected URL
        return restTemplate.getForObject(apiUrl, String.class);
    }
}
