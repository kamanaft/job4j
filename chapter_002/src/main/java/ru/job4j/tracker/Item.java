package ru.job4j.tracker;

/**
 * @author Alexey Zhukov (mailto:hadzage@gmail.com)
 * @version $02$
 * @since 21.10.2018
 */

public class Item {

    private String id;

    public String name;

    private String description;

    private String comment;

    private String create;

    public Item() {
    }

    /*public Item(String name, String description, String id) {
        this.name = name;
        this.description = description;
        this.id = id;
    }*/

    public Item(String name, String description, String comment, String create) {
        this.name = name;
        this.description = description;
        this.comment = comment;
        this.create = create;
    }

    /*public Item(String name, String description, long create) {
        this.name = name;
        this.description = description;
        this.create = create;
    }*/

    public Item(String name, String desc) {
        this.name = name;
        this.description = desc;
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    /*public long getCreate() {
        return this.create;
    }*/

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

    @Override
    public String toString() {
        return "Item{"
                + "id='" + id + '\''
                + ", name='" + name + '\''
                + ", description='" + description + '\''
                + ", comment='" + comment + '\''
                + ", create=" + create
                + '}';
    }


}