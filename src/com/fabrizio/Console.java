package com.fabrizio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Console{
    static Scanner scanner = new Scanner(System.in);

    static public void startGame(String game){
        System.out.println("Welcome to  " + game);
    }


    static public void log(String output){
        System.out.println(output);
    }

    static public void log(int output){
        System.out.println(output);
    }

    public static List<Integer> userChoices() {

        List<Integer> modifiers = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("armor: ");
        modifiers.add(scanner.nextInt());
        System.out.print("Defense: ");
        modifiers.add(scanner.nextInt());
        return modifiers;
    }
}
