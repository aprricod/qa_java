package com.example;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class FelineTest {

    @Test
    public void eatMeat() throws Exception {
        Feline feline = new Feline();
        List <String> actual = feline.eatMeat();
        List <String> expected = feline.getFood("Хищник");
        assertEquals("Фактический результат не соответствует ожидаемому", expected, actual);

    }

    @Test
    public void getFamily() {
        Feline feline = new Feline();
        String actual = feline.getFamily();
        String expected = "Кошачьи";
        assertEquals("Фактический результат не соответствует ожидаемому", expected, actual);
    }

    @Test
    public void getKittensTest() {
        Feline feline = new Feline();
        int actual = feline.getKittens();
        int expected = 1;
        assertEquals("Фактический результат не соответствует ожидаемому", expected, actual);
    }

    @Test
    public void getKittensKittensCountTest() {
        Feline feline = new Feline();
        int actual = feline.getKittens();
        int expected = feline.getKittens();
        assertEquals("Фактический результат не соответствует ожидаемому", expected, actual);
    }
}