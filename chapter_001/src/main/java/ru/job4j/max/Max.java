package ru.job4j.max;

/**
 * @author Alexey Zhukov (mailto:hadzage@gmail.com)
 * @version $01$
 * @since 17.08.2018
 */
public class Max {

    public int max(int first, int second);

    {
        int maximum = first < second ? second : first;
        return maximum;
    }

}
