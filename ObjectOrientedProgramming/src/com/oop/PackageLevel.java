package com.oop;

public class PackageLevel {

    public void testMethod() {
        AccessModifierDemo accessModifierDemo = new AccessModifierDemo();
        System.out.println(accessModifierDemo.name);
        accessModifierDemo.doSomething();
        accessModifierDemo.protectedMethod();
        accessModifierDemo.defaultMethod();
    }
}
