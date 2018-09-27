package ru.job4j.tictactoe;

import javafx.scene.shape.Rectangle;

/**
 * @author Alexey Zhukov (mailto:hadzage@gmail.com)
 * @version $03$
 * @since 27.09.2018
 */

public class Figure3T extends Rectangle {
    private boolean markX = false;
    private boolean markO = false;

    public Figure3T() {
    }

    public Figure3T(boolean markX) {
        this.markX = markX;
        this.markO = !markX;
    }

    public void take(boolean markX) {
        this.markX = markX;
        this.markO = !markX;
    }

    public boolean hasMarkX() {
        return this.markX;
    }

    public boolean hasMarkO() {
        return this.markO;
    }
}