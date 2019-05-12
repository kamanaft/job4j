package ru.job4j.tracker;

public class UpdateItem implements UserAction {
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