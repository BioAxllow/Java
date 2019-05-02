package _00_Objektinis_Programavimas_2019._00_Dziugo_Examples._03_Sprint.Demo_05;

import java.util.Collection;
import java.util.Iterator;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        Collection<String> set = new TreeSet<>();

        set.add("Kaunas");
        set.add("Vilnius");
        set.add("Kaunas");
        set.add("Alytus");
        set.add("Klaipėda");
        set.add("Vilnius");
        set.add("Kaunas");

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String s = iterator.next();

            System.out.println(s);
        }

    }
}