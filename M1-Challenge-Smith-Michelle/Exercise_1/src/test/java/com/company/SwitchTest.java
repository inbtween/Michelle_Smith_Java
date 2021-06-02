package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class SwitchTest {

    @Test
    public void shouldBeOneMonth() {
//        (1/2) instantiating a new Switch object
        Switch monthSwitch = new Switch();
//        Arrange
        String whatIExpect = "January";

//        Act, (2/2) now that I have instantiated a new Switch
        String whatIGot = monthSwitch.convertMonth(1);

//        Assert
        assertEquals(whatIExpect, whatIGot);

    }

    @Test
    public void shouldReturnOneDay() {
//        (1/2) instantiating a new If object
        Switch daySwitch = new Switch();
//        Arrange
        String whatIExpect = "Sunday";

//        Act, (2/2) now that I have instantiated a new If object Class
        String whatIGot = daySwitch.convertDay(1);

//        Assert
        assertEquals(whatIExpect, whatIGot);

    }

    @Test
    public void ifNumberIsOutsideOfMonthRange() {
        //        (1/2) instantiating a new Switch object
        Switch monthSwitch = new Switch();

//        Arrange
        String whatIExpect = "This number does not correspond to any month, Please a number between 1 & 12";

//        Act
        String whatIGot = monthSwitch.convertMonth(100);

//          Assert
        assertEquals(whatIExpect, whatIExpect);
    }

    @Test
    public void ifNumberIsOutsideOfDayRange() {
        //        (1/2) instantiating a new Switch object
        Switch daySwitch = new Switch();

        //        Arrange
        String whatIExpect = "Please enter a number between 1 and 7";

        //        Act
        String whatIGot = daySwitch.convertDay(33);

//          Assert
        assertEquals(whatIExpect, whatIExpect);

    }


}

