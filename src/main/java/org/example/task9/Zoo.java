package org.example.task9;

public class Zoo {
//    1.4 Реализовать метод в классе зоопарк по добавлению нового животного.
//    Сигнатура метода будет такая: public void addAnimal(Animal animal);
//    Данный метод должен будет скопировать текущий массив с животными в новый массив с животными.
//    Размерность нового массива должна увеличиться на 1, так как метод добавляет новое животное.
//    Полученный массив нужно перезаписать в поле animals в классе Зоопарк.
    Animal[] animals = new Animal[0];
    public Zoo() {
    }

    public void addAnimal(Animal animal){
        Animal [] newAnimals = new Animal[animals.length +1];
        for (int i = 0; i< animals.length; i++){
            newAnimals[i] = animals[i];
        }
        newAnimals[newAnimals.length-1] = animal;
        animals = newAnimals;
    }
//    1.5 Реализовать метод getAnimals в классе зоопарк который будет возвращать всех животных в зоопарке.

    public Animal[] getAnimals() {
        return animals;
    }
}
