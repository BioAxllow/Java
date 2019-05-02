package _00_Objektinis_Programavimas_2019._00_Dziugo_Examples._03_Sprint.Demo_13;


import _00_Objektinis_Programavimas_2019._00_Dziugo_Examples._03_Sprint.data.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Kazys", 1400.0, "administration"));
        employees.add(new Employee("Jonas", 800.0, "store"));
        employees.add(new Employee("Ona", 900.0, "sales"));
        employees.add(new Employee("Petras", 1200.0, "sales"));
        employees.add(new Employee("Ada", 1500.0, "administration"));

        // Išrinkti visus skyrius
        Set<String> s1 = employees.stream()
                .map(Employee::getDepartment)
                .collect(Collectors.toSet());
        System.out.println("Set<String>: " + s1);

        // Išrinkti visus skyrius ir jų darbuotojus
        Map<String, List<Employee>> s2 = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));
        System.out.println("Map<String, List<Employee>>: " + s2);

        // Išrinkti visus skyrius ir jų darbuotojų suminius atlyginimus
        Map<String, Double> s3 = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.reducing(0.0, Employee::getSalary, Double::sum)));
        System.out.println("Map<String, Double>: " + s3);

        // Išrinkti visus skyrius ir jų darbuotojų vardus
        Map<String, Set<String>> s4 = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.mapping(Employee::getName, Collectors.toSet())
                ));
        System.out.println("Map<String, Set<String>>: " + s4);

    }

}
