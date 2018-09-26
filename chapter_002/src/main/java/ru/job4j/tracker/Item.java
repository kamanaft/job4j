package ru.job4j.tracker;

/**
 * @author Alexey Zhukov (mailto:hadzage@gmail.com)
 * @version $01$
 * @since 20.09.2018
 */

public class Item {

    private String id;

    public String name;

    private String description;

    private String comment;

    private long create;

    public Item() {
    }

    public Item(String name, String description, long create, String comment) {
        this.name = name;
        this.description = description;
        this.comment = comment;
        this.create = create;
    }

    public Item(String name, String description, long create) {
        this.name = name;
        this.description = description;
        this.create = create;
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public long getCreate() {
        return this.create;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getComment() {
        return this.comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }


}