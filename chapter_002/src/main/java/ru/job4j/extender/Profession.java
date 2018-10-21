package ru.job4j.extender;

public class Profession {

    private String name;
    private String description;

    public void setName(String userName) {
        this.name = name;
    }

    public void setDescription(String userDescription) {
        this.description = userDescription;
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public Profession(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Profession() {
        this.name = "Франкенштейн";
        this.description = "Ты не ввел имя и профессию, и поэтому я иду к тебе";
    }

    public void exist() {
        System.out.println("Ура, я существую!");
    }

    public void makeMoney() {
        System.out.println("Make money, be happy!!!");
    }


}
