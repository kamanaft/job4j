package ru.job4j.loop;

/**
 * @author Alexey Zhukov (mailto:hadzage@gmail.com)
 * @version $01$
 * @since 17.08.2018
 */

public class Factorial {

    int fakt = 1;

    public int calc(int n) {
        for (int f = 1; f <= n; f++) {
            fakt = fakt * f;
        }
        return fakt;
    }
}
