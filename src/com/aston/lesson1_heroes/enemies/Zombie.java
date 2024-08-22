package com.aston.lesson1_heroes.enemies;

import com.aston.lesson1_heroes.specialty.Rise;

public class Zombie extends Enemy implements Rise {
    private static final String NAME_ENEMY = "Zombie";
    private int countRise = 1;

    public Zombie(int health) {
        super(health, NAME_ENEMY);
    }

    @Override
    public void rise() {
        if (getHealth() <= 0) {
            if (countRise > 0) {
                System.out.printf("%s воскрес! + 10хп\n", NAME_ENEMY);
                setHealth(10);
                countRise--;
            }
        }
    }

    @Override
    public void takeDamage(int damage) {
        super.takeDamage(damage);
        rise();
    }
}
