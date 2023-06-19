package com.designpatterns.bridge.messagesender;

import com.designpatterns.bridge.acknowledgement.Acknowledge;
import com.designpatterns.bridge.logger.Logger;

import java.util.Objects;
import java.util.Optional;

public class SMSSender implements MessageSender {

    private Logger logger = Logger.getDefaultLogger();
    @Override
    public void setLogger(Logger logger) {
        Optional.ofNullable(logger).ifPresent(r -> this.logger = r);
    }


    public void sendMessage(String message) {
        this.sendMessage(message, null);
    }

    @Override
    public void sendMessage(String message, Acknowledge acknowledge) {

        Objects.requireNonNull(message, "Message is required");
        this.logger.info("Sending message through SMS : " + message);
        Optional.ofNullable(acknowledge).ifPresent(r -> r.acknowledge(message));
    }
}
