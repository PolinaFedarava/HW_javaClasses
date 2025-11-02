package org.example.task9;

public class Main {
    public static void main(String[] args) {
//  .1 Создать по объекту соответствующих классов продемонстрировать поведение собак и птиц.
//  (вызвать соответствующие методы в классах собака и птица)
        Animal animal1 = new Animal("рыжий", 20, "мясо");
        Dog dog1 = new Dog("черный", 20, "корм", "Чарли", "Бордер-Колли", 30);
        Bird bird1 = new Bird("серый", 5, "зерно", "Воробей", 3);

        animal1.makeSounds();
        animal1.play();
        System.out.println(animal1.toString());

        dog1.bark();
        dog1.bite();
        dog1.run();
        dog1.jump();
        dog1.play();
        dog1.makeSounds();
        System.out.println(dog1.toString());

        bird1.sing();
        bird1.peck();
        bird1.hatchСhicks();
        bird1.play();
        bird1.makeSounds();
        System.out.println(bird1.toString());

//        1.6 Используя метод по добавлению животного в зоопарк (п.1.4) добавить по три собаки и по три птицы.
//        (Выполнять это в методе Main, создав соответствующие объекты зоопарка, птиц, собак и т.д.)
        Zoo zoo = new Zoo();
        zoo.addAnimal(new Dog("рыжий", 20, "паштет", "Степа", "Такса", 10));
        zoo.addAnimal(new Dog("белый", 20, "мясо", "Тоша", "Французская болонка", 8));
        zoo.addAnimal(new Dog("черный", 20, "консервы", "Марк", "Овчарка", 35));
        zoo.addAnimal(new Bird("желтая", 10, "червяк", "Жёлтая трясогузка", 5));
        zoo.addAnimal(new Bird("оранжевая", 11, "корм", "Зарянка", 15));
        zoo.addAnimal(new Bird("белая", 15, "насекомые", "Большая белая цапля", 100));
//        1.7 Получить всех животных из зоопарка. Пройтись по всем животным в зоопарке и вызвать методы
//        (издание звуков, животное играет).
//        У вас должны вывестись соответствующие реализации для 3 собак и для трёх птиц(Выполнять это в методе Main)
        Animal[] allAnimals = zoo.getAnimals();
        for (Animal animal : allAnimals){
            animal.makeSounds();
            animal.play();
        }
    }
}
