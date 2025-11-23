package task18;


public class Car implements Runnable {
    //1.Создать класс авто. Поля в классе будут: имя машины, гос. номер, время остановки.
    // Определить в нём метод, при котором авто будет просто ехать (выводить в консоль сообщение в цикле).

    String name;
    String number;
    int timeStop;

    public Car(String name, String number, int timeStop) {
        this.name = name;
        this.number = number;
        this.timeStop = timeStop;
    }

    @Override
    public void run() {
        drive();
    }

    public void drive() {
        for (int i = 1; i <= 5; i++) {
        System.out.println("Автомобиль " + name + " с номером " + number + " едет: шаг " + i);
        }
        try {
            Thread.sleep(timeStop);
            System.out.println("Автомобиль " + name + " остановился на " + timeStop + " секунд.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getTimeStop() {
        return timeStop;
    }

    public void setTimeStop(int timeStop) {
        this.timeStop = timeStop;
    }


}
