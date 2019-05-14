package ru.job4j.tracker;

public class UpdateItem extends BaseAction {

    UpdateItem(int key, String name) {
        super(key, name);
    }

    @Override
    public void execute(Input input, Tracker tracker) {
        System.out.println("------------ Редактирование заявки ------------");
        String id = input.ask("Введите id заявки : ");
        String name = input.ask("Введите имя заявки : ");
        String desc = input.ask("Введите описание заявки : ");
        Item replaceItem = new Item(name, desc);
        if (tracker.replace(id, replaceItem)) {
            System.out.println("*** Заявка изменена ***\n");
        } else {
            System.out.println("*** Заявка не найдена ***\n");
        }
    }
}