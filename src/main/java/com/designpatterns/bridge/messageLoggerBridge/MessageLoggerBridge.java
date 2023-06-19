package com.designpatterns.bridge.messageLoggerBridge;

import com.designpatterns.bridge.acknowledgement.Acknowledge;
import com.designpatterns.bridge.logger.Logger;
import com.designpatterns.bridge.messagesender.MessageSender;

import java.util.Optional;

public class MessageLoggerBridge {

    private final MessageSender sender;
    private final Logger logger;
    private final Acknowledge acknowledge;

    public MessageLoggerBridge(MessageSender sender, Logger logger, Acknowledge acknowledge) {
        this.sender = sender;
        this.logger = logger;
        this.acknowledge = acknowledge;
        Optional.ofNullable(this.logger).ifPresent(this.sender::setLogger);
        Optional.ofNullable(this.acknowledge).ifPresent(r -> {
            Optional.ofNullable(this.logger).ifPresent(r::setLogger);
        });
    }

    public void sendMessage(String message) {

        this.sender.sendMessage(message, this.acknowledge);
    }
}
