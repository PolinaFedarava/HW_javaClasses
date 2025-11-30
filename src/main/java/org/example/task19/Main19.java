package org.example.task19;

import java.util.*;
import java.util.stream.Collectors;

public class Main19 {
    public static void main(String[] args) {
        StringProcessor toUpperCase = (str) -> str.toUpperCase();

        System.out.println("Обычная строка: 'hello world'");
        System.out.println("В верхнем регистре: " + toUpperCase.process("hello world"));

        List<City> cities = Arrays.asList(
                new City(1, "Tokyo", 37400000, City.Continent.ASIA),
                new City(2, "New York", 19200000, City.Continent.NORTH_AMERICA),
                new City(3, "Sydney", 5300000, City.Continent.AUSTRALIA),
                new City(4, "London", 9300000, City.Continent.EUROPE),
                new City(5, "Mexico", 22000000, City.Continent.NORTH_AMERICA),
                new City(6, "Buenos Aires", 15000000, City.Continent.SOUTH_AMERICA),
                new City(7, "Minsk", 2000000, City.Continent.EUROPE)
        );

        //1.2. Найти самый густонаселённый город на континенте (filter по континенту+ max)
        City.Continent target = City.Continent.NORTH_AMERICA;
        Optional<City> mostPopulated = cities.stream()
                .filter(c -> c.getContinent() == target)
                .max(Comparator.comparingInt(City::getPopulation));
        mostPopulated.ifPresent(city ->
                System.out.println("Самый густонаселённый город в " + target + ": " + city)
        );

        //1.3. Найти город, с минимальным населением на континенте. (filter по континенту+ min)
        Optional<City> leastPopulated = cities.stream()
                .filter(c -> c.getContinent() == target)
                .min(Comparator.comparingInt(City::getPopulation));

        leastPopulated.ifPresent(city ->
                System.out.println("Город с минимальным населением в " + target + ": " + city)
        );

        //1.4. Найти самый густонаселённый город (max)
        Optional<City> mostPopulatedCity = cities.stream()
                .max(Comparator.comparingInt(City::getPopulation));
        mostPopulatedCity.ifPresent(city ->
                System.out.println("Самый густонаселённый город: " + city)
        );

        //1.5. Найти город с самым маленьким населением. (min)
        Optional<City> leastPopulatedCity = cities.stream()
                .min(Comparator.comparingInt(City::getPopulation)); // поиск минимума
        leastPopulatedCity.ifPresent(city ->
                System.out.println("Город с самым маленьким населением: " + city)
        );

        //1.6. Найти первый попавшиеся город, у которого население больше 1млн. (filter + findFirst).
        Optional<City> firstCityOverMillion = cities.stream()
                .filter(c -> c.getPopulation() > 1_000_000)
                .findFirst();
        firstCityOverMillion.ifPresent(city ->
                System.out.println("Первый город с населением > 1 млн: " + city)
        );

        //1.7. Отобрать города с населением больше 1 млн. (filter)
        List<City> citiesOverMillion = new ArrayList<>();
        for (City c : cities)
            if (c.getPopulation() > 1_000_000) {
                citiesOverMillion.add(c);
            }
        System.out.println("Города с населением больше 1 млн:");
        citiesOverMillion.forEach(System.out::println);

        //1.8. Создать коллекцию из названий городов, на основании объектов (map)
        List<String> cityNames = cities.stream()
                .map(City::getCityName)
                .toList();
        System.out.println("Названия городов:");
        cityNames.forEach(System.out::println);


    }
}
