package task18;

public class Main18 {
    public static void main(String[] args) {
        startCarThreads();
    }

    private static void startCarThreads() {
        Car car1 = new Car("Машина 1", "3060CC7", 500);
        Car car2 = new Car("Машина 2", "6080XX7", 700);
        Car car3 = new Car("Машина 3", "9990EE5", 600);

        Thread thread1 = new Thread(car1);
        Thread thread2 = new Thread(car2);
        Thread thread3 = new Thread(car3);

        thread1.start();
        try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        thread2.start();
        thread3.start();
    }
}
