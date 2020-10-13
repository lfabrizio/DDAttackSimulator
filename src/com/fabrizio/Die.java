package com.fabrizio;

import java.util.Random;

public class Die {
    private int sides;
    private int dieValue;


    public Die() {
        // empty constructor
    }
    // overloading
    public Die(int sides) {
        this.sides = sides;
    }

    public void roll(Random rand) {
    dieValue = rand.nextInt(sides) +1;
    }
    //overloading
   // public int roll(String diceValue) {
        //split D from number ex. D2
   //     Random rand = new Random();

   // }
}



