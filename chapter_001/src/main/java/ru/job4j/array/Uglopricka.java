package ru.job4j.array;

/**
 * @author Alexey Zhukov (mailto:hadzage@gmail.com)
 * @version $04$
 * @since 23.08.2018
 */

public class Uglopricka {
    public int[][] diagon(int pole) {
        int[][] table = new int[pole][pole];
        for (int index = 0; index != table.length; index++) {
            table[index][index] = 1;
        }
        return table;
    }
}
