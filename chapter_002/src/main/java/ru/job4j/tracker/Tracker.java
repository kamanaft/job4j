package ru.job4j.tracker;

import java.util.*;

/**
 * @author Alexey Zhukov (mailto:hadzage@gmail.com)
 * @version $01$
 * @since 19.09.2018
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
                this.items[index] = null;
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
        return result;
    }

    /**
     * Метод, реализующий получение всех активных заявок.
     */
    public Item[] findAllActive() {
        int count = 0;
        for (Item item : items) {
            if (item != null) {
                count++;
            }
        }
        Item[] result = new Item[count];
        int incount = 0;
        for (int index = 0; index != this.position; index++) {
            if (items[index] != null) {
                result[incount] = this.items[index];
                incount++;
            }
        }
        return result;
    }


    /**
     * Метод, реализующий получение списка по имени.
     *
     * @param name Имя заявки.
     */
    public Item[] findByName(String name) {
        int count = 0;
        for (Item item : items) {
            if (item != null && item.getName().equals(name)) {
                count++;
            }
        }
        Item[] result = new Item[count];
        int i = 0;
        for (int index = 0; index != this.position; index++) {
            if (items[index] != null && items[index].getName().equals(name)) {
                result[i] = this.items[index];
                i++;
            }
        }
        return result;
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
     * @param id      Уникальный ключ.
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


}