package ru.job4j.extender;

public class Engineer extends Profession {

    public String specialization;
    public int experience;
    public int salary;

    Engineer engineer = new Engineer();
    //this.experience =experience;
    //this.salary =salary;


    public void builtHouse() {

    }

    public void controlQuality() {

    }

    public int countSalary() {
        return salary * experience;
    }


}
