package ru.job4j.extender;

public class Engineer extends Profession implements EarnMoney {

    public String specialization;
    public int experienceYears;
    public int salary;

    public Engineer(){
        System.out.println("Создали меня, какого-то неполноценного");
    }

    public Engineer(String name, String specialization, int experienceYears, int salary){
        this.specialization = specialization;
        this.experienceYears = experienceYears;
        this.salary = salary;
        System.out.println("Инженер создан, все при нем");
    }


    public void builtHouse() {
        System.out.println("Сейчас как построю...");
    }

    public void controlQuality() {
        System.out.println("Стоит и ладно, главное не падает");
    }

    public int countSalary() {
        return salary * experienceYears / 10;
    }

    public void setBonus(){
        System.out.println("Начальство одобрило премию в виде 13-й зарплаты");
    }


}
