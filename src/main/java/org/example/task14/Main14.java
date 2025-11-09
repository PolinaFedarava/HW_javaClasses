package org.example.task14;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main14 {
    public static void main(String[] args) {
        //Создать пациентов.
        // Распределить их по палатам.
        // В одной палате по 3 пациента максимум.
        // При этом попробуйте добавит двух пациентов, с одинаковыми полями.
        // Если количество пациентов в палате увеличилось, значит неправильно реализованы equals и hashСode.
        // Палаты распределить по отделениям.

        Patient patient1 = new Patient(1, GENDER.MALE, "Игорь", "Петров", "язва", 55);
        Patient patient2 = new Patient(2, GENDER.MALE, "Матвей", "Иванов", "гастрит", 40);
        Patient patient3 = new Patient(2, GENDER.MALE, "Матвей", "Иванов", "гастрит", 40);
        Patient patient4 = new Patient(4, GENDER.FEMALE, "Ирина", "Иванова", "пневмония", 45);
        Patient patient5 = new Patient(5, GENDER.FEMALE, "Лариса", "Алексеева", "орви", 28);
        Patient patient6 = new Patient(6, GENDER.FEMALE, "Виктория", "Федорова", "воспаление легких", 32);
        Patient patient7 = new Patient(7, GENDER.MALE, "Илья", "Смирнов", "Гастро", 22);

        Set<Patient> patients1 = new TreeSet<>();
        patients1.add(patient1);
        patients1.add(patient2);
        ;

        Set<Patient> patients2 = new TreeSet<>();
        patients2.add(patient4);
        patients2.add(patient5);
        patients2.add(patient6);

        Ward ward1 = new Ward(1, WARD_TYPE.MAN, patients1, "Гастро");
        Ward ward2 = new Ward(2, WARD_TYPE.MAN, patients2, "Пульмо");
        System.out.println("ДО " + ward1.patients.size());
        ward1.patients.add(patient3);
        System.out.println("ПОСЛЕ добавления пациента с такими же полями " + ward1.patients.size());

        ward1.addPatiantByDiagnosis(patient7);
        System.out.println("Добавления пациента в палату на основе диагноза " + ward1.patients.size());

        ward1.printAllInfoAboutPatients();

        Set<Ward> wardGastro = new HashSet<>();
        wardGastro.add(ward1);

        Set<Ward> wardPulmo = new HashSet<>();
        wardPulmo.add(ward2);

        Department department1 = new Department(wardGastro, "Гастроэнтерологическое отделение");
        Department department2 = new Department(wardPulmo, "Пульмонологическое отделение");

        department1.countPatientsInDepartment();
        department2.countPatientsInDepartment();

        List<Patient> sortedPatients = ward1.sortPatientByID().stream().toList();
        for (Patient patient : sortedPatients) {
            System.out.println(patient.id);
        }


    }
}
