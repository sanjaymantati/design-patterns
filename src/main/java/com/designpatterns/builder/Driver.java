package com.designpatterns.builder;

public class Driver {
    public static void main(String[] args) {
        DataSourceCredentials credentials = new DataSourceCredentialsBuilder()
                .host("jdbc:mysql://localhost:3307/montran")
                .username("root".getBytes())
                .password("rootPassword".getBytes())
                .dbName("name".getBytes())
                .build();
    }
}
