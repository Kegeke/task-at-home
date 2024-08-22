package com.aston.lesson1_heroes.heroes;

import com.aston.lesson1_heroes.enemies.Enemy;
import com.aston.lesson1_heroes.specialty.Mortal;

public class Mage extends Hero implements Mortal {
    private static final int DAMAGE = 2;


    public Mage(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getName() + " атакует врага!");
        enemy.takeDamage(DAMAGE);
        System.out.printf("У врага осталось %d хп!\n", enemy.getHealth());
    }

    @Override
    public boolean isAlive() {
        return getHealth() > 0;
    }
}
