package com.company;

public class App {

    public static void main(String[] args) {
        Constable constable = new Constable("Man",60, 100,60, 20, 5, "Buttonwood");
        Farmer farmer = new Farmer("Mouse", 75,100, 75,10,1);
        Warrior warrior = new Warrior("Xi", 75,100, 100, 50, 10,100  );

        constable.attack();
        farmer.run();
        warrior.decreaseShieldStrength();

    }
}
