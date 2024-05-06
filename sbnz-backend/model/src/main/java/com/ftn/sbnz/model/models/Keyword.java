package com.ftn.sbnz.model.models;

public class Keyword {
  public String word;

  public Keyword() {
  }

  public Keyword(String word) {
    this.word = word;
  }

  @Override
  public String toString() {
    return "Keyword: " + word;
  }

  public String getWord() {
    return word;
  }

  public void setWord(String word) {
    this.word = word;
  }
}
