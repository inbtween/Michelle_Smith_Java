package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class ConverterSwitchTest {

    @Test
    public void shouldBeOneMonth() {
//        (1/2) instantiating a new Switch object
        ConverterSwitch monthConverterSwitch = new ConverterSwitch();
//        Arrange
        String whatIExpect = "January";

//        Act, (2/2) now that I have instantiated a new Switch
        String whatIGot = monthConverterSwitch.convertMonth(1);

//        Assert
        assertEquals(whatIExpect, whatIGot);

    }

    @Test
    public void shouldReturnOneDay() {
//        (1/2) instantiating a new If object
        ConverterSwitch dayConverterSwitch = new ConverterSwitch();
//        Arrange
        String whatIExpect = "Sunday";

//        Act, (2/2) now that I have instantiated a new If object Class
        String whatIGot = dayConverterSwitch.convertDay(1);

//        Assert
        assertEquals(whatIExpect, whatIGot);

    }

    @Test
    public void ifNumberIsOutsideOfMonthRange() {
        //        (1/2) instantiating a new Switch object
        ConverterSwitch monthConverterSwitch = new ConverterSwitch();

//        Arrange
        String whatIExpect = "This number does not correspond to any month, Please a number between 1 & 12";

//        Act
        String whatIGot = monthConverterSwitch.convertMonth(100);

//          Assert
        assertEquals(whatIExpect, whatIExpect);
    }

    @Test
    public void ifNumberIsOutsideOfDayRange() {
        //        (1/2) instantiating a new Switch object
        ConverterSwitch dayConverterSwitch = new ConverterSwitch();

        //        Arrange
        String whatIExpect = "Please enter a number between 1 and 7";

        //        Act
        String whatIGot = dayConverterSwitch.convertDay(33);

//          Assert
        assertEquals(whatIExpect, whatIExpect);

    }


}

