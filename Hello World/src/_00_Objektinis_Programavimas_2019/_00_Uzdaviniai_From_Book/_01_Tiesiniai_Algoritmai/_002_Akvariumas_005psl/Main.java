//        2. Akvariumas. Akvariume gyvena a žuvų. Kiekvieną dieną Petriukas į akvariumą įdeda b žuvų.
//                Parašykite programą, kuri suskaičiuotų kiek iš viso bus žuvų po n dienų. Rezultatą
//                reikia išvesti su paaiškinamaisiais žodžiais

package _00_Objektinis_Programavimas_2019._00_Uzdaviniai_From_Book._01_Tiesiniai_Algoritmai._002_Akvariumas_005psl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Integer kiekGyvenaZuvu;
        Integer kiekIdedamaZuvu;
        Integer kiekDienuPraejo;
        Integer kiekBusZuvu;

        Scanner scan=new Scanner(System.in);

        System.out.println("Kiek žuvų gyena akvariume?");
        kiekGyvenaZuvu=scan.nextInt();

        System.out.println("Kiek žuvų įdedama į akvariumą kiekvieną dieną?");
        kiekIdedamaZuvu=scan.nextInt();

        System.out.println("Kiek dienų praėjo?");
        kiekDienuPraejo=scan.nextInt();

        kiekBusZuvu=kiekGyvenaZuvu+kiekIdedamaZuvu*kiekDienuPraejo;

        System.out.println("Po "+kiekDienuPraejo+" dienų akvariume gyvens "+kiekBusZuvu+" žuvų.");
    }
}
