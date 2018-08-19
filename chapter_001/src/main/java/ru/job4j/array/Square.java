package ru.job4j.array;


/**
 * @author Alexey Zhukov (mailto:hadzage@gmail.com)
 * @version $01$
 * @since 19.08.2018
 */


public class Square {
    public int[] calculate(int bound) {
        int[] rst = new int[bound];
        for (int index = 0; index != rst.length; index++) {
            rst[index] = (index + 1) * (index + 1);
        }
        return rst;
    }
}
