package com.test;

import com.oop.AccessModifierDemo;

public class SubClass extends AccessModifierDemo {

    public void testMethod() {
        System.out.println(name);
        doSomething();
        protectedMethod();
    }
}
