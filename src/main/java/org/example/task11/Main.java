package org.example.task11;

public class Main {
//    1.2 В классе Main создайте по экземпляру объекта (РоботСапёр, роботСтроитель, РоботПовар)
//    и вызовите метод отремантировать робота (результаты выполнения методы выведите в консоль)


    //    1.6 Создать 3 выставки (массива) роботов в классе Main.
//    Одна выставка будет включать в себя все виды роботов (робот-повар, робот сапёр, робот строитель).
//    Вторая выставка- только для инженерных роботов.
//    Третья выставка- для роботов сапёров.
//    Продемонстрировать способности всех роботов, которые представлены на выставках (вызвать метод uniquePossibility)
//    Продемонстрировать способности всех роботов-инженеров на выставке Роботов-инженеров,
//    вызвав метод createItem на каждом Роботе, который есть на выставке.
    public static void main(String[] args) {
        RobotBuilder robotBuilder1 = new RobotBuilder("TestBuiler1", 220, "Италия", "стены", "железо");
        RobotSapper robotSapper1 = new RobotSapper("TestSapper1", 100, "4", "железо");
        RobotCook robotCook1 = new RobotCook("TestCook1", 120, "Япония", "Печь пироги");

        Robot[] exhibitionAll = new Robot[3];
        exhibitionAll[0] = robotCook1;
        exhibitionAll[1] = robotSapper1;
        exhibitionAll[2] = robotBuilder1;

        RobotEngineer[] robotEngineers = new RobotEngineer[2];
        robotEngineers[0] = robotSapper1;
        robotEngineers[1] = robotBuilder1;

        Robot[] robotsSappers = new Robot[1];
        robotsSappers[0] = robotSapper1;

        for (Robot curRobot : exhibitionAll) {
            curRobot.uniquePossibility();
        }

        for (RobotEngineer curRobot : robotEngineers) {
            curRobot.uniquePossibility();
            curRobot.createItem();
        }
    }
}
