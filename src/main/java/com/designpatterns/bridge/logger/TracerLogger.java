package com.designpatterns.bridge.logger;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Optional;
import java.util.UUID;

public class TracerLogger implements Logger {
    private final String traceId;

    public TracerLogger() {
        this.traceId = UUID.randomUUID().toString();
    }


    @Override
    public void info(String message) {
        this.log(message, "INFO");

    }

    @Override
    public void warn(String message) {
        this.log(message, "WARN");

    }

    @Override
    public void error(String message) {
        this.log(message, "ERROR");

    }

    @Override
    public void debug(String message) {
        this.log(message, "DEBUG");
    }

    private void log(String message, String logLevel) {
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss.SSS");
        System.out.printf("%s [%s] %s %s %n", dateFormat.format(new Date()), this.traceId, logLevel, Optional.ofNullable(message).orElse(""));
    }
}
