package ru.job4j.pseudo;

/**
 * @author Alexey Zhukov (mailto:hadzage@gmail.com)
 * @version $01$
 * @since 01.11.2018
 */

public class Square implements Shape {
    @Override
    public String draw() {
        StringBuilder sqr = new StringBuilder();
        sqr.append("***** \n");
        sqr.append("***** \n");
        sqr.append("***** \n");
        sqr.append("***** \n");
        sqr.append("***** \n");
        return sqr.toString();
    }
}
