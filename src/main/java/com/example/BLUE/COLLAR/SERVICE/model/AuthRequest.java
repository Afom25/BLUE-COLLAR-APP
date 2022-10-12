package com.example.BLUE.COLLAR.SERVICE.model;

public class AuthRequest {

    private String firstname;
    private String password;

    public AuthRequest(String firstname, String password) {
        this.firstname = firstname;
        this.password = password;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
