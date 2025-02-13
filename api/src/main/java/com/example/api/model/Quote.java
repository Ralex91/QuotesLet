package com.example.api.model;

import jakarta.persistence.*;

@Entity
public class Quote {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 500)
    private String content;

    public Quote() {}

    public Quote(String content) {
        this.content = content;
    }

    public Long getId() {
        return id;
    }

    public String getText() {
        return content;
    }

    public void setText(String content) {
        this.content = content;
    }
}
