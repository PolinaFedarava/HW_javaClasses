package org.example.task4;

import java.util.Scanner;

public class HW4 {
    public static void main(String[] args){
//        1. На вход даны 3 числа. Вывести в консоль только четные числа
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int a1 = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int b1 = scanner.nextInt();
        System.out.print("Введите третье число: ");
        int c1 = scanner.nextInt();
        if (a1 % 2 == 0) {
            System.out.println("Чётное число: " + a1);
        }
        if (b1 % 2 == 0) {
            System.out.println("Чётное число: " + b1);
        }
        if (c1 % 2 == 0) {
            System.out.println("Чётное число: " + c1);
        }
        System.out.println("***************************************");
//        2. На вход даны 3 числа. Вывести в консоль только те числа, которые делятся на 2 и на 5
//        (используйте оператор % для проверки деления без остатка)
        System.out.print("Введите первое число: ");
        int a2 = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int b2 = scanner.nextInt();
        System.out.print("Введите третье число: ");
        int c2 = scanner.nextInt();
        System.out.println("Числа, делящиеся на 2 и на 5:");
        if (a2 % 2 == 0 && a2 % 5 == 0) {
            System.out.println(a2);
        }
        if (b2 % 2 == 0 && b2 % 5 == 0) {
            System.out.println(b2);
        }
        if (c2 % 2 == 0 && c2 % 5 == 0) {
            System.out.println(c2);
        }
        System.out.println("***************************************");
//        3. Дано 15/x=result, где x-число, которое вводится с командной строки, result-результат вычисления.
//        Написать программу, которая будет выводит разный текст, в зависимости от значения result.
//        В случае result=3, вывести: "Результат деления равен 3" В случае result=5 вывести:
//        "Результат деления равен 5" В других случаях вывести: "Результат деления равен дробному числу". П
//        ри этом в последнем случае вывести точный результат деления (использовать приведение типов)
//        Для выполнения задания использовать оператор switch- case Подготовить пул реквест в ветку master.
        System.out.print("Введите число: ");
        int x = scanner.nextInt();
        double result = (double) 15 /x;
        switch ((int) result){
            case 3: {
                System.out.println("Результат деления равен 3");
            }
            case 5: {
                System.out.println("Результат деления равен 5");
            }
            default: {
                System.out.println("Результат деления равен дробному числу. "
                 + result);
            }
        }

    }
}
