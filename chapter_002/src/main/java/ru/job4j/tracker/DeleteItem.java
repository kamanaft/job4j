package ru.job4j.tracker;

public class DeleteItem extends BaseAction {

    DeleteItem(int key, String name) {
        super(key, name);
    }

    @Override
    public void execute(Input input, Tracker tracker) {
        System.out.println("------------ Удаление заявки ------------");
        String id = input.ask("Введите id заявки : ");
        if (tracker.delete(id)) {
            System.out.println("Заявка удалена");
        }
    }
}