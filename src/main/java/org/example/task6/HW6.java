package org.example.task6;

public class HW6 {
    public static void main(String[] args) {
//        1. Создать массив из 10 элементов. Заполните массив числами и вывести их в консоль (выводите через цикл for each).
//        Замените каждый элемент с нечётным индексом на ноль. Выведите полученный массив в консоль через цикл for each
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Исходный массив:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                array[i] = 0;
            }
        }
        System.out.println("Массив после замены элементов с нечётным индексом на ноль:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
//        .2. Создать массив из 5 чисел и заполните этот массив вручную.
//        Создайте второй массив с размерностью больше на 1 чем первый массив.
//        Необходимо скопировать первый массив со всеми значениями во второй массив.
//        Последний элемент во втором массиве пусть будет 0.
//        Выведите второй массив в консоль с помощью цикла for each.
        int[] firstArray = {9, 8, 55, 41, 100};
        int[] secondArray = new int[firstArray.length + 1];
        for (int i = 0; i < firstArray.length; i++) {
            secondArray[i] = firstArray[i];
        }
        secondArray[secondArray.length - 1] = 0;
        System.out.println("Второй массив:");
        for (int num : secondArray) {
            System.out.print(num + " ");
        }
        System.out.println();
//        3.* Создать массив вручную. Заменить максимальный и минимальный элемент массива.
//        Новый минимальный элемент будет (-1000), новый максимальный элемент 1000.

//        4.* Создать массив (вручную). Отсортировать элементы массива в порядке возрастания.
//        Вывести полученный массив. Выполнить с помощью цикла for
         array = new int[]{90, 21, 9, 16, 6, 3};
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println("Отсортированный массив:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
