package com.aston.homework1_heroes.heroes;

import com.aston.homework1_heroes.enemies.Enemy;
import com.aston.homework1_heroes.specialty.Mortal;

public class Warrior extends Hero implements Mortal {
    private static final int DAMAGE_ATTACK = 5;

    public Warrior(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.printf("%s атакует %s!\n", getName(), enemy.getName());
        enemy.takeDamage(DAMAGE_ATTACK);
        System.out.printf("У %s осталось %d хп!\n", enemy.getName(), enemy.getHealth());
    }

    @Override
    public boolean isAlive() {
        return getHealth() > 0;
    }
}
