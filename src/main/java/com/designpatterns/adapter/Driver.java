package com.designpatterns.adapter;

import com.designpatterns.adapter.authentication.advanceauthenticators.AdvanceAuthenticator;
import com.designpatterns.adapter.authentication.authenticators.Authenticator;
import com.designpatterns.adapter.authentication.authenticators.BasicAuthenticator;
import com.designpatterns.adapter.authentication.advanceauthenticators.BasicAdvanceAuthenticator;
import com.designpatterns.adapter.authentication.adapters.BasicAdvanceAuthenticationAdapter;

import java.util.Base64;

public class Driver {

    public static void main(String[] args) {
        String username = "johndoe";
        String password = Base64.getEncoder().encodeToString(username.getBytes());
        String usernamePasswordPhrase = Base64.getEncoder().encodeToString(String.format("%s:%s", username, password).getBytes());

        // Legacy authenticators
        Authenticator authenticator = new BasicAuthenticator();
        authenticator.login(username, Base64.getEncoder().encodeToString(username.getBytes()));
        authenticator.logout();

        // New authenticators
        AdvanceAuthenticator authenticationAdapter = new BasicAdvanceAuthenticator();
        authenticationAdapter.login(usernamePasswordPhrase);
        authenticationAdapter.logout();

        // New authentications with legacy interface.
        Authenticator adaptiveAuthenticator = new BasicAdvanceAuthenticationAdapter();
        adaptiveAuthenticator.login(username, Base64.getEncoder().encodeToString(username.getBytes()));
        adaptiveAuthenticator.logout();
    }
}