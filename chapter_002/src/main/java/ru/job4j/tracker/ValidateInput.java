package ru.job4j.tracker;

import java.util.List;

public class ValidateInput extends ConsoleInput {

    public int ask(String question, List<Integer> range) {
        boolean invalid = true;
        int value = -1;
        do {
            try {
                value = super.ask(question, range);
                invalid = false;
            } catch (NumberFormatException nfe) {
                System.out.println("Please enter valid data again");
            } catch (MenuOutException moe) {
                System.out.println("Out of menu range");
            }
        }   while (invalid);
            return value;
    }
}
