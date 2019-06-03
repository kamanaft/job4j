package ru.job4j.tracker.singleton;

import ru.job4j.tracker.Item;

public class TrackerSingle3 {
    private static final TrackerSingle3 INSTANCE = new TrackerSingle3();

    private TrackerSingle3() {
    }

    private static TrackerSingle3 getInstance() {
        return INSTANCE;
    }

    private Item add(Item model) {
        return model;
    }

//    public static void main(String[] args) {
//        TrackerSingle3 tracker = TrackerSingle3.getInstance();
//        System.out.println("Done...");
//    }
}
