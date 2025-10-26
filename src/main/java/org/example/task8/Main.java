package org.example.task8;

public class Main {
    public static String processStrings(String str1, String str2) {
        if (str1.endsWith(str2)) {
            int index = str1.lastIndexOf(str2);
            return str1.substring(0, index);
        } else {
            return str1.toUpperCase();
        }
    }
    public static String insertSubstring(int k, String text, String insertStr) {
        String[] words = text.split("\\s+");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            result.append(words[i]);
            if ((i + 1) % k == 0) {
                result.append(insertStr);
            }
            if (i < words.length - 1) {
                result.append(" ");
            }
        }
        return result.toString();
    }
    public static String cleanText(String text) {
        String cleaned = text.replaceAll("[^\\p{L}\\s]+", "");
        cleaned = cleaned.replaceAll("\\s+", " ").trim();
        return cleaned;
    }

    public static void main(String[] args) {
        String first = "Я люблю java";
        String second = "java";

        String result = processStrings(first, second);
        System.out.println(result);

        String first2 = "Я люблю Python";
        String result2 = processStrings(first2, second);
        System.out.println(result2);

        String text2 = "Каждая строка, создаваемая с помощью оператора new,литерала (заключенная в двойные апострофы) и ли метода класса, создающего строку, является экземпляром класса String. Особенностью объекта класса String является то, что его значение не может быть изменено после создания объекта при помощи любого метода класса. Изменение строки всегда приводит к созданию нового объекта в heap. Сама объектная ссылка при этом сохраняет прежнее значение и хранится в стеке. Произведенные изменения можно сохранить переинициализируя ссылку.";
        int k = 5;
        String insertStr = " TECT";

        String modifiedText = insertSubstring(k, text2, insertStr);
        System.out.println(modifiedText);

        String text3 = "[translate:Да1та выпуска 8 декабря 1998 года[12]. Кодовое имяPlayground. В данном случае встречается путаница. Выпускались книги, например,Beginning Java 2 by Ivor Horton (Mar 1999), фактически по J2SE 1.2 (бывшее название — Java 2). Вместе с тем по сей день такие книги публикуются, например: Х. М. Дейтел, П. Дж. Дейтел, С. И. Сантри. Технологии программирования на Java2. Распределённые приложения (2011). В то время, когда, как известно, Java 2была исторически заменена следующими релизами, подобные названия книг дезориентируют в понимании, о какой же версии Java они написаны на самом деле. Если J2SE 1.2 принято считать за Java 2, а авторы книг за Java 2 принимают JDK7, это приводит к полной путанице.]";

        String cleanedText = cleanText(text3);
        System.out.println(cleanedText);
    }
}
