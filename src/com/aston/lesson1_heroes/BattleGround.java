package com.aston.lesson1_heroes;

import com.aston.lesson1_heroes.enemies.Zombie;
import com.aston.lesson1_heroes.heroes.Archer;
import com.aston.lesson1_heroes.enemies.Enemy;
import com.aston.lesson1_heroes.heroes.Mage;
import com.aston.lesson1_heroes.heroes.Warrior;

public class BattleGround {
    public static void main(String[] args) {
        Enemy enemy = new Zombie(30);

        Warrior warrior = new Warrior("Воин", 30);
        Mage mage = new Mage("Маг", 20);
        Archer archer = new Archer("Лучник", 15);

        while (enemy.isAlive()) {
            warrior.attackEnemy(enemy);
            mage.attackEnemy(enemy);
            archer.attackEnemy(enemy);
        }

        System.out.println("Враг повержен!");
    }
}
