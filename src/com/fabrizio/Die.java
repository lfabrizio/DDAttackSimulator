package com.fabrizio;

import java.util.Random;

public class Die {
    private int sides;
    private int dieValue;


    public Die() {
        dieValue = 1;
        sides = 6;
    }
    // overloading
    public Die(int sides, int dieValue) {
        this.sides = sides;
    }

    public int roll(Random rand) {

        dieValue = rand.nextInt(sides) +1;
        return dieValue;
    }
    //overloading
   // public int roll(String diceValue) {
        //split D from number ex. D2
   //     Random rand = new Random();

   // }
    //set not needed
    public int getSides(){
        return sides;
    }

    public int getDieValue(){
        return dieValue;
    }
}



