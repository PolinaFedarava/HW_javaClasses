package org.example.task5;

import java.util.Scanner;

public class HW5 {
    public static void main(String[] args) {
//        1. Вывести все числа кратные 7 или 3 в диапазоне от 1 до100. (можно использовать цикл for)
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 || i % 7 == 0) {
                System.out.println(i);
            }
        }
//        2. Ввести 2 положительных числа с консоли с помощью сканера. Вывести сумму всех чисел от одного числа до другого.
//        (Используйте цикл while).Подсказка. До цикла объявите переменную int sum=0.
//        В самом цикле перезаписывайте в эту переменную сумму чисел.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое положительное число: ");
        int x1 = scanner.nextInt();
        System.out.print("Введите второе положительное число: ");
        int x2 = scanner.nextInt();
        int sum = 0;
        int start = Math.min(x1, x2);
        int end = Math.max(x1, x2);
        int i = start;
        while (i <= end) {
            sum += i;
            i++;
        }
        System.out.println("Сумма всех чисел от одного числа до другого равна " + sum);
//        3*. Ввести число с консоли, которое не заканчивается на 0.
//        Вывести число в обратном порядке. Использовать оператор %.
        System.out.print("Введите положительное число, не оканчивающееся на 0: ");
        int b1 = scanner.nextInt();
        if (b1 % 10 == 0) {
            System.out.print("Ошибка: число не должно оканчиваться на 0");
        } else {
            System.out.print("Число в обратном порядке: ");
            while (b1 > 0) {
                System.out.print(b1 % 10);
                b1 = b1 / 10;
            }
            System.out.println();
        }
//        4*. Ввести число с консоли, которое не заканчивается на 0.
//        Вывести чётные и нечётные числа через while and if. Использовать оператор %.
        System.out.print("Введите положительное число, не оканчивающееся на 0: ");
        int c1 = scanner.nextInt();
        if (c1 % 10 == 0) {
            System.out.print("Ошибка: число не должно оканчиваться на 0");
        } else {
            System.out.println("Чётность цифр в числе:");
            while (c1 > 0) {
                int digit = c1 % 10;
                if (digit % 2 == 0) {
                    System.out.println(digit + " – чётная");
                } else {
                    System.out.println(digit + " – нечётная");
                }
                c1 /= 10;
            }
        }
    }
}

