package ru.job4j.array;

/**
 * @author Alexey Zhukov (mailto:hadzage@gmail.com)
 * @version $01$
 * @since 19.08.2018
 */

public class Check {
    public boolean mono(boolean[] data) {
        boolean result = false;
        boolean result2 = true;
        for (int index = 0; index != data.length; index++) {
            if (data[index]) {
                result = true;
            } else {
                for (int index2 = index + 1; index2 != data.length; index2++) {
                    if (data[index2]) {
                        result2 = true;
                    } else result2 = false;
                }
            }
        }
        return (result && result2) ? true : false;
    }
}
