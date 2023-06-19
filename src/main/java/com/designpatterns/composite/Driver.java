package com.designpatterns.composite;

import com.designpatterns.composite.filefolder.DirectoryObject;
import com.designpatterns.composite.filefolder.FSComponent;
import com.designpatterns.composite.filefolder.FileObject;

import javax.naming.OperationNotSupportedException;

public class Driver {


    public static void main(String[] args) throws OperationNotSupportedException {
        FSComponent directory = new DirectoryObject("root");
        directory.addComponent(new FileObject("data.txt", 50));
        FSComponent level1FSComponent =  new DirectoryObject("level1");
        level1FSComponent.addComponent(new FileObject("data2.txt", 100));
        directory.addComponent(level1FSComponent);
        System.out.println(directory.toString());
//        System.out.println("directory.getAllFileObjects() = " + directory.getAllFileObjects());
//        directory.addFileObject();
    }
}
