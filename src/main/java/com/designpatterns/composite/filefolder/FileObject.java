package com.designpatterns.composite.filefolder;

import javax.naming.OperationNotSupportedException;
import java.util.List;
import java.util.Objects;

public class FileObject implements FSComponent {

    private String name;
    private int size;

    public FileObject(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void addComponent(FSComponent fileObject) throws OperationNotSupportedException {
        throw new OperationNotSupportedException("Cannot add FileFolderObject in file.");
    }

    @Override
    public void removeComponent(FSComponent fileObject) throws OperationNotSupportedException {
        throw new OperationNotSupportedException("Cannot remove FileFolderObject in file.");

    }

    @Override
    public List<FSComponent> getAllFileObjects() throws OperationNotSupportedException {
        throw new OperationNotSupportedException("Cannot list FileFolderObject in file.");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FileObject that = (FileObject) o;
        return size == that.size && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, size);
    }

    @Override
    public String toString() {
        return "FileObject{" +
                "name='" + name + '\'' +
                ", size=" + size +
                '}';
    }
}
