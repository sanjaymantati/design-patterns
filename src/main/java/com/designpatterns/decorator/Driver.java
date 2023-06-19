package com.designpatterns.decorator;

import java.io.FileNotFoundException;

public class Driver {


    public static void main(String[] args) throws FileNotFoundException {
        String fileName = "C:\\Users\\Dev1016\\Desktop\\data.txt";
        String data = """
                Hello there, this is a sample text for text file.
                Hope, it would help.
                """;
        FileSystem fileSystem = new BaseFileSystem();
        fileSystem = new EncryptionDecorator(fileSystem);
        fileSystem.write(fileName, data);

        System.out.println(fileSystem.read(fileName));
    }
}
