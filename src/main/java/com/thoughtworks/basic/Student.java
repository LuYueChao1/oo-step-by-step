package com.thoughtworks.basic;

public class Student extends Person{
    private SchoolClass schoolClass;
    Student (String name,int age,SchoolClass schoolClass){
        super(name,age);
        this.schoolClass=schoolClass;
    }
    public String introduce(){
        return "My name is "+this.name+"."+" I am "+this.age+" years old."+" I am a Student of Class "+this.schoolClass.classNumber;
    }
    public SchoolClass getSchoolClass(){
        return this.schoolClass;
    }
}
