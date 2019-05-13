package ru.job4j.tracker;

public class ShowItems implements UserAction {

    private int i;
    private String s;

    ShowItems(int i, String s) {
        this.i = i;
        this.s = s;
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