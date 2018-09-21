package ru.job4j.extender;

public class Doctor extends Profession {

    private String hospital;
    public int experience;

    Doctor house = new Doctor();
    //this.experience = experience;

    public String getSphere() {
        return hospital;
    }

    public void heal() {
    }
}
