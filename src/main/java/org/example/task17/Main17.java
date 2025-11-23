package org.example.task17;

import javax.swing.plaf.synth.SynthPainter;
import java.io.*;

public class Main17 {
    public static void main(String[] args) {
        String text = "The Rostóvs knew everybody in Moscow. The old count had money enough that year, as all his estates had been remortgaged, and so Nicholas, acquiring a trotter of his own, very stylish riding breeches of the latest cut, such as no one else yet had in Moscow, and boots of the latest fashion, with extremely pointed toes and small silver spurs, passed his time very gaily. After a short period of adapting himself to the old conditions of life, Nicholas found it very pleasant to be at home again. He felt that he had grown up and matured very much. His despair at failing in a Scripture examination, his borrowing money from Gavríl to pay a sleigh driver, his kissing Sónya on the sly—he now recalled all this as childishness he had left immeasurably behind. Now he was a lieutenant of hussars, in a jacket laced with silver, and wearing the Cross of St. George, awarded to soldiers for bravery in action, and in the company of well-known, elderly, and respected racing men was training a trotter of his own for a race. He knew a lady on one of the boulevards whom he visited of an evening. He led the mazurka at the Arkhárovs’ ball, talked about the war with Field Marshal Kámenski, visited the English Club, and was on intimate terms with a colonel of forty to whom Denísov had introduced him.";
        String absolutePath = "/Users/palinakukhmar/Documents/repositories/Java25/HW_Project/HWtext2.txt";
        String fileName = "HWtext3.txt";
        fileWriter(fileName, text);
        fileWriterAbsolute(absolutePath, text);
        fileReader(fileName);
        fileReaderAbsolute(fileName, absolutePath);
        Car car = new Car("Nissan", 170, "Japan");
        serializeCar(car, "car2");
        Car restoredCar = deserializeCar("car2");
        System.out.println("Десериализованный объект: " + restoredCar);

    }

    public static void fileWriter(String fileName, String text) {
        //1.1 Записать его в файл,  прописав относительный путь. Реализуйте соответствующий метод в классе Main
        File file = new File(fileName);
        try (FileWriter fileWriter = new FileWriter(file);) {
            fileWriter.write(text);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void fileWriterAbsolute(String absolutePath, String text) {
        //1.2 Записать его в файл прописав абсолютный путь. Реализуйте соответствующий метод в классе Main
        File file = new File(absolutePath);
        try (FileWriter fileWriter = new FileWriter(file);) {
            fileWriter.write(text);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void fileReader(String fileName) {
        //1.3 Вычитать текст из первого файла. Реализуйте соответствующий метод в классе Main
        FileReader fileReader = null;
        try {

            fileReader = new FileReader(fileName);
            //fileReader = new FileReader(absolutePath);
            BufferedReader br = new BufferedReader(fileReader);
            System.out.println(br.readLine());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void fileReaderAbsolute(String fileName, String absolutePath) {
        //1.4 Вычитать текст из второго файла Реализуйте соответствующий метод в классе Main
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(absolutePath);
            BufferedReader br = new BufferedReader(fileReader);
            System.out.println(br.readLine());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    //В классе Main создать объект автомобиль. Выполнить сериализацию объекта. Реализуйте соответствующий метод в классе Main
    private static void serializeCar(Car car, String fileName) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(car);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    //Выполнить десериализацию автомобиля и вывести его в консоли. Реализуйте соответствующий метод в классе Main
    private static Car deserializeCar(String fileName) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            return (Car) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

}
