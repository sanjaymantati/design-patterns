package com.designpatterns.adapter.authentication.security;

public class SecurityContext {

    private static volatile Authentication auth = null;

    private SecurityContext() {
    }

    public synchronized static void setAuthentication(String username) {
        if(auth!=null)
            throw new IllegalStateException("Authentication already exists.");
        auth = new Authentication(username);
        System.out.println("Authenticated is added successfully.");
    }

    public synchronized static void removeAuthentication() {

        if(auth==null)
            throw new IllegalStateException("Authentication does not exists.");

        auth = null;
        System.out.println("Authenticated is removed successfully.");
    }

    public synchronized static boolean isAuthenticated() {
        return auth != null;
    }
}
