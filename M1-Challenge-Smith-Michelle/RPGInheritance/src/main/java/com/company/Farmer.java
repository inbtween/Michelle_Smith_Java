package com.company;

public class Farmer extends Character {
//              PROPERTIES
//      right-click, Constructor function
    protected String name = "Mouse";
    protected int strength = 75;
    protected int health = 100;
    protected int stamina = 75;
    protected int speed = 10;
    protected int attackPower = 1;

    public Farmer(String name, int strength, int health, int stamina, int speed, int attackPower) {
        this.name = name;
        this.strength = strength;
        this.health = health;
        this.stamina = stamina;
        this.speed = speed;
        this.attackPower = attackPower;
    }

//              ABILITIES / METHODS()

    public void plow() {
    }
    public void harvest() {
    }
    public void heal() {
    }

}
