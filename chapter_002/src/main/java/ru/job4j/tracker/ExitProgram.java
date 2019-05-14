package ru.job4j.tracker;

public class ExitProgram extends BaseAction {

    ExitProgram(int key, String name) {
        super(key, name);
    }



    @Override
    public void execute(Input input, Tracker tracker) {
        System.out.println("------------ Выход из программы --------------");
        StartUI.exit();
    }
}
