package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Alexey Zhukov (mailto:hadzage@gmail.com)
 * @version $01$
 * @since 19.09.2018
 */

public class TrackerTest {
    // Тест реализации замены заявки.
    @Test
    public void whenReplaceNameThenReturnNewName() {
        Tracker tracker = new Tracker();
        Item previous = new Item("test1", "testDescription", 123L);
        // Добавляем заявку в трекер. Теперь в объект проинициализирован id.
        tracker.add(previous);
        // Создаем новую заявку.
        Item next = new Item("test2", "testDescription2", 1234L);
        // Проставляем старый id из previous, который был сгенерирован выше.
        next.setId(previous.getId());
        // Обновляем заявку в трекере.
        tracker.replace(previous.getId(), next);
        // Проверяем, что заявка с таким id имеет новые имя test2.
        assertThat(tracker.findById(previous.getId()).getName(), is("test2"));
    }

    // Тест реализации добавления трех заявок и получения списка.
    @Test
    public void whenAddThreeItemsThenListWithItems() {
        Tracker tracker = new Tracker();
        Item one = new Item("itemOne", "itemOneDescription", 234L);
        tracker.add(one);
        Item two = new Item("itemTwo", "itemTwoDescription", 345L);
        tracker.add(two);
        Item three = new Item("itemThree", "itemThreeDescription", 567L);
        tracker.add(three);
        tracker.findAll();
        Item[] result = new Item[]{one, two, three};
        assertThat(tracker.findAll(), is(result));
    }

    // Тест реализации добавления трех заявок, удаления одной и проверки списка.
    @Test
    public void whenAddThreeItemsAndDeleteOneThenListWithTwo() {
        Tracker tracker = new Tracker();
        Item one = new Item("itemOne", "itemOneDescription", 234L);
        tracker.add(one);
        Item two = new Item("itemTwo", "itemTwoDescription", 345L);
        tracker.add(two);
        Item three = new Item("itemThree", "itemThreeDescription", 567L);
        tracker.add(three);
        tracker.delete(two.getId());
        Item[] result = new Item[]{one, three};
        assertThat(tracker.findAll(), is(result));
    }

    //Тест проверки выдачи заявки по имени.
    @Test
    public void whenAddThreeItemsAndAskForOneThenReceiveOneWithCorrectName() {
        Tracker tracker = new Tracker();
        Item one = new Item("itemOne", "itemOneDescription", 234L);
        tracker.add(one);
        Item two = new Item("itemTwo", "itemTwoDescription", 345L);
        tracker.add(two);
        Item three = new Item("itemThree", "itemThreeDescription", 567L);
        tracker.add(three);
        tracker.findByName("itemThree");
        Item[] result = new Item[]{three};
        assertThat(tracker.findByName("itemThree"), is(result));
    }

    //Тест поиска заявки по комментарию.
    @Test
    public void whenAddThreeItemsAddCommentToOneOfThemAndSearchByCommentThenFindItemWithCorrectComment() {
        Tracker tracker = new Tracker();
        Item one = new Item("itemOne", "itemOneDescription", 245L, "");
        tracker.add(one);
        Item two = new Item("itemTwo", "itemTwoDescription", 387L, "");
        tracker.add(two);
        Item three = new Item("itemThree", "itemThreeDescription", 3397L, "");
        tracker.add(three);
        tracker.addComment(three.getId(), "Victory");
        assertThat(tracker.findByComment("Victory").getComment(), is("Victory"));
    }
}