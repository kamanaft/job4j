package ru.job4j.array;

/**
 * @author Alexey Zhukov (mailto:hadzage@gmail.com)
 * @version $01$
 * @since 19.08.2018
 */

public class Check {
    public boolean mono(boolean[] data) {
        boolean result = false;
        for (int index = 0; index != data.length; index++) {
            if (data[index]) {
                result = true;
            } else {
                result = false;
                break;
            }
        }
        return result;
    }
}
