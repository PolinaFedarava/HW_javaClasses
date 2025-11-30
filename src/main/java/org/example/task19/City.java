package org.example.task19;

public class City {
    //2. Создать класс Город. Поля id, имя города, население, континент (Enum)
    int id;
    String cityName;
    int population;
    Continent continent;

    enum Continent {
        AFRICA,
        ANTARCTICA,
        ASIA,
        EUROPE,
        NORTH_AMERICA,
        SOUTH_AMERICA,
        AUSTRALIA
    }

    public City(int id, String cityName, int population, Continent continent) {
        this.id = id;
        this.cityName = cityName;
        this.population = population;
        this.continent = continent;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public Continent getContinent() {
        return continent;
    }

    public void setContinent(Continent continent) {
        this.continent = continent;
    }

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", cityName='" + cityName + '\'' +
                ", population=" + population +
                ", continent=" + continent +
                '}';
    }
}
