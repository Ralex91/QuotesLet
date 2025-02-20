package com.example.app.controller;

import com.example.app.model.Conversation;
import com.example.app.service.MotivationService;
import com.example.app.repository.ConversationRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDateTime;
import java.util.List;

@Controller
public class MotivationController {

    private final MotivationService motivationService;
    private final ConversationRepository conversationRepository;

    public MotivationController(MotivationService motivationService, ConversationRepository conversationRepository) {
        this.motivationService = motivationService;
        this.conversationRepository = conversationRepository;
    }

    @GetMapping("/")
    public String showForm(Model model) {
        model.addAttribute("conversations", conversationRepository.findAll());
        return "index";
    }

    @PostMapping("/motivate")
    public String getMotivation(@RequestParam String name, @RequestParam String message, Model model) {
        String quote = motivationService.getMotivationalQuote();
        
        Conversation conversation = new Conversation();
        conversation.setUserName(name);
        conversation.setMessage(message);
        conversation.setQuoteReceived(quote);
        conversation.setDate(LocalDateTime.now());
        
        conversationRepository.save(conversation);
        
        model.addAttribute("quote", quote);
        model.addAttribute("conversations", conversationRepository.findAll());
        return "index";
    }

    @GetMapping("/history")
    public String showHistory(Model model) {
        List<Conversation> conversations = conversationRepository.findAll();
        model.addAttribute("conversations", conversations);
        return "history";
    }
}

