package com.example.utility.abstractpattern;

public class MacOSWidgetFactory implements WidgetFactory{
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
