package ru.job4j.array;

/**
 * @author Alexey Zhukov (mailto:hadzage@gmail.com)
 * @version $02$
 * @since 23.08.2018
 */

public class Check {
    public boolean mono(boolean[] data) {
        boolean result = true;
        for (int index = 0; index != data.length; index++) {
            if (data[index] != data[0]) {
                result = false;
                break;
            }
        }
        return result;
    }

}