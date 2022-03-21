package com.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class FelineTest {

    @Test
    public void eatMeat() {
        Feline feline = new Feline();
    }

    @Test
    public void getFamily() {
        Feline feline = new Feline();
        String actual = feline.getFamily();
        String expected = "Кошачьи";
        assertEquals(expected, actual);
    }

    @Test
    public void getKittensTest() {
        Feline feline = new Feline();
        int actual = feline.getKittens();
        int expected = 1;
        System.out.println(feline.getKittens());
        assertEquals(expected, actual);
    }

    @Test
    public void getKittensKittensCountTest() {
        Feline feline = new Feline();
        int actual = feline.getKittens();
        int expected = feline.getKittens();
        System.out.println(feline.getKittens());
        assertEquals(expected, actual);
    }
}