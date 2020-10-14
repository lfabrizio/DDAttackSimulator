package com.fabrizio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Console {
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
