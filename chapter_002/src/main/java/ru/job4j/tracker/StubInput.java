package ru.job4j.tracker;

import java.util.List;

/**
 * @author Alexey Zhukov (mailto:hadzage@gmail.com)
 * @version $01$
 * @since 22.10.2018
 */

public class StubInput implements Input {


    private final String[] value;


    private int position;

    public StubInput(final String[] value) {
        this.value = value;
    }


    @Override
    public String ask(String question) {
        return this.value[this.position++];
    }

   /* @Override
    public int ask(String s, List<Integer> range) {
        return 0;
    }*/

}
