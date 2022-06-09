package com.encapsulation;

public class Person {

    private String name;

    private int age;

    private String ssn;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if(age < 0) {
            return;
        }
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getSsn() {
        return "**" + ssn.substring(2, 6);
    }
}
