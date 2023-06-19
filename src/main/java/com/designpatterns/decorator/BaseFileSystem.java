package com.designpatterns.decorator;

import java.io.*;
import java.nio.file.Files;

public class BaseFileSystem implements FileSystem{
    @Override
    public String read(String name) throws FileNotFoundException {
        StringBuilder sb = new StringBuilder();
        File file = new File(name);
        if(!file.exists()){
            throw new FileNotFoundException("File not found : "+ name);
        }
        try(BufferedReader br = new BufferedReader(new FileReader(file))) {
            String st;
            while ((st = br.readLine()) != null)
                sb.append(st).append("\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return sb.toString();
    }

    @Override
    public void write(String name, String content) throws FileNotFoundException {
        File file = new File(name);
        if(!file.exists()){
            throw new FileNotFoundException("File not found : "+ name);
        }
        try {
            Files.writeString(file.toPath(), content);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
