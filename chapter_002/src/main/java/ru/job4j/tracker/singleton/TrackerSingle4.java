package ru.job4j.tracker.singleton;

import ru.job4j.tracker.Item;

public class TrackerSingle4 {
    public TrackerSingle4() {
    }

    public static TrackerSingle4 getInstance() {
        return Holder.INSTANCE;
    }

    public Item add(Item model) {
        return model;
    }

    private static final class Holder {
        private static final TrackerSingle4 INSTANCE = new TrackerSingle4();
    }

    /*public static void main(String[] args) {
        TrackerSingle4 tracker = TrackerSingle4.getInstance();
        System.out.println("4-th model completed");
    }*/
}
