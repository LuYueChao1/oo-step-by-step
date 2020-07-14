package com.thoughtworks.basic;

public class Student extends Person{
    private int classNumber;
    Student (String name,int age,int classNumber){
        super(name,age);
        this.classNumber=classNumber;
    }
    public String introduce(){
        return "My name is "+this.name+"."+" I am "+this.age+" years old."+" I am a Student of Class "+this.classNumber;
    }
}
