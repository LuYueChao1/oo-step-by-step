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
    public void  changeName(String name){
        String oldName=this.name;
        this.name=name;
        this.schoolClass.tellStudentTeacher("My name has been changed from "+oldName+" to "+this.name);
    }

    public void changeClass(SchoolClass schoolClass) throws Exception {
        this.schoolClass.tellStudentTeacher("My name is Tom. I am 21 years old. I will be a student of Class "+schoolClass.classNumber);
        this.schoolClass.removeStudent(this);
        this.schoolClass=schoolClass;
        this.schoolClass.addStudent(this);
        this.schoolClass.tellStudentTeacher("My name is Tom. I am 21 years old. I am a student of Class "+schoolClass.classNumber+" now.");
    }

}
