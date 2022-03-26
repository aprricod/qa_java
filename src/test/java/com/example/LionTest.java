package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    String sex;

    @Mock
    Feline feline;

    @Test
    public void getFoodTest() throws Exception {
        Lion lion = new Lion("Самец", feline);
        Mockito.when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> actual = lion.getFood();
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        assertEquals("Получен некорректный список видов", expected, actual);
    }

    @Test
    public void getKittensTest() throws Exception {
        Lion lion = new Lion("Самец", feline);
        int actual = lion.getKittens();
        int expected = lion.getKittens();
        System.out.println(actual);
        System.out.println(expected);
        assertEquals("Получено некорректное число котят", expected, actual);
    }

    @Test
    public void doesHaveManeMaleTest() throws Exception {
        Lion lion = new Lion("Самец", feline);
        boolean actual = lion.doesHaveMane();
        boolean expected = true;
        assertEquals("Ожидается true, но фактически получено false", expected, actual);
    }

    @Test
    public void doesHaveManeFemaleTest() throws Exception {
        Lion lion = new Lion("Самка", feline);
        boolean actual = lion.doesHaveMane();
        boolean expected = false;
        assertEquals("Ожидается false, но фактически получено true", expected, actual);
    }
}

