package com.company;

//import com.sun.java.util.jar.pack.Instruction;

import java.util.Scanner;

public class ConverterApplication {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
//      Switch statement
        System.out.println("Please enter the month by number: ");
        int userNumberByMonth = Integer.parseInt(scanner.nextLine());
        //        bring in an obj finding the method of that obj, convertMonth() and convertDay() in the Switch Class
        ConverterSwitch aConverterSwitch = new ConverterSwitch();
        System.out.println(aConverterSwitch.convertMonth(userNumberByMonth));


        System.out.println("Please enter the day by number: ");
        int userNumberByDay = Integer.parseInt(scanner.nextLine());
        System.out.println(aConverterSwitch.convertDay(userNumberByDay));

//      If statement
        System.out.println("Please enter the month by number: ");
        int userNumberByMonthReturnMonth = Integer.parseInt(scanner.nextLine());
        //        bring in an obj finding the method of that obj, convertMonth() and convertDay() in the If Class
        ConverterIf anConverterIf = new ConverterIf();
        System.out.println(anConverterIf.convertMonth(userNumberByMonthReturnMonth));

        System.out.println("Please enter the day by number: ");
        int userNumberByDayReturnDay = Integer.parseInt(scanner.nextLine());
        System.out.println(anConverterIf.convertDay(userNumberByDayReturnDay));


    }







}
