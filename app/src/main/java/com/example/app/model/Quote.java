package com.example.app.model;

public class Quote {
  private Long id;
  private String text;
  
  public Quote(Long id, String text) {
    this.id = id;
    this.text = text;    
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }
}
