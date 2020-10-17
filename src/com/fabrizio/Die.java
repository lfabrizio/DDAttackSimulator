package com.fabrizio;

import java.util.Random;

public class Die {
    private int sides;
    private int dieValue;

// now customize to a 20 sided die
    public Die() {
        dieValue = 1;
        sides = 20;
    }


    public void roll(Random rand) {
        dieValue = rand.nextInt(sides) +1;

    }
    //overloading now pass in ddDice to be ex 2d4
    public int roll(String ddDice) {
        //split D from number ex. D2
        Random rand = new Random();
        int dieValue = 0;
        int d = ddDice.indexOf('d');
        int NumberOfSides = 1;

        String temp = ddDice.substring(0, d);
        NumberOfSides = Integer.parseInt(ddDice.substring(d + 1));
        int numberOfRolls = Integer.parseInt(temp);
        for (int i = 0; i < numberOfRolls; i++) {
            int roll = rand.nextInt(NumberOfSides) + 1;
            dieValue += roll;
        }
        return dieValue;
    }

   // }
    //set not needed
    public int getSides(){
        return sides;
    }

    public int getDieValue(){
        return dieValue;
    }
}



