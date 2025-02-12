package com.example.utility;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;


public class Person {
    private String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /*
     * an example to illustrate the singleton scope in spring framework
     * */
    @Bean
    @Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
    //@Scope("singleton")
    public Person personSingleton() {
        return new Person();
    }

    /*
     * an example to illustrate the prototype scope in spring framework
     * */
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    //Scope("prototype")
    public Person personPrototype() {
        return new Person();
    }
}
