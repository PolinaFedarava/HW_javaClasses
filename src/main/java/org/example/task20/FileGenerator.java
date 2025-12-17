package org.example.task20;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.concurrent.Callable;

public class FileGenerator implements Callable<String> {
    private final int taskId;
    private final Random random = new Random();

    public FileGenerator(int taskId) {
        this.taskId = taskId;
    }

    @Override
    public String call() throws Exception {
        String threadName = Thread.currentThread().getName();
        String fileName = "file_" + taskId + ".txt";

        System.out.println("Задача " + taskId + " выполняется в потоке: " + threadName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (int i = 1; i <= 10; i++) {
                String line = "Строка " + i + " задачи " + taskId + " [" + threadName + "]";
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        int sleepTime = 1 + random.nextInt(3);
        System.out.println("Задача " + taskId + " (" + threadName + ") спит " + sleepTime + " секунд...");
        Thread.sleep(sleepTime * 1000);

        System.out.println("Задача " + taskId + " завершена в потоке: " + threadName);
        return fileName;
    }
}
