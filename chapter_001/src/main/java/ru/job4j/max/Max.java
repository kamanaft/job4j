package ru.job4j.max;

/**
 * @author Alexey Zhukov (mailto:hadzage@gmail.com)
 * @version $02$
 * @since 17.08.2018
 */
public class Max {

    public int max(int first, int second) {
        return first < second ? second : first;
    }

    public int maxTree(int first, int second, int third) {
        int temp = this.max(first, second);
        int tempo = this.max(temp, third);
        return tempo;
    }

}
