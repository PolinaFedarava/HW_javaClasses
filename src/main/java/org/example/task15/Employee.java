package org.example.task15;

public class Employee {
    //1.1.Создать класс. Сотрудник.
    //1.2.Поля у сотрудника. Идентификационный номер, Имя, фамилия, возраст, зарплата.
    int idNumber;
    String firstName;
    String lastName;
    int Age;
    double salary;

    public Employee(int idNumber, String firstName, String lastName, int age, double salary) {
        this.idNumber = idNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        Age = age;
        this.salary = salary;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }
}
