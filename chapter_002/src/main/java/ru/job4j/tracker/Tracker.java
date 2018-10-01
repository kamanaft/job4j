package ru.job4j.tracker;

import java.util.*;
import java.lang.String;

/**
 * @author Alexey Zhukov (mailto:hadzage@gmail.com)
 * @version $02$
 * @since 26.09.2018
 */

public class Tracker {
    /**
     * Массив для хранения заявок.
     */
    private Item[] items = new Item[100];

    /**
     * Указатель позиции для новой ячейки.
     */
    private int position = 0;

    /**
     * Присваивает полю случайное число.
     */
    private static final Random RN = new Random();

    /**
     * Метод, реализующий добавление заявки в хранилище.
     *
     * @param item Новая заявка.
     */
    public Item add(Item item) {
        item.setId(this.generateId());
        this.items[this.position++] = item;
        return item;
    }

    /**
     * Метод генерирует уникальный ключ для заявки.
     * Т.к. у заявки нет уникальных полей, имени и описания, то для идентификации нам нужен уникальный ключ.
     *
     * @return Уникальный ключ.
     */
    private String generateId() {
        return String.valueOf(System.currentTimeMillis() + RN.nextInt());
    }

    /**
     * Метод, реализующий редактирование заявки.
     *
     * @param id   Уникальный ключ.
     * @param item Новая заявка.
     */
    public void replace(String id, Item item) {
        for (int index = 0; index != this.position; index++) {
            if (item != null && item.getId().equals(id)) {
                this.items[index] = item;
                item.setId(id);
                break;
            }
        }
    }

    /**
     * Метод, реализующий удаление заявки.
     *
     * @param id Уникальный ключ.
     */
    public void delete(String id) {
        for (int index = 0; index != this.position; index++) {
            if (items[index].getId().equals(id)) {
                System.arraycopy(this.items, index + 1, this.items, index, (items.length - 1 - index));
                this.items[position--] = null;
                break;
            }
        }
    }

    /**
     * Метод, реализующий получение списка всех заявок.
     */
    public Item[] findAll() {
        Item[] result = new Item[this.position];
        for (int index = 0; index != this.position; index++) {
            result[index] = this.items[index];
        }
        int unique = result.length;
        for (int count = 0; count != result.length - 1; count++) {
            if (result[count] == null) {
                result[count] = result[result.length - 1];
                result[result.length - 1] = null;
                unique--;
            }
        }
        return Arrays.copyOf(result, unique);
    }

    /**
     * Метод, реализующий получение списка по имени.
     *
     * @param name Имя заявки.
     */
    public Item[] findByName(String name) {
        Item[] result = new Item[this.position];
        int count = 0;
        for (int index = 0; index < this.position; index++) {
            if (items[index] != null && items[index].getName().equals(name)) {
                result[count++] = this.items[index];
            }
        }
        return Arrays.copyOf(result, count);
    }

    /**
     * Метод, реализующий получение заявки по id.
     *
     * @param id Уникальный ключ.
     */
    public Item findById(String id) {
        Item result = null;
        for (Item item : items) {
            if (item.getId().equals(id)) {
                result = item;
                break;
            }
        }
        return result;
    }

    /**
     * Метод, реализующий добавление комментария.
     *
     * @param id    Имя заявки.
     * @param comment Комментарий к заявке.
     */
    public void addComment(String id, String comment) {
        for (Item item : items) {
            if (item.getId().equals(id)) {
                item.setComment(comment);
                break;
            }
        }
    }

    /**
     * Метод, реализующий получение заявки по комментарию.
     *
     * @param comment Комментарий к заявке.
     */
    public Item findByComment(String comment) {
        Item result = null;
        for (Item item : items) {
            if (item.getComment().equals(comment)) {
                result = item;
                break;
            }
        }
        return result;
    }
}