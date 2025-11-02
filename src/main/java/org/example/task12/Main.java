package org.example.task12;

public class Main {
    public static void main(String[] args) {
        //        1.5 Класс Main. Создать 2 объекта класса Garage.
//        Вывести на экран имя хранимого транспортного средства и проверить разрешён ли въезд транспортного средства в гараж.
        Car car = new Car(95, "VW");
        Motorcycle motorcycle = new Motorcycle(105, "Harley Davidson");

        Garage<Vehicle> garage1 = new Garage<>(new Vehicle(60, "Vespa"));
        Garage<Vehicle> garage2 = new Garage<>(new Vehicle(130, "Belarus"));

        Garage<Car> carGarage = new Garage<>(car);
        Garage<Motorcycle> motoGarage = new Garage<>(motorcycle);

        System.out.println("Транспорт: " + carGarage.getVehicle().getName());
        System.out.println("Въезд разрешён: " + carGarage.isEntryPermitted());

        System.out.println("Транспорт: " + motoGarage.getVehicle().getName());
        System.out.println("Въезд разрешён: " + motoGarage.isEntryPermitted());

        System.out.println("Транспорт: " + garage1.getVehicle().getName());
        System.out.println("Въезд разрешён: " + garage1.isEntryPermitted());

        System.out.println("Транспорт: " + garage2.getVehicle().getName());
        System.out.println("Въезд разрешён: " + garage2.isEntryPermitted());

    }
}
