package com.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class LionTest {

    String sex;
    Feline feline;

    @Test
    public void doesHaveManeTest() throws Exception {
        Lion lion = new Lion("Самец", feline);
        boolean actual = lion.doesHaveMane();
        boolean expected = true;
        assertEquals(actual, expected);
    }

    @Test
    public void getKittens() throws Exception {
        Lion lion = new Lion(sex, feline);
        int actual = lion.getKittens();
        int expected = 1;
        assertEquals(actual, expected);
    }

    @Test
    public void getFood() {
    }
}