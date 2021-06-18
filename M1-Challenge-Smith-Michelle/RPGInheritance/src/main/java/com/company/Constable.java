package com.company;

public class Constable extends Character {
//        PROPERTIES
// Generate -> Constructor
    protected String name = "Man";
    protected int strength = 60;
    protected int health = 100;
    protected int stamina = 60;
    protected int speed = 20;
    protected int attackPower = 5;
    protected String jurisdiction = "Buttonwood";

    public Constable(String name, int strength, int health, int stamina, int speed, int attackPower, String jurisdiction) {
        this.name = name;
        this.strength = strength;
        this.health = health;
        this.stamina = stamina;
        this.speed = speed;
        this.attackPower = attackPower;
        this.jurisdiction = jurisdiction;
    }

    public Constable(String man, int strength, int health, int stamina, int speed, int attackPower) {
        super();
    }

    //      ABILITIES / METHODS()
    public void arrest() {
    }
    public void heal() {
    }

}
