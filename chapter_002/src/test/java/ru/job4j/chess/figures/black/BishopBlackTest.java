package ru.job4j.chess.figures.black;

import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;
import ru.job4j.chess.firuges.black.BishopBlack;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class BishopBlackTest {

    // Тест правильности позиции фигуры
    @Test
    public void whenBishopIsOnC1ThenPositionIsC1() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        assertThat(bishopBlack.position(), is(Cell.C1));
    }

    // Тест правильность позиции фигры после ее перемещения
    @Test
    public void whenBishopBlackWasCopiedToH6ThenNewPositionIsH6() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        assertThat(bishopBlack.copy(Cell.H6).position(), is(Cell.H6));
    }

    // Тест получения правильного массива по пути следования фигуры
    @Test
    public void whenBishopBlackGoesFromC1TiG5WayIsD2E3F4G5() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        assertThat(bishopBlack.way(Cell.C1, Cell.G5), is("[D2, E3, F4, G5]"));
    }
}
