package com.designpatterns.bridge.logger;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Optional;

public class DefaultLogger implements Logger {


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

    private void log(String message, String logLevel){
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss.SSS");

        System.out.printf("%s : %s : %s %n",dateFormat.format(new Date()) , logLevel, Optional.ofNullable(message).orElse(""));
    }
}
