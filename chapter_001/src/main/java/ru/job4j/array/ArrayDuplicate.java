package ru.job4j.array;

        import java.util.Arrays;

/**
 * @author Alexey Zhukov (mailto:hadzage@gmail.com)
 * @version $01$
 * @since 27.08.2018
 */

public class ArrayDuplicate {
    /**
     * Удаление дубликатов из массива.
     *
     * @param array
     * @return
     */
    public String[] remove(String[] array) {
        int unique = array.length;
        for (int out = 0; out != unique; out++) {
            for (int in = out + 1; in != unique; in++) {
                if (array[out].equals(array[in])) {
                    array[in] = array[unique - 1];
                    unique--;
                    in--;
                }
            }
        }
        return Arrays.copyOf(array, unique);
    }
}
