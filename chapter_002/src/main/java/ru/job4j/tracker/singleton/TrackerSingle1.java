package ru.job4j.tracker.singleton;

import ru.job4j.tracker.Item;

/**
 * @author Alexey Zhukov (mailto:hadzage@gmail.com)
 * @version $01$
 * @since 19.05.2019
 */

/**
 * Realisation by ENUM. Eager loading.
 */
public enum TrackerSingle1 {
    INSTANCE; // здесь мы указываем перечисления.

    public Item add(Item model) {
        return  model;
    }

//    public static void main(String[] args) {
//        TrackerSingle1 tracker = TrackerSingle1.INSTANCE;
//    }

}
