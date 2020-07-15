package com.thoughtworks.basic;

import  org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StudentTest {
    @Test
    public void given_a_student_named_Tom_aged_21_classNumber_2_when_introduceSelf_should_get_right_result(){
        Teacher teacher=new Teacher("Matt",30,"teacher");
        SchoolClass schoolClass=new SchoolClass(teacher,2);
        Student student =new Student("Tom",21,schoolClass);
        assertEquals("My name is Tom. I am 21 years old. I am a Student of Class 2.",student.introduce()+".");
    }
}
