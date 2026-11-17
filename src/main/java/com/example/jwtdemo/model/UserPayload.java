package com.example.jwtdemo.model;

public class UserPayload {
    private String username;
    private String role;

    public UserPayload() {
    }

    public UserPayload(String username, String role) {
        this.username = username;
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
