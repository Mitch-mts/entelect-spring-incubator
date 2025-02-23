package com.example.utility.patterns.bahavioral.memento;

public class MementoPatternExample {
    public static void main(String[] args) {
        /*
         *Memento is a behavioral design pattern that lets you save and restore the previous state of an object
         *without revealing the details of its implementation.
         * */
        TextEditor editor = new TextEditor();
        TextEditorHistory history = new TextEditorHistory();

        editor.type("Hello, ");
        history.save(editor); // Save state

        editor.type("World!");
        history.save(editor); // Save state

        System.out.println("Current Content: " + editor.getContent()); // Output: Hello, World!

        history.undo(editor); // Undo last change
        System.out.println("After Undo: " + editor.getContent()); // Output: Hello, 

        history.undo(editor); // Undo again
        System.out.println("After Undo Again: " + editor.getContent()); // Output: (empty)
    }
}