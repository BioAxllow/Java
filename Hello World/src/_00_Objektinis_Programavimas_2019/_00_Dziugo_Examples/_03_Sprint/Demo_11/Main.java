package _00_Objektinis_Programavimas_2019._00_Dziugo_Examples._03_Sprint.Demo_11;

import java.util.Random;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {

        // Filter
        IntStream stream = IntStream.range(1, 101);
        // Srauto negalima panaudoti du kartus!!!
        // kadangi count() suskaičiuoja elementus "praleisdamas" srautą
        // tai tolimesni vaiksmai su tuo pačiu srautu iššauks klaidą
        //System.out.println("Viso " + stream.count());
        long count2 = stream
                .filter(x -> x % 2 == 0)
                .filter(x -> x > 10)
                .count();
        System.out.println("Viso lyginių didesnių už 10 yra " + count2);

        // Map
        int suma = IntStream.range(1, 201)
                .filter(x -> x % 2 == 0)
                .map(x -> x / 2).sum();
        System.out.println("Suma " + suma);

        // Sorted
        System.out.print("sorted");
        stream = new Random().ints(10, 1, 1000);
        stream.sorted().forEach(x -> System.out.print(" " + x));
    }
}
