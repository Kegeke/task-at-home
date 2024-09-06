package com.aston.homework1_heroes.enemies;

import com.aston.homework1_heroes.specialty.Mortal;

public abstract class Enemy implements Mortal {
    private int health;
    private final String name;

    public Enemy(int health, String name) {
        this.health = health;
        this.name = name;
        System.out.printf("Враг %s c %d хп!\n", name, health);
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void takeDamage(int damage) {
        health -= damage;
    }

    @Override
    public boolean isAlive() {
        return health > 0;
    }
}
