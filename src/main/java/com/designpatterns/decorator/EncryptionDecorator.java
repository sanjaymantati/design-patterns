package com.designpatterns.decorator;

import java.util.Arrays;
import java.util.Base64;
import java.util.stream.Collectors;

public class EncryptionDecorator extends AbstractFileSystemDecorator {
    public EncryptionDecorator(FileSystem fileSystem) {
        super(fileSystem);
    }

    @Override
    public String decorateRead(String data) {
        return Arrays.stream(data.split("\n"))
                .map(r -> new String(Base64.getDecoder().decode(r.getBytes())))
                .collect(Collectors.joining("\n"));
    }
    @Override
    public String decorateWrite(String data) {
        return Base64.getEncoder().encodeToString(data.getBytes());
    }
}
