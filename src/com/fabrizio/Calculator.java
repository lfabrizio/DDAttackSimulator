package com.fabrizio;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Calculator extends Die {
    static Scanner scanner = new Scanner(System.in);
    private int armorClass;
    private int defenseModifier;
    private int attackModifier;
    private String damageDice;
    private int totalDamage;
    private int enemyTotal;
    private Die die20 = new Die();

    public Calculator() {
        //empty constructor
    }

    public Calculator(int armorClass, int defenseModifier, int attackModifier, String damageDice) {
        this.armorClass = armorClass;
        this.defenseModifier = defenseModifier;
        this.attackModifier = attackModifier;
        this.damageDice = damageDice;
    }
  //  create a Calculator class that has the attack method: it should accept the following: ac= armour class
    public int attacker(int ac, int defenseModifier, int attackModifier, String damageDice) {
        Random random = new Random();
        // roll the 20-sided die
        die20.roll(random);
        System.out.print("Die20: " + die20.getDieValue());
        System.out.println("\n-------\n");

        // rules state that Armour and defense Modifier is the enemy number to beat
        enemyTotal = ac + defenseModifier;
        Die damageDiceOne = new Die();
        if (die20.getDieValue() + attackModifier > enemyTotal) {
            System.out.println("You have hit the Enemy!");
            damageDiceOne.roll(damageDice);
        } else{
            System.out.println("You missed the enemy");
        }

        if (die20.getDieValue() == 20) {
            System.out.println("Critical Hit!");
            System.out.print("Roll Again 2X");
            int damageRollOne = damageDiceOne.roll(damageDice);
            System.out.println("Attack Hit Enemy!" + damageRollOne);

            Die damageDiceTwo = new Die();
            int damageTwo = damageDiceTwo.roll(damageDice);
            System.out.println("Second Attack is : "+ damageTwo);

            int rollTotal = damageRollOne + damageTwo;

            System.out.println("Your Total Damage is :" + rollTotal);
            return rollTotal;
        }
        if (die20.getDieValue() == 1) {
            totalDamage = 0;
            System.out.println("Critical Miss!" + totalDamage);
            return totalDamage;
        }
        if(die20.getDieValue() > 1 && die20.getDieValue() <= 19){
            totalDamage = damageDiceOne.roll(damageDice);
            System.out.println("You Hit the Enemy with a Damage of " + totalDamage);
            return totalDamage;
        }
        return totalDamage;
    }
}

