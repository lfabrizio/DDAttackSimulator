package com.fabrizio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Player {
    private String player; //player 1, 2 etc etc
    private int health; // set to 100% till damaged
    private String gear; //attire or other
    private String classType; // Barbarian, Bard, Fighter, Monk, Wizard, etc.
    private String background; //Noble, Folk Hero, Acolyte, etc.
    private String alignment; //Lawful, Neutral, or Chaotic

    public Player(){
        //empty constructor
    }


    public Player(String player, String classType) {
        this.player = player;
        this.classType = classType;
        health = 100;
    }

    public void playerSelections() {
        System.out.print("Welcome Player: " + player);
        List<String> selections = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
         System.out.print("Select ClassType: ");
        selections.add(scanner.nextLine());
         System.out.print("Select Background: ");
         selections.add(scanner.nextLine());
        System.out.println(selections);
    }

    public int getHealth(int health){
        return health;
    }

    public void setPlayer(String player){
        this.player = player;
    }

    public void setGear(){
        this.gear = gear;
    }

    public String getClassType(String classType){
        return classType;
    }

    public void setClass(String classType){
        this.classType = classType;
    }

    public String getBackground(String background){
        return background;
    }

    public void setBackground(String background){
        this.background = background;
    }

    public String getAlignment(String alignment){
        return alignment;
    }
}
