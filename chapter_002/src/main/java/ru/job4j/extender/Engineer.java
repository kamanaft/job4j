package ru.job4j.extender;

public class Engineer extends Profession {

    public String specialization;
    public int experienceYears;
    public int salary;

    Engineer engineer = new Engineer();
    //this.specialization =specialization;
    //this.experienceYears =experienceYears;
    //this.salary =salary;


    public void builtHouse() {

    }

    public void controlQuality() {

    }

    public int countSalary() {
        return salary * experienceYears / 10;
    }


}
