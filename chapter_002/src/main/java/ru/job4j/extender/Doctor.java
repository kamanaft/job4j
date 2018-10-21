package ru.job4j.extender;

public class Doctor extends Profession implements EarnMoney {

    private String hospital;
    private int experience;

    public Doctor(String name, String description, String hospital, int experience) {
        this.hospital = hospital;
        this.experience = experience;
        System.out.println("Доктор подготовлен, начал причинять добро направо и налево");
    }

    public Doctor() {
        System.out.println("Доктор " + getName() + " нулевый, работает над своим личным кладбищем");
    }

    public void heal() {
    }

    public void sendToMorgue() {
        System.out.println("Мертвые не кусаются! ха-ха-ха");
    }

    public void makeDiagnose() {
        System.out.println("Раз врач сказал в морг, значит в морг! Хватит заниматься самолечением!");
    }

    public void setBonus() {
        System.out.println("Премия за заслуги перед человечеством 500 баксов");
    }
}
