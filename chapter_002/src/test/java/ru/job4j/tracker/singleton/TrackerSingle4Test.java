package ru.job4j.tracker.singleton;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Alexey Zhukov (mailto:hadzage@gmail.com)
 * @version $01$
 * @since 03.06.2019
 */

public class TrackerSingle4Test {
    @Test(expected = NullPointerException.class)
    public void whenAddNewElementWhenOneElemetExistWillNotSuccess() {
        TrackerSingle2 tracker = TrackerSingle2.getInstance();
        TrackerSingle2 tracker2 = TrackerSingle2.getInstance();
        assertThat(tracker.equals(tracker2), is(true));
    }
}
