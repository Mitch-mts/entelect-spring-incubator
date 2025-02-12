package com.example.utility.patterns.creational.abstractpattern;

public class AbstractFactoryDemo {
    /*
    * Abstract Factory is a creational design pattern that lets you produce families of related objects without specifying their concrete classes.*/
    private Button button;
    private Checkbox checkbox;

    public AbstractFactoryDemo(WidgetFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void renderUI() {
        button.render();
        checkbox.render();
    }

    public static void main(String[] args) {
        WidgetFactory windowsFactory = new WindowsWidgetFactory();
        AbstractFactoryDemo windowsDemo = new AbstractFactoryDemo(windowsFactory);
        System.out.println("Windows UI: ");
        windowsDemo.renderUI();

        WidgetFactory macFactory = new MacOSWidgetFactory();
        AbstractFactoryDemo macDemo = new AbstractFactoryDemo(macFactory);
        System.out.println("\nMac OS UI: ");
        macDemo.renderUI();
    }
}
