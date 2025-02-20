package com.example.app.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.app.model.Quote;

@Service
public class MotivationService {

    private final RestTemplate restTemplate;

    public MotivationService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String getMotivationalQuote() {
        String apiUrl = "http://localhost:8081/quote/random"; // Corrected URL
        // response of api is json: {id: "1", text: "Quote 1"} wante return only text
        Quote quote = restTemplate.getForObject(apiUrl, Quote.class);
        return quote.getText();
    }
}
