package org.example.task15;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main15 {
    public static void main(String[] args) {
        //1.3.Создать сотрудников (создайте штук восемь)
        Employee employee1 = new Employee(1, "Анна", "Иванова", 28, 1200);
        Employee employee2 = new Employee(2, "Дмитрий", "Петров", 35, 1500);
        Employee employee3 = new Employee(3, "Ольга", "Сидорова", 42, 1800);
        Employee employee4 = new Employee(4, "Сергей", "Кузнецов", 31, 1350);
        Employee employee5 = new Employee(5, "Мария", "Орлова", 25, 1100);
        Employee employee6 = new Employee(6, "Алексей", "Волков", 39, 1700);
        Employee employee7 = new Employee(7, "Екатерина", "Морозова", 33, 1400);
        Employee employee8 = new Employee(8, "Николай", "Федоров", 45, 2000);

        //1.4.Создать мапку и записать туда созданных сотрудников в качестве ключа.,
        // а в качестве значения им присвоить им профессию.
        HashMap<Employee, String> employees = new HashMap<>();
        employees.put(employee1, "Бухгалтер");
        employees.put(employee2, "Инженер-программист");
        employees.put(employee3, "HR-менеджер");
        employees.put(employee4, "Маркетолог");
        employees.put(employee5, "Дизайнер");
        employees.put(employee6, "Руководитель отдела");
        employees.put(employee7, "Аналитик данных");
        employees.put(employee8, "Финансовый директор");

        System.out.println("До повышения:");
        for (Employee employee : employees.keySet()) {
            System.out.println(employee + " (" + employees.get(employee) + ")");
        }
        raiseSalaryForProfession(employees, 200);
        System.out.println("После повышения:");
        for (Employee employee : employees.keySet()) {
            System.out.println(employee + " (" + employees.get(employee) + ")");
        }

    }
    //        1.5 Реализуйте статический метод в классе Main, который повысит зарплату сотрудникам одной профессии.
//        Сигнатура метода к примеру такая.
//        private static void raiseSalaryForProfession(Map<Employee, String> employees, int amountOfIncrease).
//        Например: Необходимо повысить зарплату плотникам на 200 рублей. (Обратите внимание на метод entrySet).
    private static void raiseSalaryForProfession(HashMap<Employee, String> employees, int amountOfIncrease){
        Set<Map.Entry<Employee, String>> employeeSet= employees.entrySet();
        for (Map.Entry<Employee, String> entry : employees.entrySet()) {
                Employee emp = entry.getKey();
                emp.setSalary(emp.getSalary() + amountOfIncrease);
            }


    }




}
