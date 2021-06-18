package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class ConverterIfTest {

    @Test
    public void shouldReturnOneMonth() {
//        (1/2) instantiating a new Switch object
        ConverterIf monthConverterIf = new ConverterIf();
//        Arrange
        String whatIExpect = "January";

//        Act, (2/2) now that I have instantiated a new Switch object Class
        String whatIGot = monthConverterIf.convertMonth(1);

//        Assert
        assertEquals(whatIExpect, whatIGot);

    }

    @Test
    public void shouldReturnOneDay() {
//        (1/2) instantiating a new If object
        ConverterIf monthConverterIf = new ConverterIf();
//        Arrange
        String whatIExpect = "Please enter a number between 1 and 7";

//        Act, (2/2) now that I have instantiated a new If object Class
        String whatIGot = monthConverterIf.convertDay(12);

//        Assert
        assertEquals(whatIExpect, whatIGot);

    }

}