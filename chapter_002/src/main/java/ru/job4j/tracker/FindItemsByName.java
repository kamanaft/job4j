package ru.job4j.tracker;

public class FindItemsByName implements UserAction {

    private int i;
    private String s;

    FindItemsByName(int i, String s) {
        this.i = i;
        this.s = s;
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