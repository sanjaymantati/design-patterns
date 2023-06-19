package com.designpatterns.composite.filefolder;

import javax.naming.OperationNotSupportedException;
import java.util.List;

public interface FSComponent {

    int getSize();
    void addComponent(FSComponent fileObject) throws OperationNotSupportedException;
    void removeComponent(FSComponent fileObject) throws OperationNotSupportedException;
    List<FSComponent> getAllFileObjects() throws OperationNotSupportedException;

}
