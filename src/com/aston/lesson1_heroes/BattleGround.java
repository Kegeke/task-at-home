package com.aston.lesson1_heroes;

import com.aston.lesson1_heroes.enemies.Zombie;
import com.aston.lesson1_heroes.heroes.Archer;
import com.aston.lesson1_heroes.heroes.Mage;
import com.aston.lesson1_heroes.heroes.Warrior;

public class BattleGround {
    public static void main(String[] args) {
        Zombie zombie = new Zombie(30);

        Warrior warrior = new Warrior("Воин", 30);
        Mage mage = new Mage("Маг", 20);
        Archer archer = new Archer("Лучник", 15);

        while (zombie.isAlive()) {
            warrior.attackEnemy(zombie);
            mage.attackEnemy(zombie);
            archer.attackEnemy(zombie);
        }

        System.out.println("Враг повержен!");
    }
}
