package com.encapsulation;

public class EncapsulationDemo {

    public static void main(String[] args) {
        Person person = new Person();

        person.setName("Jerome");
        person.setAge(16);
        person.setSsn("123456");

        System.out.println(person.getName() + " " + person.getAge());

        person.setAge(-14);
        System.out.println(person.getName() + " " + person.getAge());

        System.out.println(person.getName() + " " + person.getSsn());
    }

}
