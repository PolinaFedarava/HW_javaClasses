package org.example.task7;

public class Student {
    //1.  Создать класс Student c полями id (тип int), name (тип String), surname (тип String),
    // faculty (факультет, тип String ), course(тип int) , Группа(тип String), средняя оценка (тип int).
    private static int id;
    private static String name;
    private static String surname;
    private String faculty;
    private int course;
    private String group;
    private int rating;

    //Cоздать метод в классе Student, который будет принимать массив студентов и возвращать из этих студентов,
    // массив студентов у которых оценка выше переданной оценке в методе.
    // Сигнатура метода будет выглядеть так PublicStudent[]getStudents(Students[] students, int mark)
    public static Student[] getStudents(Student[] students, int mark) {
        int count = 0;
        for (Student student : students) {
            if (student.rating > mark) {
                count++;
            }
        }

        Student[] studentsNew = new Student[count];
        count = 0;
        for (Student student : students) {
            if (student.rating > mark) {
                studentsNew[count] = student;
                count++;
            }
        }
        return studentsNew;
    }

    //2. Создать метод, который будет выводить информацию по полям которые есть в классе и назвать его info
    public void info() {
        System.out.println("Student information:");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Faculty: " + faculty);
        System.out.println("Course: " + course);
        System.out.println("Group: " + group);
        System.out.println("Rating: " + rating);
    }

    //3. Создать метод, который будет изменять текущую группу студента
    //(сам метод в качестве параметра будет принимать новую группу)
    public void changeGroup(String newGroup) {
        this.group = newGroup;
    }

    //4. Создать метод, который будет возвращать текущую группу студента.
    public String getGroup() {
        return group;
    }

    //5. Создать метод, который будет изменять оценку студента и группу студента.
    public void changeMarkAndGroup(int newMark, String newGroup) {
        this.rating = newMark;
        this.group = newGroup;
    }

    //Инициализацию студента в классе main выполнять через конструктор с параметрами
    public Student(int id, String name, String surname, String faculty, int course, String group, int rating) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
        this.rating = rating;
    }

    //Также определите конструктор без параметра
    public Student() {
        this.id = 0;
        this.name = "";
        this.surname = "";
        this.faculty = "";
        this.course = 1;
        this.group = "";
        this.rating = 0;
    }
}
