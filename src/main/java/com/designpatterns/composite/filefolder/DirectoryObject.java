package com.designpatterns.composite.filefolder;

import javax.naming.OperationNotSupportedException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class DirectoryObject implements FSComponent {

    List<FSComponent> fsComponentList = new ArrayList<>();
    private String name;


    public DirectoryObject(String name) {
        this.name = name;
    }

    @Override
    public int getSize() {
        return fsComponentList.stream().mapToInt(FSComponent::getSize).sum();
    }

    @Override
    public void addComponent(FSComponent fileObject) throws OperationNotSupportedException {
        fsComponentList.add(fileObject);
    }

    @Override
    public void removeComponent(FSComponent fileObject) throws OperationNotSupportedException {
        fsComponentList.remove(fileObject);
    }

    @Override
    public List<FSComponent> getAllFileObjects() throws OperationNotSupportedException {
        return fsComponentList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DirectoryObject that = (DirectoryObject) o;
        return Objects.equals(fsComponentList, that.fsComponentList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fsComponentList);
    }

    @Override
    public String toString() {
        return "\nDirectoryObject {\n" +
                ", name='" + name + "\'\n" +
                "fsComponentList=" + fsComponentList +

                "\n}";
    }



}
