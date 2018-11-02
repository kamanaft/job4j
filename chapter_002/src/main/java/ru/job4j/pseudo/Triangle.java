package ru.job4j.pseudo;

/**
 * @author Alexey Zhukov (mailto:hadzage@gmail.com)
 * @version $01$
 * @since 01.11.2018
 */

public class Triangle implements Shape {

    @Override
    public String draw() {
        StringBuilder t = new StringBuilder();
        t.append("    *     \n");
        t.append("   ***    \n");
        t.append(" *******  \n");
        t.append("********* \n");
        return t.toString();
    }
}
