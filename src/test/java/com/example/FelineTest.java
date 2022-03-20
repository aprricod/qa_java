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
    public void getKittens() {
    }

    @Test
    public void testGetKittens() {
    }
}