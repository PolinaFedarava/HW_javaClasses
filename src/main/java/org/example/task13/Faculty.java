package org.example.task13;


import java.util.List;

public class Faculty {
    //У факультета: наименование факультета, список групп (List<Group> groups. )
    String nameFaculty;
    List<Group> groups;

    //1.7*. Добавить поле для факультета энамовского типа:
    // ACTIVE (Активный) и NOT_ACTIVE (Неактивный факультет). Реализовать геттеры и сеттеры.
    FACULTY_STATE faculteState = FACULTY_STATE.ACTIVE;

    public FACULTY_STATE getFaculteState() {
        return faculteState;
    }

    public void setFaculteState(FACULTY_STATE faculteState) {
        this.faculteState = faculteState;
    }

    //1.8* Реализовать метод по смене статуса факультета:
    // Если общее количество студентов на факультете
    // меньше 20-сделать факультет неактитвным. (Метод size() в коллекции)

    public void updateFacultyState() {
        int studentCount = 0;
        for (Group group : groups) {
            studentCount = studentCount + group.students.size();
        }
        if (studentCount < 20) {
            faculteState = FACULTY_STATE.NOT_ACTIVE;
        }
    }

    public Faculty(String nameFaculty, List<Group> groups) {
        this.nameFaculty = nameFaculty;
        this.groups = groups;
    }

    public String getNameFaculty() {
        return nameFaculty;
    }

    public void setNameFaculty(String nameFaculty) {
        this.nameFaculty = nameFaculty;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }
}
