package de.telran.module_1.lesson_1.module_1.lesson_1.homework15.task2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class SimpleEmployees {
    public static void main(String[] args) {
        List<Employees> list = new ArrayList<>();

        list.add(new Employees("Ivan", "Petrov", "Aleksevich", "Manager", "Marketing", 12000.0));
        list.add(new Employees("Artur", "Ahmedov", "Vasilyevich", "Programmer", "A2", 10000.0));
        list.add(new Employees("Anna", "Marupova", "Petrovna", "Designer", "B1", 9500.0));

//        Вычислить среднюю зарплату всех сотрудников
        double avgSalary = calculateSalary(list);
        System.out.println(avgSalary);

//        Получить список сотрудников с зп > 1000
        List<Employees> employeesList = filterSalary(list, 10000.0);
        employeesList.forEach(employees -> System.out.println(employees.getName() + ": " + employees.getSalary()));

//        Получить список сотрудников из отдела маркетинг и увеличить зп на 15%
        List<Employees> list1 = increaseSalary(list, "Marketing", 0.15);
        list1.forEach(employees -> System.out.println("The salary of the " + employees.getDepartment() + " department has been increased! "
                + employees.getName() + ": " + employees.getSalary()));

//        Получить сотрудника с самой низкой зп
        Optional<Employees> list2 = getMinSalary(list);
        list2.ifPresent(employees -> System.out.println("Lowest paid employee: " + employees.getName() + ": " + employees.getSalary()));

//        Получить сотрудника с самой высокой зп
        Optional<Employees> list3 = getMaxSalary(list);
        list3.ifPresent(employees -> System.out.println("Highest paid employees: "
                + employees.getName() + " -> " + employees.getSalary()));

//        Сгруппировать сотрудников по должности

    }

    private static double calculateSalary(List<Employees> list) {
        return list.stream()
                .mapToDouble(Employees::getSalary)
                .average()
                .orElse(0.0);
    }

    private static List<Employees> filterSalary(List<Employees> list, double salary) {
        return list.stream()
                .filter(employees -> employees.getSalary() >= salary)
                .collect(Collectors.toList());
    }

    private static List<Employees> increaseSalary(List<Employees> employeesList, String department, double increase) {
        return employeesList.stream()
                .filter(employees -> employees.getDepartment().equals(department))
                .map(employees -> {
                    double incSalary = employees.getSalary() * (1 + increase);
                    employees.setSalary(incSalary);
                    return employees;
                })
                .collect(Collectors.toList());
    }

    private static Optional<Employees> getMinSalary(List<Employees> list) {
        return list.stream()
                .min(Comparator.comparingDouble(Employees::getSalary));
    }

    private static Optional<Employees> getMaxSalary(List<Employees> list) {
        return list.stream()
                .max(Comparator.comparingDouble(Employees::getSalary));
    }
}

