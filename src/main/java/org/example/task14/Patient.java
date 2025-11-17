package org.example.task14;

import java.util.Objects;

public class Patient implements Comparable<Patient> {
    //1.1 У пациента поля: уникальный идентификатор,
    // имя, фамилия, диагноз, возраст, пол (сделать enum класс: Мужской, Женский).
    int id;
    String name;
    String lastName;
    String diagnosis;
    int age;

    GENDER gender = GENDER.MALE;

    public Patient(int id, GENDER gender, String name, String lastName, String diagnosis, int age) {
        this.id = id;
        this.gender = gender;
        this.name = name;
        this.lastName = lastName;
        this.diagnosis = diagnosis;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public GENDER getGender() {
        return gender;
    }

    public void setGender(GENDER gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Patient patient = (Patient) o;
        return id == patient.id && age == patient.age && Objects.equals(name, patient.name) && Objects.equals(lastName, patient.lastName) && Objects.equals(diagnosis, patient.diagnosis) && gender == patient.gender;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, lastName, diagnosis, age, gender);
    }

    @Override
    public int compareTo(Patient o) {
        return this.id - o.id;
    }
}
