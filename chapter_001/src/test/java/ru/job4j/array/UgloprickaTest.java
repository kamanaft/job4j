package ru.job4j.array;

import org.hamcrest.Matchers;
import org.junit.Test;

import java.util.StringJoiner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Alexey Zhukov (mailto:hadzage@gmail.com)
 * @version $02$
 * @since 22.08.2018
 */


public class UgloprickaTest {
    /**
     * Проверяем правильность вывода массива с единичкой по диагонали.
     */
    @Test
    public void whenMassivThreeByThreeMakesDiagonal() {
        Uglopricka diag = new Uglopricka();
        int[][] pole = diag.diagon(3);
        int[][] expect = {
                {1, 0, 0},
                {0, 1, 0},
                {0, 0, 1}
        };
        assertThat(pole, is(expect));
    }
}

