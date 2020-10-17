package com.fabrizio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calculator {
    static Scanner scanner = new Scanner(System.in);
    private int armorClass;
    private int defenseModifier;
    private int attackModifier;
    private String damageDice;
    private int totalDamage;

    public Calculator(){
        //empty
    }

    public Calculator(int armorClass, int defenseModifier, int attackModifier, String damageDixe) {
        this.armorClass = armorClass;
        this.defenseModifier = defenseModifier;
        this.attackModifier = attackModifier;
        this.damageDice = damageDixe;
    }

    public static void attack(int dieValue, int defenseModifier) {
        if (dieValue == 20) {
            System.out.println("critical attack hit!");
        }
        if (dieValue == 1) {
            System.out.println("critical miss!");
        }
        if (dieValue < defenseModifier) {
            System.out.println("miss!");
        }
        if (dieValue > defenseModifier) {
            System.out.println("hit!!");
        }
    }

    //setup method similar to Yahtzee re-roll
    static public List<Integer> Attacker() {
        System.out.print("Attack Opponent!! Enter Damage 1-20 ");
        String attack1 = scanner.nextLine();
        String[] attackArray = attack1.split("d");
        int dice = Integer.parseInt(attackArray[0]);
        int diceSides = Integer.parseInt(attackArray[1]);
        List<Integer> choices = new ArrayList<>();
        for (String choice : attackArray) {
            choices.add(Integer.parseInt(choice));
        }
        return choices;
    }
}