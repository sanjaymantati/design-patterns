package com.designpatterns.bridge.acknowledgement;

import com.designpatterns.bridge.logger.Logger;

public interface Acknowledge {

    void acknowledge(String message);
    void setLogger(Logger logger);

    static Acknowledge getDefaultAcknowledge(){
        return new DBAcknowledge();
    }

}
