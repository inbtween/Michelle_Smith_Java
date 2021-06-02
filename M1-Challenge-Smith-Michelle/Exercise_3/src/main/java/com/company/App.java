package com.company;

public class App {
    public static void main(String[] args) {
        System.out.println("Ice-cream Shop: ========================");
        System.out.println("What flavor of ice-cream would you like?");
        IceCreamPOS iceCreamShop = new IceCreamPOS();
        System.out.println(iceCreamShop.getFlavor());

        System.out.println("Would you like a cone or cup?" );
        System.out.println(iceCreamShop.getContainer());

        System.out.println("How many scoops would you like? ");
        System.out.println(iceCreamShop.getScoops());


        System.out.println("==============================");
        System.out.println("Factory Ice-cream Batch making costs");

        System.out.println("How many pounds of sugar to make a batch ice-cream? ");
        IceCreamFactory iceCreamFactory1 = new IceCreamFactory();
        System.out.println(iceCreamFactory1.getSugarCost());

        System.out.println("How many gallons of cream to make a batch ice-cream? ");
        System.out.println(iceCreamFactory1.getCreamCost());

        System.out.println("How much milk do you need to make a batch of ice-cream ");
        System.out.println(iceCreamFactory1.getMilkCost());
    }
}
