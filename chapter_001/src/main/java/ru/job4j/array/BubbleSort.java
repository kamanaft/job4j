package ru.job4j.array;

/**
 * @author Alexey Zhukov (mailto:hadzage@gmail.com)
 * @version $02$
 * @since 27.08.2018
 */

public class BubbleSort {

    /**
     * Сортировка элементов массива по возрастанию.
     *
     * @param array
     * @return
     */
    public int[] sort(int[] array) {
        for (int a = 0; a != array.length - 1; a++) {
            for (int b = 1; b != array.length - a; b++) {
                if (array[b - 1] > array[b]) {
                    int buf = array[b - 1];
                    array[b - 1] = array[b];
                    array[b] = buf;
                }
            }
        }
        return array;
    }
}
