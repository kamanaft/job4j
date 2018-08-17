package ru.job4j.max;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Alexey Zhukov (mailto:hadzage@gmail.com)
 * @version $02$
 * @since 17.08.2018
 */

public class MaxTest {
    @Test
    public void whenFirstLessSecond() {
        Max maxim = new Max();
        int result = maxim.max(1, 2);
        assertThat(result, is(2));
    }

    // Проверяем максимум из трех чисел.
    @Test
    public void whenThirdMoreFirstAndSecond() {
        Max maximTree = new Max();
        int result = maximTree.maxTree(2, 1, 5);
        assertThat(result, is(5));
    }

}
