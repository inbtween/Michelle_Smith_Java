package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class IfTest {

    @Test
    public void shouldReturnOneMonth() {
//        (1/2) instantiating a new Switch object
        If monthIf = new If();
//        Arrange
        String whatIExpect = "January";

//        Act, (2/2) now that I have instantiated a new Switch object Class
        String whatIGot = monthIf.convertMonth(1);

//        Assert
        assertEquals(whatIExpect, whatIGot);

    }

    @Test
    public void shouldReturnOneDay() {
//        (1/2) instantiating a new If object
        If monthIf = new If();
//        Arrange
        String whatIExpect = "Please enter a number between 1 and 7";

//        Act, (2/2) now that I have instantiated a new If object Class
        String whatIGot = monthIf.convertDay(12);

//        Assert
        assertEquals(whatIExpect, whatIGot);

    }

}