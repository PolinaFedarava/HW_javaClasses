package org.example.task17;

import java.io.Serializable;
import java.util.Objects;

public class Car implements Serializable {
    //2.1 Создать объект Автомобиль с полями (Марка автомобиля, максимальная скорость, страна производства).
    // Переопределите метод toString(), equals(), hashcode(), гетеры и сетеры (генерируйте с помощью идеи).
    // В классе Main создать объект автомобиль. Выполнить сериализацию объекта. Реализуйте соответствующий метод в классе Main

    String brand;
    int maxSpeed;
    String countryOfOrigin;

    public Car(String brand, int maxSpeed, String countryOfOrigin) {
        this.brand = brand;
        this.maxSpeed = maxSpeed;
        this.countryOfOrigin = countryOfOrigin;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", countryOfOrigin='" + countryOfOrigin + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return maxSpeed == car.maxSpeed && Objects.equals(brand, car.brand) && Objects.equals(countryOfOrigin, car.countryOfOrigin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, maxSpeed, countryOfOrigin);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }
}
