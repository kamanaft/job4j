package ru.job4j.tracker;

public class AddItem implements UserAction {

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
