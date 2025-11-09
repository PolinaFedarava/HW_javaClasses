package org.example.task14;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Ward {
    //1.2 У палаты поля: номер, тип палаты (энам мужская или женская), список пациентов
    int number;
    Set<Patient> patients = new TreeSet<>();
    String diagnosisWard;

    WARD_TYPE wardType = WARD_TYPE.MAN;

    //1.6 Реализовать метод добавления пациента в палату на основе диагноза.
    // Т.е, в палате должны лежать пациенты с одинаковыми диагнозами. Метод реализовать в классе Палата.
    public boolean addPatiantByDiagnosis(Patient patient) {
        if (patient.diagnosis.equals(diagnosisWard)) {
            return patients.add(patient);
        } else {
            return false;
        }
    }

    //1.7 В классе Палата создать метод, которые выводить информацию по всем пациентам в палате.
    public void printAllInfoAboutPatients() {
        System.out.println("Палата номер" + number);
        for (Patient patient : patients) {
            System.out.println("ID: " + patient.id + ", Пол: " + patient.gender + ", Имя:" + patient.name + " " + patient.lastName + ", Возраст: " + patient.age + ", Диагноз: " + patient.diagnosis);
        }
    }

    //1.8*. Сортировать пациентов по идентификационному номеру.
    // (коллекция TreeSet, интерфейс Comparable)
    // Для этого в классе Палата пациенты должны лежать в коллекции TreeSet.
    // А класс пациент должен имплементировать интерфейс Comparable
    public Set<Patient> sortPatientByID() {
        return patients;
    }


    public Ward(int number, WARD_TYPE wardType, Set<Patient> patients, String diagnosisWard) {
        this.number = number;
        this.wardType = wardType;
        this.patients = patients;
        this.diagnosisWard = diagnosisWard;
    }

    public String getDiagnosisWard() {
        return diagnosisWard;
    }

    public void setDiagnosisWard(String diagnosisWard) {
        this.diagnosisWard = diagnosisWard;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public WARD_TYPE getWardType() {
        return wardType;
    }

    public void setWardType(WARD_TYPE wardType) {
        this.wardType = wardType;
    }

    public Set<Patient> getPatients() {
        return patients;
    }

    public void setPatients(Set<Patient> patients) {
        this.patients = patients;
    }
}
