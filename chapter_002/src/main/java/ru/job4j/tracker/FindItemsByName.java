package ru.job4j.tracker;

public class FindItemsByName extends BaseAction {

    FindItemsByName(int key, String name) {
        super(key, name);
    }

    @Override
    public void execute(Input input, Tracker tracker) {
        System.out.println("------------ Поиск заявки по id ------------");
        String id = input.ask("Введите id заявки : ");
        tracker.findById(id);
        System.out.println("Заявка получена :" + tracker.findById(id).toString() + "\n");
    }
}