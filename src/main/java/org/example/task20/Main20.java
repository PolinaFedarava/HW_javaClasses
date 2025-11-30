package org.example.task20;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main20 {
    private static void runTasks() {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        List<Future<String>> futures = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            futures.add(executor.submit(new FileGenerator(i)));
        }

        List<String> fileNames = new ArrayList<>();
        for (Future<String> future : futures) {
            try {
                fileNames.add(future.get());
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }

        executor.shutdown();

        System.out.println("Все задачи завершены. Список созданных файлов:");
        for (String name : fileNames) {
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
        runTasks();
    }
}
