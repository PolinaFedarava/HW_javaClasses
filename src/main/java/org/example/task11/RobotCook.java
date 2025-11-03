package org.example.task11;

class RobotCook implements Robot {
    //    РоботПовар поля: модель, потребляемая мощность, страна производитель,
//    агрегат для приготовления, включение робота (boolean isOn).
    String model;
    int powerConsumption;
    String country;
    String cookingUnit;
    boolean isOn;

    public RobotCook(String model, int powerConsumption, String country, String cookingUnit) {
        this.model = model;
        this.powerConsumption = powerConsumption;
        this.country = country;
        this.cookingUnit = cookingUnit;
        this.isOn = false;
    }

    @Override
    public void turnOn() {
        isOn = true;
        System.out.println(model + " включён");
    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println(model + " выключен");
    }

    @Override
    public void uniquePossibility() {
        System.out.println(model + " приготовит пирог");
    }
}
