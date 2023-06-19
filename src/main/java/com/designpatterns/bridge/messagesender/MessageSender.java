package com.designpatterns.bridge.messagesender;

import com.designpatterns.bridge.acknowledgement.Acknowledge;
import com.designpatterns.bridge.logger.Logger;

public interface MessageSender {

    void sendMessage(String message);

    void setLogger(Logger logger);


    void sendMessage(String message, Acknowledge acknowledge);
}
