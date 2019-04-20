package ru.job4j.tracker;

import java.util.List;

/**
 * @author Alexey Zhukov (mailto:hadzage@gmail.com)
 * @version $02$
 * @since 03.01.2019
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

    @Override
    public int ask(String question, int[] range) {
        int key = Integer.valueOf(this.ask(question));
        if (!this.isValid(key, range)) {
            throw new MenuOutException("Out of menu range");
        }
        return key;
    }

    /**
     * Проверка правильности ввода
     * @param key
     * @param range
     * @return Возврат результатат проверки
     */
    public boolean isValid(int key, int[] range) {
        boolean exist = false;
        for (int value : range) {
            if (value == key) {
                exist = true;
                break;
            }
        }
        return exist;
    }

    /*@Override
    public int ask(String question, int[] range) {
        int key = Integer.valueOf(this.ask(question));
        boolean exist = false;
        for (int value : range) {
            if (value == key) {
                exist = true;
                break;
            }
        }
        if (exist) {
            return key;
        } else {
            throw new MenuOutException("Out of menu range");
        }
    }*/

}
