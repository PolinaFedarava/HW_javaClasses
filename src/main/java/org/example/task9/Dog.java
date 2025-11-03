package org.example.task9;

public class Dog extends Animal {
//    В классе собака определить имя, порода, средний вес.
//    В классе Собака реализовать методы: лаять, кусать, бегать, играть, прыгать.
//    При этом, в консоли должны выводится имя собаки вместе с описанием действия (пример. Рекс прыгает).

    private final String name;
    private final String breed;
    private final double mediumWeight;

    public Dog(String color, int maxLifeSpan, String foodType, String name, String breed, double mediumWeight) {
        super(color, maxLifeSpan, foodType);
        this.name = name;
        this.breed = breed;
        this.mediumWeight = mediumWeight;
    }

    public void bark () {
        System.out.println(name + "лает");
    }

    public void bite () {
        System.out.println(name + "кусает");
    }

    public void run () {
        System.out.println(name + "бегает");
    }

    public void jump () {
        System.out.println(name + "прыгает");
    }

    @Override
    public String toString() {
        return "Собака {имя='" + name + "', порода='" + breed + "', средний вес=" + mediumWeight +
                ", окрас='" + color + "', maxLifeSpan=" + maxLifeSpan + ", foodType='" + feedType + "'}";
    }

    @Override
    public void makeSounds (){
        System.out.println(name + " рычит");
    }

    @Override
    public void play (){
        System.out.println(name + " играет c мячом");
    }
}
