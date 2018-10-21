package ru.job4j.extender;

public class Teacher extends Profession implements EarnMoney {

    public String subject;
    public int lectionHours;

    public Teacher() {
        System.out.println("Чему учить буду я пока не знаю... Но я существую");
    }

    public Teacher(String name, String subject, int lectionHours) {
        this.subject = subject;
        this.lectionHours = lectionHours;
        System.out.println("Я буду учить полезным вещам ваших деток...");
    }

    public void takeExam() {
    }

    public void makeMoney() {
        System.out.println("Учителям мало платят");
    }

    @Override
    public void setBonus() {
        System.out.println("Вам премия, сто целковых! Ни в чем себе не отказывайте!");
    }
}
