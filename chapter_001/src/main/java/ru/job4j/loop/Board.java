package ru.job4j.loop;

/**
 * @author Alexey Zhukov (mailto:hadzage@gmail.com)
 * @version $01$
 * @since 18.08.2018
 */

public class Board {

    public String paint(int width, int height) {
        StringBuilder screen = new StringBuilder();
        String ln = System.lineSeparator();
        for (int chessh = 0; chessh < height; chessh++) {
            for (int chessw = 0; chessw < width; chessw++) {
                if ((chessw + chessh) % 2 == 0) {
                    screen.append("X");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(ln);
        }
        return screen.toString();
    }
}
