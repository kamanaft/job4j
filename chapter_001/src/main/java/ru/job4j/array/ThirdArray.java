package ru.job4j.array;

/**
 * @author Alexey Zhukov (mailto:hadzage@gmail.com)
 * @version $03$
 * @since 09.09.2018
 */


public class ThirdArray {
    public int[] together(int[] input1, int[] input2) {

        int[] result = new int[input1.length + input2.length];
        int index = 0;

        int[] small = input1;
        int[] big = input2;
        if (input1.length < input2.length) {
            small = input1;
            big = input2;
        } else {
            small = input2;
            big = input1;
        }
        for (int i = 0; i < small.length; i++) {
            if (small[i] < big[i]) {
                result[index] = small[i];
                index++;

                result[index] = big[i];
                index++;
            } else {
                result[index] = big[i];
                index++;

                result[index] = small[i];
                index++;
            }
        }
        for (int j = 0; j < (big.length - small.length); j++) {
            result[index] = big[small.length + j];
            index++;
        }
        return result;
    }
}