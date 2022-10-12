package com.example.BLUE.COLLAR.SERVICE.model;

public class AuthResponse {

    private final String jwt;


    public AuthResponse(String jwt) {
        this.jwt = jwt;
    }

    public String getJwt() {
        return jwt;
    }
}
