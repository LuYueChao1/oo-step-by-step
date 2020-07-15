package com.thoughtworks.basic;

public class Person {
    public String name;
    public  int age;
    private String acceptedMessage;
    Person(String name, int age){
        this.name=name;
        this.age=age;
    }
    public String introduce(){
        return "My name is "+this.name+"."+" I am "+this.age+" years old.";
    }

    public void setName(String name){
        this.name=name;
    }

    public void acceptMessage(String message){
        this.acceptedMessage=message;
    }

    public String getAcceptedMessage(){
        return this.acceptedMessage;
    }
}
