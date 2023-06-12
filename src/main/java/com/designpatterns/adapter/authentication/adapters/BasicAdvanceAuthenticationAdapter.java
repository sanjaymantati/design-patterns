package com.designpatterns.adapter.authentication.adapters;

import com.designpatterns.adapter.authentication.advanceauthenticators.BasicAdvanceAuthenticator;

import java.util.Base64;

public class BasicAdvanceAuthenticationAdapter extends AdvanceAuthenticationAdapter {


    public BasicAdvanceAuthenticationAdapter() {
        super(new BasicAdvanceAuthenticator());
    }

    public String getToken(String username, String password) {
        String userPasswordPhrase = String.format("%s:%s", username, password);
        return Base64.getEncoder().encodeToString(userPasswordPhrase.getBytes());
    }
}
