package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Alexey Zhukov (mailto:hadzage@gmail.com)
 * @version $01$
 * @since 17.08.2018
 */

public class FactorialTest {
    // Проверяем расчет факториала 5.
    @Test
    public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
        Factorial fakt = new Factorial();
        int result = fakt.calc(5);
        assertThat(result, is(120));
    }

    // Проверяем расчет факториала 0.
    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        Factorial fakt = new Factorial();
        int result = fakt.calc(0);
        assertThat(result, is(1));
    }
}
