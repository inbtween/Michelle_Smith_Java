package com.company;

public class Warrior extends Character {
//      PROPERTIES
protected String name = "Xi";
    protected int strength = 75;
    protected int health = 100;
    protected int stamina = 100;
    protected int speed = 50;
    protected int attackPower = 10;
    protected int shieldStrength = 100;

    public Warrior(String name, int strength, int health, int stamina, int speed, int attackPower, int shieldStrength) {
        this.name = name;
        this.strength = strength;
        this.health = health;
        this.stamina = stamina;
        this.speed = speed;
        this.attackPower = attackPower;
        this.shieldStrength = shieldStrength;
    }

//      ABILITIES / METHODS()

    public void decreaseShieldStrength() {
    }



}
