package com.designpatterns.decorator;

import java.io.FileNotFoundException;

public interface FileSystem {

    public String read(String name) throws FileNotFoundException;
    public void write(String name, String content) throws FileNotFoundException;


}
