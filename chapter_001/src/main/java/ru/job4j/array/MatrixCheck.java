package ru.job4j.array;

/**
 * @author Alexey Zhukov (mailto:hadzage@gmail.com)
 * @version $01$
 * @since 24.08.2018
 */

public class MatrixCheck {
    /**
     * Проверка двух диагоналей квадрата на совпадение значений элемента массива.
     * @param data
     * @return
     */
    public boolean mono(boolean[][] data) {
        boolean result = true;
        for (int index = 0; index != data.length - 1; index++) {
            if (data[0][0] != data[index][index]) {
                result = false;
                break;
            }
            if (data[data.length - 1][0] != data[data.length - 2 - index][index + 1]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
