package ru.job4j.pseudo;

/**
 * @author Alexey Zhukov (mailto:hadzage@gmail.com)
 * @version $01$
 * @since 01.11.2018
 */

public class Paint {
    public void draw(Shape shape) {
        System.out.println(shape.draw());
    }

    /*public static void main(String[] args) {
        Paint paint = new Paint();
        paint.draw(new Triangle());
        paint.draw(new Square());
    }*/
}
