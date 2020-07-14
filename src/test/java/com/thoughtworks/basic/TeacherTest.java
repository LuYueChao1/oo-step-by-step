package com.thoughtworks.basic;

import  org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class TeacherTest {
    @Test
    public void given_a_teacher_named_Matt_aged_30_when_introduceSelf_get_right_result(){
        Teacher teacher=new Teacher("Matt",30,"Teacher");
        assertEquals("My name is Matt. I am 30 years old. I am a Teacher.",teacher.introduce());
    }
}
