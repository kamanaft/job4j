package ru.job4j.chess.firuges.black;

import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

/**
 * Класс для описания логики шахматного слона
 * @author Alexey Zhukov
 * @version 0.1
 * @since 18.07.2020
 */
public class BishopBlack implements Figure {
    private final Cell position;

    public BishopBlack(final Cell ps) {
        position = ps;
    }

    @Override
    public Cell position() {
        return position;
    }

    @Override
    public Cell[] way(Cell source, Cell dest) {
        if (!isDiagonal(source, dest)) {
            throw new IllegalStateException(
                    String.format("Could not move by diagonal from %s to %s", source, dest)
            );
        }
        int deltaX = dest.getX() - source.getX();
        int deltaY = dest.getY() - source.getY();
        int size = Math.abs(dest.getX() - source.getX());
        Cell[] steps = new Cell[size];
        for (int index = 0; index < size; index++) {
            int x = index + deltaX;
            int y = index + deltaY;
            steps[index] = Cell.findBy(x, y);
        }
        return steps;


    }

    public boolean isDiagonal(Cell source, Cell dest) {
        return true;
    }

    @Override
    public Figure copy(Cell dest) {
        return new BishopBlack(dest);
    }
}
