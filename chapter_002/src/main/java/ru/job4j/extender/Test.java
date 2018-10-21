package ru.job4j.extender;

public class Test {

    public static void main(String[] args) {

        Engineer engineer = new Engineer("Ivanov", "RoofMaster", 5, 5000);
        Doctor deepGrave = new Doctor();
        deepGrave.sendToMorgue();
        deepGrave.makeDiagnose();
        engineer.builtHouse();
        Teacher sidorov = new Teacher();
        Teacher petrov = new Teacher("Petrov", "history", 130);
        petrov.makeMoney();
        engineer.makeMoney();
        deepGrave.setBonus();
        EarnMoney earnMoneyTeacher = new Teacher();
        EarnMoney earnMoneyDoctor = new Doctor();
        earnMoneyTeacher.setBonus();
        ((Doctor) earnMoneyDoctor).sendToMorgue();
        earnMoneyDoctor.setBonus();
        bonusToEveryone(earnMoneyDoctor);
        bonusToEveryone(earnMoneyTeacher);
        bonusToEveryone(engineer);

    }

    public static void bonusToEveryone(EarnMoney earnMoney) {
        earnMoney.setBonus();
    }

}
