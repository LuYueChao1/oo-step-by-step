package com.thoughtworks.basic;

import  org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class PersonTest {
    @Test
    public  void  given_a_person_named_Tom_21_years_old_when_say_should_return_right_introduce(){
        Person person=new Person( "Tom" ,21);
        assertEquals("My name is Tom. I am 21 years old.",person.introduce());
    }
}
