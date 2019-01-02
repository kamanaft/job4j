package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Alexey Zhukov (mailto:hadzage@gmail.com)
 * @version $01$
 * @since 02.01.2019
 */

public class MenuTracker {


    private Input input;

    private Tracker tracker;

    private List<UserAction> actions = new ArrayList<>();

    public MenuTracker(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }

    public int getActionsLentgh() {
        return this.actions.size();
    }

    public void fillActions() {
        this.actions.add(new AddItem(0, "Добавить заявку"));
        this.actions.add(new ShowItems(1, "Показать все заявки"));
        this.actions.add(new UpdateItem(2, "Редактировать заявку"));
        this.actions.add(new DeleteItem(3, "Удадить заявку"));
        this.actions.add(new FindItemById(4, "Найти заявку по Id"));
        this.actions.add(new FindItemsByName(5, "Найти заявку по имени"));
        this.actions.add(new ExitProgram(6, "Выйти"));
    }

    public void select(int key) {
        this.actions.get(key).execute(this.input, this.tracker);
    }

    public void show() {
        for (UserAction action : this.actions) {
            if (action != null) {
                System.out.println(action.info());
            }
        }
    }

    private class AddItem implements UserAction {

        public AddItem(int i, String s) {
        }

        @Override
        public int key() {
            return 0;
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            System.out.println("------------ Добавление новой заявки ------------");
            String name = input.ask("Введите имя заявки: ");
            String desc = input.ask("Введите описание заявки: ");
            Item item = new Item(name, desc);
            tracker.add(item);
            System.out.println("*** Добавлена заявка: имя " + item.getName() + ", описание " + item.getDescription() + ", id " + item.getId() + " ***");
        }

        @Override
        public String info() {
            return String.format("%s. %s", this.key(), "Добавить новую заявку");
        }
    }

    private class ShowItems implements UserAction {

        public ShowItems(int i, String s) {
        }

        @Override
        public int key() {
            return 1;
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            if (tracker.findAll() != null) {
                System.out.println("Список заявок получен: ");
                for (Item item: tracker.findAll()) {
                    System.out.println(item);
                }
            } else {
                System.out.println("Заявок пока нет");
                System.out.println();
            }
        }

        @Override
        public String info() {
            return String.format("%s. %s", this.key(), "Показать все заявки");
        }
    }

    private class UpdateItem implements UserAction {
        public UpdateItem(int i, String s) {
        }

        @Override
        public int key() {
            return 2;
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            System.out.println("------------ Редактирование заявки ------------");
            String id = input.ask("Введите id заявки : ");
            String name = input.ask("Введите имя заявки : ");
            String desc = input.ask("Введите описание заявки : ");
            Item replaceItem = new Item(name, desc);
            if (tracker.replace(id, replaceItem)) {
                System.out.println("*** Заявка изменена ***");
            } else {
                System.out.println("*** Заявка не найдена ***");
            }
        }

        @Override
        public String info() {
            return String.format("%s. %s", this.key(), "Редактировать заявку");
        }
    }

    private class DeleteItem implements UserAction {

        public DeleteItem(int i, String s) {
        }

        @Override
        public int key() {
            return 3;
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            System.out.println("------------ Удаление заявки ------------");
            String id = input.ask("Введите id заявки : ");
            if (tracker.delete(id)) {
                System.out.println("Заявка удалена");
            }
        }

        @Override
        public String info() {
            return String.format("%s. %s", this.key(), "Удалить заявку");
        }
    }

    private class FindItemById implements UserAction {

        public FindItemById(int i, String s) {
        }

        @Override
        public int key() {
            return 4;
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            System.out.println("------------ Поиск заявки по id ------------");
            String id = input.ask("Введите id заявки : ");
            tracker.findById(id);
            System.out.println("Заявка получена :" + tracker.findById(id).toString());
        }

        @Override
        public String info() {
            return String.format("%s. %s", this.key(), "Найти заявку по Id");
        }
    }

    private class FindItemsByName implements UserAction {

        public FindItemsByName(int i, String s) {
        }

        @Override
        public int key() {
            return 5;
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            System.out.println("------------ Поиск заявки по id ------------");
            String id = input.ask("Введите id заявки : ");
            tracker.findById(id);
            System.out.println("Заявка получена :" + tracker.findById(id).toString());
        }

        @Override
        public String info() {
            return String.format("%s. %s", this.key(), "Найти заявку по имени");
        }
    }

    private class ExitProgram implements UserAction {

        public ExitProgram(int i, String exit) {
        }

        @Override
        public int key() {
            return 6;
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            System.out.println("------------ Выход из программы --------------");
            System.exit(0);
        }

        @Override
        public String info() {
            return String.format("%s. %s", this.key(), "Выйти");
        }
    }
}
