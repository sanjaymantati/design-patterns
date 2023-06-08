package com.designpatterns.builder;

import java.util.Objects;

public class DataSourceCredentials {

    private final String host;
    private final byte[] username;
    private final byte[] password;
    private final byte[] dbName;
    private final String queryParams;

    DataSourceCredentials(DataSourceCredentialsBuilder builder) {
        this.host = builder.getHost();
        this.username = builder.getUsername();
        this.password = builder.getPassword();
        this.dbName = builder.getDbName();
        this.queryParams = builder.getQueryParams();
    }

}
