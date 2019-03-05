package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.deepToString;

/**
 * @author Alexey Zhukov (mailto:hadzage@gmail.com)
 * @version $01$
 * @since 28.09.2018
 */

public class StartUI {

    /**
     * Константа меню для добавления новой заявки.
     */
    private static final String ADD = "0";

    /**
     * Костанта меню для отображения всех заявок.
     */
    private static final String SHOW = "1";

    /**
     * Константа меню для редактирования заявки.
     */
    private static final String EDIT = "2";

    /**
     * Костанта меню для удаления заявки.
     */
    private static final String DEL = "3";

    /**
     * Костанта меню для поиска заявки по id.
     */
    private static final String FINDID = "4";

    /**
     * Костанта меню для поиска заявки по имени.
     */
    private static final String FINDNAME = "5";

    /**
     * Константа для выхода из цикла.
     */
    private static final String EXIT = "6";

    /**
     * Получени данных от пользователя.
     */
    private final Input input;

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
        int[] range = new int[menu.getActionsLentgh()];
        menu.fillActions();
        for (int i = 0; i < range.length; i++) {
            range[i] = i;
        }
        do {
            menu.show();
            menu.select(input.ask("select:", range));
        } while (!"y".equals(this.input.ask("Exit?(y): ")));
    }


    /*public void init() {
        boolean exit = false;
        while (!exit) {
            this.showMenu();
            String answer = this.input.ask("Введите пункт меню : ");
            if ("0".equals(answer)) {
                this.createItem();
            } else if ("1".equals(answer)) {
                this.showAllItems();
            } else if ("2".equals(answer)) {
                this.editItem();
            } else if ("3".equals(answer)) {
                this.deleteItem();
            } else if ("4".equals(answer)) {
                this.findItemById();
            } else if ("5".equals(answer)) {
                this.findItemByName();
            } else if ("6".equals(answer)) {
                exit = true;
            }
        }
    }*/

    /**
     * Метод реализует добавление новой заявки в хранилище.
     */
    private void createItem() {
        System.out.println("------------ Добавление новой заявки ------------");
        String name = this.input.ask("Введите имя заявки: ");
        String desc = this.input.ask("Введите описание заявки: ");
        //String comment = this.input.ask("Введите комментарий к заявке: ");
        //String create = this.input.ask("Введите номер заявки: ");
        Item item = new Item(name, desc);
        this.tracker.add(item);
        System.out.println("*** Добавлена заявка: имя " + item.getName() + ", описание " + item.getDescription() + ", id " + item.getId() + " ***");
    }

    private void showAllItems() {
        if (this.tracker.findAll() != null) {
            System.out.println("Список заявок получен :" + deepToString(this.tracker.findAll()));
        } else {
            System.out.println("There is no items jet");
            System.out.println();
        }
    }

    private void editItem() {
        System.out.println("------------ Редактирование заявки ------------");
        String id = this.input.ask("Введите id заявки : ");
        String name = this.input.ask("Введите имя заявки : ");
        String desc = this.input.ask("Введите описание заявки : ");
        Item replaceItem = new Item(name, desc);
        if (this.tracker.replace(id, replaceItem)) {
            System.out.println("*** Заявка изменена ***");
        } else {
            System.out.println("*** Заявка не найдена ***");
        }
    }

    private void deleteItem() {
        System.out.println("------------ Удаление заявки ------------");
        String id = this.input.ask("Введите id заявки : ");
        if (this.tracker.delete(id)) {
            System.out.println("Заявка удалена");
        }
    }

    private void findItemById() {
        System.out.println("------------ Поиск заявки по id ------------");
        String id = this.input.ask("Введите id заявки : ");
        this.tracker.findById(id);
        System.out.println("Заявка получена :" + this.tracker.findById(id).toString());
    }

    private void findItemByName() {
        System.out.println("------------ Поиск заявки по имени ------------");
        String name = this.input.ask("Введите имя заявки : ");
        this.tracker.findByName(name);
        System.out.println("Заявка получена :" + deepToString(this.tracker.findByName(name)));
    }

    /**
     * Вывод основного меню.
     */
    private void showMenu() {
        System.out.println("--- Меню ---");
        System.out.print("0");
        System.out.println(". Add item");
        System.out.print("1");
        System.out.println(". Show all items");
        System.out.print("2");
        System.out.println(". Edit item");
        System.out.print("3");
        System.out.println(". Delete item");
        System.out.print("4");
        System.out.println(". Find item by id");
        System.out.print("5");
        System.out.println(". Find item by name");
        System.out.print("6");
        System.out.println(". Exit program");
        //System.out.println("Select: ");
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
