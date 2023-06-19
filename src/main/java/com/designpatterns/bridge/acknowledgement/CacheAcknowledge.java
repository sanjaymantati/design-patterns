package com.designpatterns.bridge.acknowledgement;

import com.designpatterns.bridge.logger.Logger;

import java.util.Optional;

public class CacheAcknowledge implements Acknowledge {


    private Logger logger = Logger.getDefaultLogger();

    @Override
    public void setLogger(Logger logger) {

        Optional.ofNullable(logger).ifPresent(r -> this.logger = r);
    }

    @Override
    public void acknowledge(String message) {
        this.logger.debug("Acknowledged in Cache service.");
    }
}
