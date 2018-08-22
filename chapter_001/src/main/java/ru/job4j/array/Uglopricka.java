package ru.job4j.array;

/**
 * @author Alexey Zhukov (mailto:hadzage@gmail.com)
 * @version $02$
 * @since 21.08.2018
 */

public class Uglopricka {
    public String[][] diagon(String[][] pole) {
        for (int index = 0; index != pole.length; index++) {
            for (int yandex = 0; yandex != pole.length; yandex++) {
                if (index == yandex) {
                    pole[index][yandex] = "1";
                } else {
                    pole[index][yandex] = "0";
                }
                //System.out.print(pole[index][yandex]);
            }//System.out.println();
        }
        return pole;
    }
}
