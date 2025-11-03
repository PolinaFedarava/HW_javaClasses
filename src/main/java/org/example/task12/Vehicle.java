package org.example.task12;

public class Vehicle {
//    1 Создать поле name и количество выбросов(Integer) в классе Vehicle и проинициализировать его через конструктора.
    String name;
    Integer amountOfEmissions;

    public Vehicle(Integer amountOfEmissions, String name) {
        this.amountOfEmissions = amountOfEmissions;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAmountOfEmissions() {
        return amountOfEmissions;
    }

    public void setAmountOfEmissions(Integer amountOfEmissions) {
        this.amountOfEmissions = amountOfEmissions;
    }
}
