package ru.job4j.array;

import java.util.function.BiPredicate;

/**
 * @author Alexey Zhukov (mailto:hadzage@gmail.com)
 * @version $01$
 * @since 20.08.2018
 */

public class Uglopricka {
    public static void main(String[] args) {
        String[][] pole = new String[3][3];

        for (int index = 0; index != pole.length; index++) {
            for (int yandex = 0; yandex != pole.length; yandex++) {
                if (index == yandex) {
                    pole[index][yandex] = "1";
                } else {
                    pole[index][yandex] = "0";
                }
                System.out.print(pole[index][yandex]);
            }System.out.println();
        }
    }
}
