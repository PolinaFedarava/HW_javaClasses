package org.example.task13;

import java.util.Comparator;
import java.util.List;

public class Group {
    //У группы: номер группы, коллекция студентов (List<Student> students)
    int groupNumber;
    List<Student> students;

    //1.4. Реализовать метод классе Group, который должен пройти по всем студентам в группе и удалить тех,
    // у кого средний бал ниже переданной оценки в параметре метода. (метод remove).
    // Сигнатура метода: public void removeStudentsByMark(int mark);
    public void removeStudentsByMark(int mark) {
        for (Student student : students) {
            if (student.averageMark < mark) {
                students.remove(student);
            }
        }
    }

    //1.5. Реализовать метод, если в группе меньше 2 человек,
    // перевести этих студентов в другую группу. (методы коллекций size(), addAll());
    // Сигнатура метода: public void transferToGroup(Group newGroup);
    public void transferToGroup(Group newGroup) {
        if (students.size() < 2) {
            newGroup.students.addAll(students);
            students.clear();
        }

    }

    //1.6. Реализовать метод в классе Group,
    // который считает средний бал по группе. Сигнатуру и название придумайте сами.
    public double countAverageGroupMark() {
        double mark = 0;
        for (Student student : students) {
            mark = mark + student.averageMark;
        }
        mark = mark / students.size();
        return mark;
    }

    //1.9*. Вывести студентов в порядке возрастания среднего бала
    public List<Student> studentsSortedAsc() {
        return students.stream().sorted(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Double.compare(o1.averageMark, o2.averageMark);
            }
        }).toList();
    }

    //1.10*. Вывести студентов в порядке убывания среднего бала.0
    public List<Student> studentsSortedDesc() {
        return students.stream().sorted(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Double.compare(o2.averageMark, o1.averageMark);
            }
        }).toList();
    }

    public Group(int groupNumber, List<Student> students) {
        this.groupNumber = groupNumber;
        this.students = students;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
