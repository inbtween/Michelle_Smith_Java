package com.company;

import java.util.Scanner;

public class ConverterApplication {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
//      Switch statement
        System.out.println("Please enter the month by number: ");
        int userNumberByMonth = Integer.parseInt(scanner.nextLine());
        //        bring in an obj finding the method of that obj, convertMonth() and convertDay() in the Switch Class
        Switch aSwitch = new Switch();
        System.out.println(aSwitch.convertMonth(userNumberByMonth));


        System.out.println("Please enter the day by number: ");
        int userNumberByDay = Integer.parseInt(scanner.nextLine());
        System.out.println(aSwitch.convertDay(userNumberByDay));

//      If statement
        System.out.println("Please enter the month by number: ");
        int userNumberByMonthReturnMonth = Integer.parseInt(scanner.nextLine());
        //        bring in an obj finding the method of that obj, convertMonth() and convertDay() in the If Class
        If anIf = new If();
        System.out.println(anIf.convertMonth(userNumberByMonthReturnMonth));

        System.out.println("Please enter the month by number: ");
        int userNumberByDayReturnDay = Integer.parseInt(scanner.nextLine());
        System.out.println(anIf.convertDay(userNumberByDayReturnDay));


    }







}