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
        //empty
    }

    public Calculator(int armorClass, int defenseModifier, int attackModifier, String damageDice) {
        this.armorClass = armorClass;
        this.defenseModifier = defenseModifier;
        this.attackModifier = attackModifier;
        this.damageDice = damageDice;
    }
  //  create a Calculator class that has the attack method: it should accept the following: ac= armour class
    public int attack(int ac, int defenseModifier, int attackModifier, String damageDice) {
        Random random = new Random();
        // rol the 20-sided die
        die20.roll(random);
        System.out.println("Die20:" + die20.getDieValue());

        // rules state that Armour and defense Modfier is the enemy number to beat
        enemyTotal = ac + defenseModifier;

        if (die20.getDieValue() + attackModifier > enemyTotal) {
            System.out.println("You have hit the Enemy!");
        } else{
            System.out.println("You missed the enemy");
        }

        if (die20.getDieValue() == 20) {
            System.out.println("Critical Hit!");
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
    //setup method similar to Yahtzee re-roll-- out of bounds error
//    static public List<Integer> Attacker() {
//        System.out.print("Attack Opponent!! Enter Damage 1-20 ");
//        String attack1 = scanner.nextLine();
//        String[] attackArray = attack1.split("d");
//        int dice = Integer.parseInt(attackArray[0]);
//        int diceSides = Integer.parseInt(attackArray[1]);
//        List<Integer> choices = new ArrayList<>();
//        for (String choice : attackArray) {
//            choices.add(Integer.parseInt(choice));
//        }
//        return choices;
//    }
