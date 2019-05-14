package ru.job4j.tracker;

public class ShowItems extends BaseAction {

    ShowItems(int key, String name) {
        super(key, name);
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
}