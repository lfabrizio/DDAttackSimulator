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
        System.out.println("Die20:" + die20.getDieValue());

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
            int damageRoll = damageDiceOne.roll(damageDice);
            System.out.println("Attack Hit Enemy!" + damageRoll);
        }
        if (die20.getDieValue() == 1) {
            System.out.println("Critical Miss!");
        }
        if(die20.getDieValue() > 1 && die20.getDieValue() <= 19){
            System.out.println("Hit damage");
        }
        return totalDamage;
    }
}

