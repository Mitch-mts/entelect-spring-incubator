package com.example.utility.patterns.bahavioral.memento;

import java.util.Stack;

class TextEditorHistory {
    private final Stack<Memento> history = new Stack<>();

    public void save(TextEditor editor) {
        history.push(editor.save());
    }

    public void undo(TextEditor editor) {
        if (!history.isEmpty()) {
            editor.restore(history.pop());
        }
    }
}