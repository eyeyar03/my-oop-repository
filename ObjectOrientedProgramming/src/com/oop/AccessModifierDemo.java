package com.oop;

public class AccessModifierDemo {

    public String name;

    public void doSomething() {
        System.out.println("Doing something");
    }

    public void doSomethingElse() {
        System.out.println(name);
        doSomething();
        protectedMethod();
        defaultMethod();
        privateMethod();
    }

    protected void protectedMethod() {
        System.out.println("protectedMethod");
    }

    void defaultMethod() {
        System.out.println("defaultMethod");
    }

    private void privateMethod() {
        System.out.println("privateMethod");
    }
}
