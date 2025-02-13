package com.example.api.service;

import com.example.api.model.Quote;
import com.example.api.repository.QuoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuoteService {

    @Autowired
    private QuoteRepository quoteRepository;

    public Quote getRandomQuote() {
        return quoteRepository.findRandomQuote();
    }

    public List<Quote> getAllQuotes() {
        return quoteRepository.findAll();
    }

    public Quote addQuote(String text) {
        return quoteRepository.save(new Quote(text));
    }
}

