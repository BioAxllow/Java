package _00_Objektinis_Programavimas_2019.main;

import java.util.Scanner;

public class Ciklai {
    public static void main(String[] args) {
//        Naudojant for ciklą apsirašyti ciklą cikle ir atspausdinti kiekvieno ciklo indeksus i ir j

        System.out.println("iveskite norimas i ir j reiksmes: ");
        Scanner reader = new Scanner(System.in);
        Integer a = reader.nextInt();
        Integer b = reader.nextInt();
        int sumi = 0;
        int sumj = 0;
        for (int i = 0; i <= a; i++) {

            for (int j = 0; j <= b; j++) {
                System.out.println("[" + i + "; " + j + "];");
                sumi += i;
                sumj += j;
            }
            if (sumi >= 12 | sumj >= 12) {
                if (sumi >= 12) {
                    System.out.println("Indeksu i suma virsijo 12");
                    break;
                } else {
                    System.out.println("Indeksu j suma virsijo 12");
                    break;
                }
            }
        }

        System.out.println("visu i ir j indeksu suma yra: [" + sumi + ";" + sumj + "];");

        System.out.println("iveskite skaiciu: ");
        Integer number = reader.nextInt();

        System.out.println("visi lyginiai skaiciai yra: ");
        for (int i = 2; i <= number; i += 2) {
            System.out.println(i);
        }

    }

}
