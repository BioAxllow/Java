package _00_Objektinis_Programavimas_2019._00_Dziugo_Examples._03_Sprint.Demo_10;



import _00_Objektinis_Programavimas_2019._00_Dziugo_Examples._03_Sprint.data.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();
        list.add(new Employee("Kazys", 1400.0, "administration"));
        list.add(new Employee("Jonas", 800.0, "store"));
        list.add(new Employee("Ona", 900.0, "sales"));
        list.add(new Employee("Petras", 1200.0, "sales"));
        list.add(new Employee("Ada", 1500.0, "administration"));

        System.out.println("stream of List:");
        list.stream().filter(e -> e.getSalary() > 1000.0).forEach(System.out::println);

        System.out.println("stream of parameters:");
        Stream.of(1, 2, 3, 4).findAny().ifPresent(System.out::println);

        System.out.println("stream of range 1..100: " +
                IntStream.range(1, 101).sum()
        );

        System.out.println("stream of random numbers: " +
                new Random().ints(100, 1, 100).sum()
        );

    }
}
