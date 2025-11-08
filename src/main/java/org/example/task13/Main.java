package org.example.task13;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Иван", "Иванов", "01.01.2000", "Минск", 7.5);
        Student student2 = new Student("Катя", "Морозова", "05.05.2005", "Брест", 8.8);
        Student student3 = new Student("Дима", "Сидоров", "04.11.2006", "Гродно", 9.0);
        Student student4 = new Student("Роман", "Петров", "21.12.2006", "Витебск", 6.9);

        ArrayList<Student> students1 = new ArrayList<>();
        students1.add(student1);
        ArrayList<Student> students2 = new ArrayList<>();
        students2.add(student2);
        students2.add(student3);
        ArrayList<Student> students3 = new ArrayList<>();
        students3.add(student4);

        Group group1 = new Group(1, students1);
        Group group2 = new Group(2, students2);
        Group group3 = new Group(3, students3);
        Group group4 = new Group(4, new ArrayList<Student>());
        ArrayList<Group> groups1 = new ArrayList<>();
        groups1.add(group1);
        ArrayList<Group> groups2 = new ArrayList<>();
        groups2.add(group2);
        groups2.add(group3);

        Faculty faculty1 = new Faculty("Физики", groups1);
        Faculty faculty2 = new Faculty("Химии", groups2);

//        for(Student student : group2.getStudents()){
//            System.out.println(student.getFirstName() + student.getAverageMark());
//        }

        //group2.removeStudentsByMark(9);
        //group1.transferToGroup(group4);
        //System.out.println(group2.countAverageGroupMark());

//        System.out.println(faculty2.getFaculteState());
//        faculty2.updateFacultyState();
//        System.out.println(faculty2.getFaculteState());

//        for(Student student : group4.getStudents()){
//            System.out.println("Результат: " + student.getFirstName() + student.getAverageMark());
//        }
        for (Student student : group2.getStudents()) {
            System.out.println(student.getFirstName() + student.getAverageMark());
        }
//        group2.studentsSortedAsc();

        for (Student student : group2.studentsSortedDesc()) {
            System.out.println("Результат: " + student.getFirstName() + student.getAverageMark());
        }
    }

}
