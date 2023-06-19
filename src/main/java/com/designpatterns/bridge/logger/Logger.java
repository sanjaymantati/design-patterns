package com.designpatterns.bridge.logger;

public interface Logger {

    void info(String message);
    void warn(String message);
    void error(String message);
    void debug(String message);

    static Logger getDefaultLogger(){
      return new DefaultLogger();
    }
}
