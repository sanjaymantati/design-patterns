package com.designpatterns.builder;

import java.util.Objects;

public final class DataSourceCredentialsBuilder {
    private String host;
    private byte[] username;
    private byte[] password;
    private byte[] dbName;
    private String queryParams;

    DataSourceCredentialsBuilder() {
    }

    public DataSourceCredentialsBuilder host(String host) {
        this.host = host;
        return this;
    }

    public DataSourceCredentialsBuilder username(byte[] username) {
        this.username = username;
        return this;
    }

    public DataSourceCredentialsBuilder password(byte[] password) {
        this.password = password;
        return this;
    }

    public DataSourceCredentialsBuilder dbName(byte[] dbName) {
        this.dbName = dbName;
        return this;
    }

    public DataSourceCredentialsBuilder queryParams(String queryParams) {
        this.queryParams = queryParams;
        return this;
    }

    @Override
    protected DataSourceCredentialsBuilder clone(){
        DataSourceCredentialsBuilder builder = new DataSourceCredentialsBuilder();
        builder.setHost(this.host);
        builder.setUsername(this.username);
        builder.setPassword(this.password);
        builder.setDbName(this.dbName);
        builder.setQueryParams(this.queryParams);
        return builder;
    }

    public DataSourceCredentials build() {
        Objects.requireNonNull(this.host, "host is required.");
        Objects.requireNonNull(this.username, "username is required.");
        Objects.requireNonNull(this.dbName, "dbName is required.");
        return new DataSourceCredentials(this.clone());
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public byte[] getUsername() {
        return username;
    }

    public void setUsername(byte[] username) {
        this.username = username;
    }

    public byte[] getPassword() {
        return password;
    }

    public void setPassword(byte[] password) {
        this.password = password;
    }

    public byte[] getDbName() {
        return dbName;
    }

    public void setDbName(byte[] dbName) {
        this.dbName = dbName;
    }

    public String getQueryParams() {
        return queryParams;
    }

    public void setQueryParams(String queryParams) {
        this.queryParams = queryParams;
    }
}