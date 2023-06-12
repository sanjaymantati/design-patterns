package com.designpatterns.adapter.authentication.advanceauthenticators;

import com.designpatterns.adapter.authentication.security.SecurityContext;

import java.util.Base64;
import java.util.Objects;

public class BasicAdvanceAuthenticator implements AdvanceAuthenticator {

    @Override

    public void login(String token) {
        Objects.requireNonNull(token, "Token is required.");
        String usernamePasswordPhrase = new String(Base64.getDecoder().decode(token.getBytes()));
        if (!usernamePasswordPhrase.contains(":"))
            throw new IllegalArgumentException("Invalid credentials.");
        String[] usernamePasswordPhraseArr = usernamePasswordPhrase.split(":");
        SecurityContext.setAuthentication(usernamePasswordPhraseArr[0]);
        System.out.println("User is logged in with DefaultAdvanceAuthenticator.");
    }


    @Override
    public void logout() {

        SecurityContext.removeAuthentication();
        System.out.println("User is logged out with DefaultAdvanceAuthenticator.");
    }
}
