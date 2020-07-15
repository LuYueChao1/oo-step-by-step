package com.thoughtworks.basic;

import  org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class SchoolClassTest {
    @Test
    public void given_a_schoolClass_should_contain_many_student_one_teacher(){

        List<Student> studentList=new ArrayList<Student>();
        Teacher teacherMatt=new Teacher("Matt",30,"teacher");
        SchoolClass schoolClass=new SchoolClass(studentList,teacherMatt,1);
        Student studentXiaoming=new Student("studentXiaoming",12,schoolClass);
        Student studentXiaoqiang=new Student("studentXiaoqiang",13,schoolClass);
        studentList.add(studentXiaoming);
        studentList.add(studentXiaoqiang);
        assertEquals(studentList,schoolClass.getStudentList());
        assertEquals(teacherMatt,schoolClass.getTeacher());
    }
    @Test
    public void given_a_student_his_class_should_be_object(){
        List<Student> studentList=new ArrayList<Student>();
        Teacher teacher=new Teacher("Matt",30,"teacher");
        SchoolClass schoolClass=new SchoolClass(studentList,teacher,1);
        Student studentXiaoming=new Student("studentXiaoming",12,schoolClass);
        assertEquals(true,studentXiaoming.getSchoolClass() instanceof SchoolClass);
    }
}
