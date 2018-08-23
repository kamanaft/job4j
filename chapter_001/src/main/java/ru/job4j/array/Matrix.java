package ru.job4j.array;

/**
 * @author Alexey Zhukov (mailto:hadzage@gmail.com)
 * @version $01$
 * @since 23.08.2018
 */

public class Matrix {

    public int[][] multiple(int size) {
        int[][] table =  new int[size][size];
        for (int index = 0; index != table.length; index++) {
            for (int yandex = 0; yandex != table.length; yandex++) {
                table[index][yandex] = (index + 1) * (yandex + 1);
            }
        }
        return table;
    }
}
