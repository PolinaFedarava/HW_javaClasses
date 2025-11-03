package org.example.task11;

class RobotBuilder implements RobotEngineer {
//    РоботСроитель.
//    Поля: модель, потребляемая мощность, страна производитель, агрегат для строительства, материал,
//    включение робота (boolean isOn.)
//    Все три класса должны имплементировать интерфейс Робот. Реализовать все методы, к классах, которые требует интерфейс.

    String model;
    int powerConsumption;
    String country;
    String buildingUnit;
    String material;
    boolean isOn;

    public RobotBuilder(String model, int powerConsumption, String country, String buildingUnit, String material) {
        this.model = model;
        this.powerConsumption = powerConsumption;
        this.country = country;
        this.buildingUnit = buildingUnit;
        this.material = material;
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
        System.out.println(model + " ровняет стены");
    }

    @Override
    public void createItem() {
        System.out.println(model + " замешивает бетон");
    }
}
