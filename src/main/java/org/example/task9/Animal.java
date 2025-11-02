package org.example.task9;

public class Animal {
    //    Поля в классе животное: окрас, максимальная продолжительность жизни,
//    тип еды которой питаются (мясо, насекомые, растения).
//    Определить методы в классе животное: (издание звуков, животное играет)
    final String color;
    final int maxLifeSpan;
    final String feedType;

    public void makeSounds () {
        System.out.println("Животное издает звук");
    }

    public void play (){
        System.out.println("Животное играет");
    }

    public Animal(String color, int maxLifeSpan, String feedType) {
        this.color = color;
        this.maxLifeSpan = maxLifeSpan;
        this.feedType = feedType;
    }

    @Override
    public String toString() {
        return "Животное {окрас='" + color + "', maxLifeSpan=" + maxLifeSpan + ", foodType='" + feedType + "'}";
    }

}
