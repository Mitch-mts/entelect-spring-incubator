package com.example.utility.patterns.structural.composite;

public class CompositePatternDemo {
    /*
    *
    * Composite is a structural design pattern that lets you compose
    * objects into tree structures and then work with these structures as if they were individual objects.    * */
    public static void main(String[] args) {
        Folder root = new Folder("Root");
        Folder subfolder1 = new Folder("Subfolder1");
        Folder subfolder2 = new Folder("Subfolder2");

        File file1 = new File("File1.txt");
        File file2 = new File("File2.txt");
        File file3 = new File("File3.txt");

        subfolder1.addComponent(file1);
        subfolder1.addComponent(file2);
        subfolder2.addComponent(file3);

        root.addComponent(subfolder1);
        root.addComponent(subfolder2);

        root.showDetails();
    }
}
