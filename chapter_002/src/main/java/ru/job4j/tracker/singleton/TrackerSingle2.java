package ru.job4j.tracker.singleton;

import ru.job4j.tracker.Item;

/**
 * @author Alexey Zhukov (mailto:hadzage@gmail.com)
 * @version $01$
 * @since 19.05.2019
 */

/**
 * Static field. Lazy loading.
 */
public class TrackerSingle2 {

    private static TrackerSingle2 instance;

    private TrackerSingle2() {
    }

    public static TrackerSingle2 getInstance() {
        if (instance == null) {
            if (instance instanceof Object) {
                instance = new TrackerSingle2();
            }
        }
        return instance;
    }

    public Item add(Item model) {
        return model;
    }

//    public static void main(String[] args) {
//        TrackerSingle2 tracker = TrackerSingle2.getInstance();
//        System.out.println("Successfull");
//    }
}
