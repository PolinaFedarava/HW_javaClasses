package org.example.task11;

public interface Robot {
//    1. Создать интерфейс Робот.
//    В нём определены методы:
//    Дефолтный метод:  Отремонтировать робота и
//    абстрактные методы: включить робота, выключить, продемонстрировать уникальные способности (uniquePossibility).
        default void repairRobot() {
            System.out.println("Ремонт робота выполнен");
        }
        void turnOn();
        void turnOff();
        void uniquePossibility();
}
