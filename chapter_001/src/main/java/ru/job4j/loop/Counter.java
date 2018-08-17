package ru.job4j.loop;

/**
 * @author Alexey Zhukov (mailto:hadzage@gmail.com)
 * @version $01$
 * @since 17.08.2018
 */
public class Counter {

    public int add(int start, int finish) {

        int sum = 0;

        for (int count = start; count <= finish; count++) {
            if (count % 2 == 0) {
                sum = sum + count;
            }
        }
        return sum;
    }
}
