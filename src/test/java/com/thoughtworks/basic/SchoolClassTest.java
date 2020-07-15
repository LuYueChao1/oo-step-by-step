package com.thoughtworks.basic;

import  org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class SchoolClassTest {
    @Test
    public void given_a_schoolClass_should_contain_many_student_one_teacher() throws Exception {
        Teacher teacherMatt=new Teacher("Matt",30,"teacher");
        SchoolClass schoolClass=new SchoolClass(teacherMatt,1);
        Student studentXiaoming=new Student("studentXiaoming",12,schoolClass);
        Student studentXiaoqiang=new Student("studentXiaoqiang",13,schoolClass);
        assertEquals(teacherMatt,schoolClass.getTeacher());
    }
    @Test
    public void given_a_student_his_class_should_be_object() throws Exception {
        Teacher teacher=new Teacher("Matt",30,"teacher");
        SchoolClass schoolClass=new SchoolClass(teacher,1);
        Student studentXiaoming=new Student("studentXiaoming",12,schoolClass);
        assertEquals(true,studentXiaoming.getSchoolClass() instanceof SchoolClass);
    }

    @Test
    public void given_a_student_when_change_name_tell_classmates_and_teacher() throws Exception {
        Teacher teacher=new Teacher("Matt",30,"teacher");
        SchoolClass schoolClass=new SchoolClass(teacher,1);
        Student studentXiaoming=new Student("studentXiaoming",12,schoolClass);
        Student studentXiaoqiang=new Student("studentXiaoqiang",13,schoolClass);
        studentXiaoming.changeName("newXiaoming");
        assertEquals("My name has been changed from studentXiaoming to newXiaoming",studentXiaoqiang.getAcceptedMessage());
        assertEquals("My name has been changed from studentXiaoming to newXiaoming",teacher.getAcceptedMessage());
    }

    @Test
    public void given_a_student_when_change_class_should_tell_new_and_old_classmates_teacher() throws Exception {
        Teacher teacher1=new Teacher("Matt",30,"teacher");
        Teacher teacher2=new Teacher("Mark",25,"teacher");
        SchoolClass schoolClass1=new SchoolClass(teacher1,1);
        SchoolClass schoolClass2=new SchoolClass(teacher2,2);
        Student studentXiaoming=new Student("studentXiaoming",12,schoolClass1);
        Student studentXiaoqiang=new Student("studentXiaoqiang",13,schoolClass1);
        Student studentXiaohong=new Student("studentXiaoming",12,schoolClass2);
        Student studentXiaoxiao=new Student("studentXiaoqiang",13,schoolClass2);
        studentXiaoming.changeClass(schoolClass2);
        assertEquals("My name is Tom. I am 21 years old. I will be a student of Class 2",studentXiaoqiang.getAcceptedMessage());
        assertEquals("My name is Tom. I am 21 years old. I am a student of Class 2 now.",studentXiaohong.getAcceptedMessage());
    }
}
