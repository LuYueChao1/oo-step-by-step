package com.thoughtworks.basic;

public class Person {
    public String name;
    public  int age;
    Person(String name, int age){
        this.name=name;
        this.age=age;
    }
    public String introduce(){
        return "My name is "+this.name+"."+" I am "+this.age+" years old.";
    }
}
