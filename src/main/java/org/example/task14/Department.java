package org.example.task14;

import java.util.HashSet;
import java.util.Set;

public class Department {
    //1.3 У отделения поля: наименование отделения, список палат (коллекция Set)
    String departmentName;
    Set<Ward> wards = new HashSet<>();

    //1.5 Посчитать количество мужчин и женщин в отделении.
    public void countPatientsInDepartment() {
        int maleCount = 0;
        int femaleCount = 0;
        System.out.println("Количество мужчин и женщин в отделении " + departmentName + ":");
        for (Ward ward : wards) {
            for (Patient patient : ward.patients) {
                if (patient.gender.equals(GENDER.MALE)) {
                    maleCount = maleCount + 1;
                } else {
                    femaleCount = femaleCount + 1;
                }
            }
        }
        System.out.println("Количество мужчин " + maleCount);
        System.out.println("Количество женщин " + femaleCount);
    }


    public Department(Set<Ward> wards, String departmentName) {
        this.wards = wards;
        this.departmentName = departmentName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Set<Ward> getWards() {
        return wards;
    }

    public void setWards(Set<Ward> wards) {
        this.wards = wards;
    }
}
