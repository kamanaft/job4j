package ru.job4j.tracker;

import java.util.List;

/**
 * @author Alexey Zhukov (mailto:hadzage@gmail.com)
 * @version $01$
 * @since 03.01.2019
 */

public class ValidateInput implements Input {

    private final Input input;

    static int key;

    public ValidateInput(final Input input) {
        this.input = input;
    }

    @Override
    public String ask(String question) {
        return this.input.ask(question);
    }


    /**
     * Проверка правильности ввода
     * @param question - Вопрос
     * @param range - Пункт меню
     * @return - Ключ меню
     */
    public int ask(String question, int[] range) {
        boolean invalid = true;
        int value = -1;
        do {
            try {
                value = this.input.ask(question, range);
                invalid = false;
            } catch (MenuOutException moe) {
                System.out.println("Please select key from menu.");
            } catch (NumberFormatException nfe) {
                System.out.println("Please enter validate data again.");

            }
        }   while (invalid);
        return value;
    }
}
