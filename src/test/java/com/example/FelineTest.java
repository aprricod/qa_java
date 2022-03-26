package com.example;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class FelineTest {

    @Test
    public void eatMeat() throws Exception {
        Feline feline = new Feline();
        List<String> actual = feline.eatMeat();
        List<String> expected = feline.getFood("Хищник");
        System.out.println(actual);
        System.out.println(expected);
        assertEquals("Получен некорректный вид животного", expected, actual);

    }

    @Test
    public void getFamily() {
        Feline feline = new Feline();
        String actual = feline.getFamily();
        String expected = "Кошачьи";
        String msg = "Тест провален. %s не равно %s";
        assertEquals(String.format(msg, actual, expected), expected, actual);
    }

    @Test
    public void getKittensTest() {
        Feline feline = new Feline();
        int actual = feline.getKittens();
        int expected = 1;
        assertEquals("Получено некорректное число котят", expected, actual);
    }

    @Test
    public void getKittensKittensCountTest() {
        Feline feline = new Feline();
        int actual = feline.getKittens();
        int expected = feline.getKittens();
        assertEquals("Получено некорректное число котят", expected, actual);
    }
}