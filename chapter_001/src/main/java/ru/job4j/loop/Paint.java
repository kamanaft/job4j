package ru.job4j.loop;

import java.util.function.BiPredicate;

/**
 * @author Alexey Zhukov (mailto:hadzage@gmail.com)
 * @version $02$
 * @since 18.08.2018
 */


public class Paint {
    /**
     * Выводим правую сторону пирамиды.
     *
     * @param height
     * @return
     */
    public String rightTrl(int height) {
        return this.loopBy(
                height,
                height,
                (row, column) -> row >= column
        );
    }

    /**
     * Выводим левую сторону пирамиды.
     *
     * @param height
     * @return
     */
    public String leftTrl(int height) {
        return this.loopBy(
                height,
                height,
                (row, column) -> row >= height - column - 1
        );
    }

    /**
     * Выводим две стороны пирамиды.
     *
     * @param height
     * @return
     */
    public String pyramid(int height) {
        return this.loopBy(
                height,
                2 * height - 1,
                (row, column) -> row >= height - column - 1 && row + height - 1 >= column
        );
    }

    /**
     * Цикл заполнения пирамиды значениями.
     *
     * @param height
     * @param weight
     * @param predict
     * @return
     */
    private String loopBy(int height, int weight, BiPredicate<Integer, Integer> predict) {
        StringBuilder screen = new StringBuilder();
        for (int row = 0; row != height; row++) {
            for (int column = 0; column != weight; column++) {
                if (predict.test(row, column)) {
                    screen.append("^");
                } else {
                    screen.append(" ");
                }
            }
            screen.append((System.lineSeparator()));
        }
        return screen.toString();
    }
}