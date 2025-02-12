package com.example.utility;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    private static final String NAME = "John Wick";
    private static final String NAME_OTHER = "Anna Jones";

    @Test
    void givenSingletonScope_whenSetName_thenEqualNames() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("scopes.xml");

        Person personSingletonA = (Person) applicationContext.getBean("personSingleton");
        Person personSingletonB = (Person) applicationContext.getBean("personSingleton");

        personSingletonA.setName(NAME);
        assertEquals(NAME, personSingletonB.getName());

        ((AbstractApplicationContext) applicationContext).close();
    }

    @Test
    void givenPrototypeScope_whenSetNames_thenDifferentNames() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("prototype.xml");

        Person personPrototypeA = (Person) applicationContext.getBean("personPrototype");
        Person personPrototypeB = (Person) applicationContext.getBean("personPrototype");

        personPrototypeA.setName(NAME);
        personPrototypeB.setName(NAME_OTHER);

        assertEquals(NAME, personPrototypeA.getName());
        assertEquals(NAME_OTHER, personPrototypeB.getName());

        ((AbstractApplicationContext) applicationContext).close();
    }



}