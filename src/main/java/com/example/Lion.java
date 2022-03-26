package com.example;

import java.util.List;

public class Lion {

    Predator predator;
    Kittens kittens;
    boolean hasMane;

    public Lion(String sex, Feline feline) throws Exception {
        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самец или самка");
        }
        this.predator = feline;
        this.kittens = feline;
    }

    public boolean doesHaveMane() {
        return hasMane;
    }

    public int getKittens() {
        return kittens.getKittens();
    }

    public List<String> getFood() throws Exception {
        return predator.eatMeat();
    }
}
