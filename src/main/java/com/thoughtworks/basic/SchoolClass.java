package com.thoughtworks.basic;

import java.util.ArrayList;
import java.util.List;

public class SchoolClass {
    private List<Student> studentList;
    private Teacher teacher;
    public int classNumber;
    SchoolClass(Teacher teacher,int classNumber){
        this.studentList=new ArrayList<Student>();
        this.teacher=teacher;
        this.classNumber=classNumber;
    }

    public List<Student> getStudentList(){
        return this.studentList;
    }
    public  Teacher getTeacher(){
        return this.teacher;
    }

    public void tellStudentTeacher(String message){
        this.teacher.acceptMessage(message);
        for (Student student:this.studentList){
            student.acceptMessage(message);
        }
    }

    public void removeStudent(Student student) throws Exception {
        if(this.studentList.contains(student)){
            this.studentList.remove(student);
        }else {
            throw new Exception("该学生不在此班级");
        }
    }

    public void addStudent(Student student) throws Exception {
        if(this.studentList.contains(student)){
            throw new Exception("该学生已在此班级");
        }else {
            this.studentList.add(student);
        }
    }
}
