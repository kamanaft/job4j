package ru.job4j.tictactoe;

import java.util.function.Predicate;

/**
 * @author Alexey Zhukov (mailto:hadzage@gmail.com)
 * @version $03$
 * @since 27.09.2018
 */

public class Logic3T {
    private final Figure3T[][] table;

    public Logic3T(Figure3T[][] table) {
        this.table = table;
    }

    /**
     * Реализация проверки выигрышной комбинации.
     *
     * @param predicate Параметризованное поведение.
     * @param startX    Начальная позиция по оси Х.
     * @param startY    Начальная позиция по оси Y.
     * @param deltaX    Смещение по оси Х.
     * @param deltaY    Смещение по оси Y.
     * @return Вывод сообщения о выигрыше Х или Y.
     */
    public boolean fillBy(Predicate<Figure3T> predicate, int startX, int startY, int deltaX, int deltaY) {
        boolean result = true;
        for (int index = 0; index != this.table.length; index++) {
            Figure3T cell = this.table[startX][startY];
            startX += deltaX;
            startY += deltaY;
            if (!predicate.test(cell)) {
                result = false;
                break;
            }
        }
        return result;
    }

    /**
     * Проверка выигрыша Х.
     *
     * @return Выиграли Х.
     */
    public boolean isWinnerX() {
        boolean result = false;
        for (int i = 0; i < this.table.length; i++) {
            if (this.fillBy(Figure3T::hasMarkX, i, 0, 0, 1)
                    || this.fillBy(Figure3T::hasMarkX, 0, i, 1, 0)) {
                result = true;
                break;
            }
        }
        if (!result) {
            return this.fillBy(Figure3T::hasMarkX, 0, 0, 1, 1)
                    || this.fillBy(Figure3T::hasMarkX, this.table.length - 1, 0, -1, 1);
        }
        return result;
    }

    /**
     * Проверка выигрыша О.
     *
     * @return Выиграли О.
     */
    public boolean isWinnerO() {
        boolean result = false;
        for (int i = 0; i < this.table.length; i++) {
            if (this.fillBy(Figure3T::hasMarkO, i, 0, 0, 1)
                    || this.fillBy(Figure3T::hasMarkO, 0, i, 1, 0)) {
                result = true;
                break;
            }
        }
        if (!result) {
            return this.fillBy(Figure3T::hasMarkO, 0, 0, 1, 1)
                    || this.fillBy(Figure3T::hasMarkO, this.table.length - 1, 0, -1, 1);
        }
        return result;
    }


    /**
     * Проверка того, есть ли место для следующего хода.
     *
     * @return Поля для ходов есть.
     */
    public boolean hasGap() {
        boolean result = false;
        for (int out = 0; out != this.table.length; out++) {
            for (int in = 0; in != this.table.length; in++) {
                if (!(this.table[out][in].hasMarkO() || this.table[out][in].hasMarkX())) {
                    result = true;
                    break;
                }
            }
            if (result) {
                break;
            }
        }
        return result;
    }
}
