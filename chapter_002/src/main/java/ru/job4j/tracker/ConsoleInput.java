package ru.job4j.tracker;

import java.util.*;


/**
 * @author Alexey Zhukov (mailto:hadzage@gmail.com)
 * @version $02$
 * @since 20.04.2019
 */

public class ConsoleInput implements Input {

    private Scanner scanner = new Scanner(System.in);


    @Override
    public String ask(String question) {
        System.out.println(question);
        return scanner.nextLine();
    }

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


    /*public int ask(String question, int[] range) {
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
