package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionSexParameterizedTest {
    Feline feline;

    private final String sex;
    private final boolean expected;

    public LionSexParameterizedTest(String sex, boolean expected) {
        this.expected = expected;
        this.sex = sex;
    }

    @Parameterized.Parameters(name = "Test data {index}: {0} = {1}")
    public static Object[] doesHaveManeData() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
        };
    }

    @Test
    public void doesHaveMane() throws Exception {
        Lion lion = new Lion(sex, feline);
        boolean actual = lion.doesHaveMane();
        String msg = "Тест провален. Ожидается %s, но фактически получено %s";
        assertEquals(String.format(msg, expected, actual), expected, actual);
    }
}