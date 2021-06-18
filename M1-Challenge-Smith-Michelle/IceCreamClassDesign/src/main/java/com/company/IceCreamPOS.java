package com.company;

import java.util.Scanner;

public class IceCreamPOS {

    private String flavors;
    private String container;
    private int scoops;


    public String getFlavor(){
//        what flavor
        Scanner scan = new Scanner(System.in);
        String flavors = scan.nextLine();
        return flavors;
    }

    public String getContainer() {
//        cone or cup
        Scanner scan = new Scanner(System.in);
        String container = scan.nextLine();
        return container;
    }

    public double getScoops() {
//   one or two scoops
        Scanner scan = new Scanner(System.in);
        int scoops = Integer.parseInt(scan.nextLine());
        return scoops;
    }

}
