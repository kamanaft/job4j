package ru.job4j.tracker;

import javax.sound.midi.Track;
import java.util.*;


/**
 * @author Alexey Zhukov (mailto:hadzage@gmail.com)
 * @version $01$
 * @since 30.09.2018
 */

public class ConsoleInput implements Input {

    private Scanner scanner = new Scanner(System.in);


    @Override
    public String ask(String question) {
        return scanner.nextLine();
    }
}
