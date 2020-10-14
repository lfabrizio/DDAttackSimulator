package com.fabrizio;

public class Calculator {

    private int armorClass;
    private int defenseModifier;
    private int attackModifier;
    private String damageDixe;

    public Calculator(int armorClass, int defenseModifier, int attackModifier, String damageDixe) {
        this.armorClass = armorClass;
        this.defenseModifier = defenseModifier;
        this.attackModifier = attackModifier;
        this.damageDixe = damageDixe;
    }
    public static void attack(int dieValue, int defenseModifier){
        if(dieValue == 20){
            System.out.println("critical attack hit!");
        }
        if(dieValue == 1){
            System.out.println("critical miss!");
        }
        if(dieValue < defenseModifier){
            System.out.println("miss!");
        }
        if(dieValue > defenseModifier){
            System.out.println("hit!!");
        }
    }



}
