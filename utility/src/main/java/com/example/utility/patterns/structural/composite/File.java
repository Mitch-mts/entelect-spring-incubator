package com.example.utility.patterns.structural.composite;

public class File implements FileSystemComponent{
    private String name;
    public File(String name) {
        this.name = name;
    }

    @Override
    public void showDetails() {
        System.out.println("File: " + name);
    }
}
