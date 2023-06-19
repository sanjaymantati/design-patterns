package com.designpatterns.bridge;

import com.designpatterns.bridge.acknowledgement.Acknowledge;
import com.designpatterns.bridge.acknowledgement.CacheAcknowledge;
import com.designpatterns.bridge.messageLoggerBridge.MessageLoggerBridge;
import com.designpatterns.bridge.messagesender.EmailSender;

public class
Driver {

    public static void main(String[] args) {
//        Logger logger = new TracerLogger();
        Acknowledge acknowledge = new CacheAcknowledge();
        MessageLoggerBridge bridge = new MessageLoggerBridge(new EmailSender(), null, acknowledge);
        bridge.sendMessage("Hello there.");
    }
}
