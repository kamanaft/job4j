package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.*;

public class PointTest {
    @Test
    public void whenAreaSetThreePointsThenTriangleArea() {
        // создаем два объекта класса Point.
        Point a = new Point(0, 1);
        Point b = new Point(2, 5);
        // Вычисляем расстояние.
        double result = a.distanceTo(b);
        // Задаем ожидаемый результат.
        double expected = 4.47213595499958;
        //Проверяем результат и ожидаемое значение.
        assertThat(result, closeTo(expected, 0.1));
    }
}

