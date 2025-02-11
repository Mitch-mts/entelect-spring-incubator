package com.example.utility.abstractpattern;

public class WindowsWidgetFactory implements WidgetFactory{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
