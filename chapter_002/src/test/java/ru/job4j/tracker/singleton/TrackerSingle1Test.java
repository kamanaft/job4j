package ru.job4j.tracker.singleton;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Alexey Zhukov (mailto:hadzage@gmail.com)
 * @version $01$
 * @since 03.06.2019
 */


public class TrackerSingle1Test {

    @Test
    public void whenAddNewElementWhenOneElemetExist() {
        TrackerSingle1 tracker = TrackerSingle1.INSTANCE;
        TrackerSingle1 tracker2 = TrackerSingle1.INSTANCE;
        assertThat(tracker.equals(tracker2), is(true));
    }
}
