package ru.job4j.tracker;

public class ExitProgram implements UserAction {

    private final StartUI ui;


    ExitProgram(StartUI ui) {
        this.ui = ui;
    }

    @Override
    public int key() {
        return 6;
    }

    @Override
    public void execute(Input input, Tracker tracker) {
        System.out.println("------------ Выход из программы --------------");
        this.ui.exit();
    }

    @Override
    public String info() {
        return String.format("%s. %s", this.key(), "Выйти");
    }

}
