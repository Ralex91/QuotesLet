package com.example.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.api.model.Quote;
import com.example.api.repository.QuoteRepository;

@Service
public class QuoteService {

    @Autowired
    private QuoteRepository quoteRepository;

    public Quote getRandomQuote() {
        return quoteRepository.findRandomQuote();
    }
}

