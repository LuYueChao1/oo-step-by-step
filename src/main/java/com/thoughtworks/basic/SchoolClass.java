package com.thoughtworks.basic;

import java.util.List;

public class SchoolClass {
    private List<Student> studentList;
    private Teacher teacher;
    public int classNumber;
    SchoolClass(List<Student> studentList,Teacher teacher,int classNumber){
        this.studentList=studentList;
        this.teacher=teacher;
        this.classNumber=classNumber;
    }

    public List<Student> getStudentList(){
        return this.studentList;
    }
    public  Teacher getTeacher(){
        return this.teacher;
    }
}
