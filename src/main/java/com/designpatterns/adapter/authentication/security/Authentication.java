package com.designpatterns.adapter.authentication.security;

import java.util.Date;


public class Authentication {

    private final String username;
    private final Date authenticatedAt;

    public Authentication(String username) {
        this.username = username;
        this.authenticatedAt = new Date();
    }

    public String getUsername() {
        return username;
    }

    public Date getAuthenticatedAt() {
        return authenticatedAt;
    }
}
