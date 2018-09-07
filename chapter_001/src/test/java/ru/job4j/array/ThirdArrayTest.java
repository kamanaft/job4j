package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Alexey Zhukov (mailto:hadzage@gmail.com)
 * @version $02$
 * @since 07.09.2018
 */

public class ThirdArrayTest {

    @Test
    public void whenTwoArraysGoToOneArrayWithOrder() {
        ThirdArray thirdArray = new ThirdArray();
        int[] input1 = {1, 3, 5};
        int[] input2 = {2, 4};
        int[] result = thirdArray.together(input1, input2);
        int[] expect = {1, 2, 3, 4, 5};
        assertThat(result, is(expect));
    }
}
