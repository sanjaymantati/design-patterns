package com.designpatterns.adapter.authentication.adapters;

import com.designpatterns.adapter.authentication.advanceauthenticators.AdvanceAuthenticator;
import com.designpatterns.adapter.authentication.authenticators.Authenticator;

public abstract class AdvanceAuthenticationAdapter implements Authenticator {

    protected final AdvanceAuthenticator advanceAuthenticator;


    public AdvanceAuthenticationAdapter(AdvanceAuthenticator advanceAuthenticator) {
        this.advanceAuthenticator = advanceAuthenticator;
    }

    @Override
    public final void login(String username, String password) {
        String token = this.getToken(username, password);
        this.advanceAuthenticator.login(token);
    }

    @Override
    public final void logout() {
        this.advanceAuthenticator.logout();
    }


    protected abstract String getToken(String username, String password);
}
