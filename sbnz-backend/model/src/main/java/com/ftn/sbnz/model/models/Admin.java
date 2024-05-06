package com.ftn.sbnz.model.models;

public class Admin extends Person {

  public Admin() {
    super();
  }

  public Admin(String username, String password) {
    super(username, password);
  }

  @Override
  public String toString() {
    return "Admin: username=" + this.username + ", password=" + this.password;
  }
}
