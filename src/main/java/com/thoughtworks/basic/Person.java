package com.thoughtworks.basic;

public class Person {
    private String name;
    private  int age;
    Person(String name, int age){
        this.name=name;
        this.age=age;
    }
    public String introduce(){
        return "My name is "+this.name+"."+" I am "+this.age+" years old.";
    }
}
