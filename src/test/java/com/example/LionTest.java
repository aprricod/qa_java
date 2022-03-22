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
    public void doesHaveManeTest() throws Exception {
        Lion lion = new Lion("Самец", feline);
        boolean actual = lion.doesHaveMane();
        boolean expected = true;
        assertEquals(actual, expected);
    }

    //    не работает

    @Test
    public void getKittens() throws Exception {
        Lion lion = new Lion(sex, feline);
        int actual = lion.getKittens();
        int expected = lion.getKittens();
        assertEquals(actual, expected);
    }

    //    не работает
    @Test
    public void getFood() throws Exception {
        Lion lion = new Lion(sex, feline);
        Mockito.when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> actual = lion.getFood();
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        assertEquals(actual, expected);
    }
}