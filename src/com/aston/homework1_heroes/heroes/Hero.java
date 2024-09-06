package com.aston.homework1_heroes.heroes;

import com.aston.homework1_heroes.enemies.Enemy;

public abstract class Hero {
    private final String name;
    private final int health;

    public Hero(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public abstract void attackEnemy(Enemy enemy);
}
