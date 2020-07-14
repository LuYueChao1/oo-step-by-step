package com.thoughtworks.basic;

public class Teacher extends Person {
    public String job;
    Teacher(String name,int age,String job){
        super(name,age);
        this.job=job;
    }
    public  String  introduce(){
        return "My name is "+this.name+"."+" I am "+this.age+" years old."+" I am a "+this.job+".";
    }
}
