package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.deepToString;

/**
 * @author Alexey Zhukov (mailto:hadzage@gmail.com)
 * @version $02$
 * @since 12.05.2019
 */

public class StartUI {

    /**
     * Получение данных от пользователя.
     */
    private final Input input;
    private boolean working = true;

    /**
     * Хранилище заявок.
     */
    private final Tracker tracker;

    /**
     * Конструктор инициализирующий поля.
     *
     * @param input   ввод данных.
     * @param tracker хранилище заявок.
     */
    public StartUI(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }

    /**
     * Основной цикл программы.
     */
    public void init() {
        MenuTracker menu = new MenuTracker(this.input, this.tracker);
        menu.fillActions(this);
        int[] range = new int[menu.getActionsLentgh()];
        for (int i = 0; i < range.length; i++) {
            range[i] = i;
        }
        do {
            menu.show();
            menu.select(input.ask("select:", range));
        } while (this.working);
    }


    //if("y".equals(this.input.ask("Exit?(y): "))) {


    public void exit() {
        this.working = false;
    }

    /**
     * Запуск программы.
     *
     * @param args
     */
    public static void main(String[] args) {
        new StartUI(
                new ValidateInput(
                        new ConsoleInput()
                ),
                new Tracker()
        ).init();
    }
}
