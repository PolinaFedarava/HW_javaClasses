package org.example.task21;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;
import java.util.Locale;

public class DateTimeTask {
    public static void main(String[] args) {
        Locale russianLocale = new Locale("ru", "RU");

        //1. Вывести текущую дату в формате (пример формата: 1 апреля 2023). На выходе дата должна быть класса String
        String task1 = formatDate1();
        System.out.println("1. " + task1);

        //2. Вывести текущую дату в формате (пример формата: 1 апреля 2023, 10:59:20 PM). На выходе дата должна быть класса String
        String task2 = formatDate2();
        System.out.println("2. " + task2);

        // 3. Перевести String (2023-03-19 : 10:12:24 AM) в формат LocalDateTime по умолчанию:
        LocalDateTime task3 = parseDate3();
        System.out.println("3. " + task3);

        // 4. Перевести String (пн 20.03.23 г. время: 15:07:28  ) в формат LocalDateTime по умолчанию:
        LocalDateTime task4 = parseDate4();
        System.out.println("4. " + task4);

        //5. *Вывести текущую дату в формате (пример формата: понедельник 20 марта 2023 время: 11.54.06 PM). На выходе дата должна быть класса String
        String task5 = formatDate5();
        System.out.println("5. " + task5);
    }
    // Задача1
    private static String formatDate1() {
        DateTimeFormatter formatter = DateTimeFormatter
                .ofPattern("d MMMM yyyy", new Locale("ru", "RU"));
        return LocalDateTime.now().format(formatter);
    }

    // Задача2
    private static String formatDate2() {
        DateTimeFormatter formatter = new DateTimeFormatterBuilder()
                .appendPattern("d MMMM yyyy, ")
                .appendPattern("h:mm:ss a")
                .toFormatter(new Locale("ru", "RU"));
        return LocalDateTime.now().format(formatter);
    }

    // Задача3
    private static LocalDateTime parseDate3() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(
                "yyyy-MM-dd : h:mm:ss a",
                Locale.ENGLISH
        );
        return LocalDateTime.parse("2023-03-19 : 10:12:24 AM", formatter);
    }

    // Задача4
    private static LocalDateTime parseDate4() {
        DateTimeFormatter formatter = new DateTimeFormatterBuilder()
                .appendPattern("E dd.MM.yy 'г. время:' HH:mm:ss")
                .parseDefaulting(ChronoField.YEAR, 2023)
                .toFormatter(new Locale("ru", "RU"));
        return LocalDateTime.parse("пн 20.03.23 г. время: 15:07:28", formatter);
    }

    // Задача5
    private static String formatDate5() {
        DateTimeFormatter formatter = new DateTimeFormatterBuilder()
                .appendPattern("EEEEE dd MMMM yyyy 'время:' hh.mm.ss a")
                .toFormatter(new Locale("ru", "RU"));
        return LocalDateTime.now().format(formatter);
    }
}
