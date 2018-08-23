package ru.job4j.array;

/**
 * @author Alexey Zhukov (mailto:hadzage@gmail.com)
 * @version $03$
 * @since 23.08.2018
 */

public class Uglopricka {
    public String[][] diagon(int pole) {
        String[][] table = new String[pole][pole];
        for (int index = 0; index != table.length; index++) {
            for (int yandex = 0; yandex != table.length; yandex++) {
                if (index == yandex) {
                    table[index][yandex] = "1";
                } else {
                    table[index][yandex] = "0";
                }
            }
        }
        return table;
    }
}
