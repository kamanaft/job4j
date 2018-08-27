package ru.job4j.array;

import org.hamcrest.collection.IsArrayContainingInAnyOrder;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Alexey Zhukov (mailto:hadzage@gmail.com)
 * @version $01$
 * @since 27.08.2018
 */

public class ArrayDuplicateTest {
    /**
     * Проверка удаления повторяющихся элементов из массива.
     */

    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
        ArrayDuplicate duplicate = new ArrayDuplicate();
        String[] input = {"1", "3", "7", "1", "2", "3", "4"};
        String[] result = duplicate.remove(input);
        String[] expect = {"1", "3", "7", "4", "2"};
        assertThat(result, is(expect));
    }

    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicateSecondVersion() {
        ArrayDuplicate duplicate = new ArrayDuplicate();
        String[] input = {"1", "3", "7", "1", "2", "3", "4"};
        String[] result = duplicate.remove(input);
        String[] expect = {"1", "3", "7", "2", "4"};
        assertThat(result, IsArrayContainingInAnyOrder.arrayContainingInAnyOrder(expect));
    }
}
