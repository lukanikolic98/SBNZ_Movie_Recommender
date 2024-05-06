package com.ftn.sbnz.model.models;

public abstract class Person {
  public String username;
  public String password;

  public Person() {
  }

  public Person(String username, String password) {
    this.username = username;
    this.password = password;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  @Override
  public String toString() {
    return "Person: username=" + this.username + ", password=" + this.password;
  }
}
