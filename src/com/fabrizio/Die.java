package com.fabrizio;

import java.util.Random;

public class Die {
    private int sides;
    private int value;
    private static Random rand;

    public Die() {
        // empty constructor
    }
    // overloading
    public Die(int sides){
        this.sides = sides;
    }

    public void roll(Random rand){
    value = rand.nextInt(sides) +1;
    }
}



