package org.example.task9;

public class Bird extends Animal {
//    Определить поля в классе Птица: семейство, максимальная высота полёта.
//    В классе птица методы-петь, клевать, высиживать птенцов.
//    При этом, в консоли должны выводиться поля семейства птиц с соответствующим поведением (пример: Воробей поёт).
    private String family;
    private int maximumFlightAltitude;

    public Bird (String color, int maxLifeSpan, String feedType, String family, int maximumFlightAltitude) {
        super(color, maxLifeSpan, feedType);
        this.family = family;
        this.maximumFlightAltitude = maximumFlightAltitude;
    }

    public void sing() {
        System.out.println(family + "поет");
    }

    public void peck() {
        System.out.println(family + "клюет");
    }

    public void hatchСhicks() {
        System.out.println(family + "высиживает птенцов");
    }

    @Override
    public String toString() {
        return "Птица {Вид='" + family + "', максимальная высота полёт='" + maximumFlightAltitude +
                ", окрас='" + color + "', maxLifeSpan=" + maxLifeSpan + ", foodType='" + feedType + "'}";
    }

    @Override
    public void makeSounds (){
        System.out.println(family + " поет");
    }

    @Override
    public void play (){
        System.out.println(family + " играет c червяком");
    }
}
