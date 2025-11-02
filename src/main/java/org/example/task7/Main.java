package org.example.task7;

public class Main {
    public static void main(String[] args) {
        //6. В классе main создать массив из пяти студентов.
        Student[] students = new Student[5];
        students[0] = new Student(1, "Ivan", "Ivanov", "Engineering", 2, "A1", 85);
        students[1] = new Student(2, "Petr", "Petrov", "Mathematics", 1, "B1", 90);
        students[2] = new Student(3, "Dima", "Kuznetsov", "Physics", 3, "A2", 75);
        students[3] = new Student(4, "Anna", "Smirnova", "Biology", 2, "B2", 60);
        students[4] = new Student(5, "Maria", "Sidorova", "Chemistry", 1, "A1", 95);

        int markThreshold = 80;

        Student[] filteredStudents = Student.getStudents(students, markThreshold);

        for (Student student : filteredStudents) {
            student.info();
        }
    }
}
