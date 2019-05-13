package ru.job4j.tracker;

public class DeleteItem implements UserAction {

    private int i;
    private String s;

    DeleteItem(int i, String s) {
        this.i = i;
        this.s = s;
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