package com.fabrizio;

public class Player {
    private int attacker;
    private int hitPoint;
    private int armour;
    private int defense;

    public Player(int attacker, int hitPoint, int armour, int defense){

    }

    public int getAttacker() {
        return attacker;
    }

    public void setAttacker(int attacker) {
        this.attacker = attacker;
    }

    public int getHitPoint() {
        return hitPoint;
    }

    public void setHitPoint(int hitPoint) {
        this.hitPoint = hitPoint;
    }

    public int getArmour() {
        return armour;
    }

    public void setArmour(int armour) {
        this.armour = armour;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }
}
