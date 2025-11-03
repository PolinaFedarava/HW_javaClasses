package org.example.task11;

class RobotSapper implements RobotEngineer {
    //    РоботСапёр. Поля: модель, потребляемая мощность, средство для разминирования (шасси номер),
//    материал, включение робота (boolean isOn)
    String model;
    int powerConsumption;
    String chassisNumber;
    String material;
    boolean isOn;

    public RobotSapper(String model, int powerConsumption, String chassisNumber, String material) {
        this.model = model;
        this.powerConsumption = powerConsumption;
        this.chassisNumber = chassisNumber;
        this.material = material;
        this.isOn = false;
    }

    //    В классе РоботСапёр переопределите дефолтный метод (отремонтировать робота)
    @Override
    public void repairRobot() {
        System.out.println(model + " отремонтирован Роботом Сапером");
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
        System.out.println(model + " робот сапер разминирует мину");
    }

    @Override
    public void createItem() {
        System.out.println(model + " создаёт приспособление для разминирования");
    }
}
