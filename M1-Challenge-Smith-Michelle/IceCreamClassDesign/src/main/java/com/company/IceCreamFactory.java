package com.company;

import java.util.Scanner;

public class IceCreamFactory {

    private double costOfCream;
    private double costOfMilk;
    private int lbsOfSugar;


    public double getSugarCost() {
//    Cost of sugar in a batch
        Scanner scan = new Scanner(System.in);
        double lbsOfSugar = Integer.parseInt(scan.nextLine());
        double costOfSugar = 11.5;
        return costOfSugar * lbsOfSugar ;
    }

    public double getCreamCost() {
        //    Cost of cream in a batch
        Scanner scan = new Scanner(System.in);
        double gallonsOfCream = Integer.parseInt(scan.nextLine());
        double costOfCream = 44;
        return costOfCream * gallonsOfCream;
    }

    public double getMilkCost() {
//        cost of milk
        Scanner scan = new Scanner(System.in);
        double gallonsOfMilk = Integer.parseInt(scan.nextLine());
        double costOfMilk = 3.56;
        return costOfMilk * gallonsOfMilk;

    }




}




