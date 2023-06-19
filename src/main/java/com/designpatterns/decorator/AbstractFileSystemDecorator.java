package com.designpatterns.decorator;

import java.io.FileNotFoundException;

public abstract class AbstractFileSystemDecorator implements FileSystem {


    protected final FileSystem fileSystem;

    public AbstractFileSystemDecorator(FileSystem fileSystem) {
        this.fileSystem = fileSystem;
    }

    @Override
    public final String read(String name) throws FileNotFoundException {
        return decorateRead(fileSystem.read(name));
    }

    public abstract String decorateRead(String data);

    @Override
    public final void write(String name, String content) throws FileNotFoundException {

        fileSystem.write(name, decorateWrite(content));
    }

    public abstract String decorateWrite(String data);

}
