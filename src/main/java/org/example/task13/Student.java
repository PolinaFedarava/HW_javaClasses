package org.example.task13;

import java.util.Date;

public class Student {
    //У студента поля: имя, фамилия, дата рождения, город рождения, средний бал.
    String firstName;
    String surname;
    String birthDay;
    String birthPlaceCity;
    double averageMark;

    public Student(String firstName, String surname, String birthDay, String birthPlaceCity, double averageMark) {
        this.firstName = firstName;
        this.surname = surname;
        this.birthDay = birthDay;
        this.birthPlaceCity = birthPlaceCity;
        this.averageMark = averageMark;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getBirthPlaceCity() {
        return birthPlaceCity;
    }

    public void setBirthPlaceCity(String birthPlaceCity) {
        this.birthPlaceCity = birthPlaceCity;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(double averageMark) {
        this.averageMark = averageMark;
    }
}
