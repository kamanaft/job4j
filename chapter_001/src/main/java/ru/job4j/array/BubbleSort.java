package ru.job4j.array;

/**
 * @author Alexey Zhukov (mailto:hadzage@gmail.com)
 * @version $01$
 * @since 24.08.2018
 */

public class BubbleSort {

    /**
     * Сортировка элементов массива по возрастанию.
     *
     * @param array
     * @return
     */
    public int[] sort(int[] array) {
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (int index = 0; index != array.length - 1; index++) {
                if (array[index] > array[index + 1]) {
                    sorted = false;
                    int temp = array[index];
                    array[index] = array[index + 1];
                    array[index + 1] = temp;
                }
            }
        }
        return array;
    }
}
