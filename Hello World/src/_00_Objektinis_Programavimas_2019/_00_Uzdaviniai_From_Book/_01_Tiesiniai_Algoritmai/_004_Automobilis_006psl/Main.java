//4. Automobilis. Automobilių tunelio po Nepriklausomybės aikšte Vilniuje ilgis lygus 264 m.
//        Parašykite programą, kuri apskaičiuotų, kelias sekundes s automobilis važiuoja šiuo
//        tuneliu, jei jo greitis yra v km/h? Rezultatus pateikite šimtųjų tikslumu.

package _00_Objektinis_Programavimas_2019._00_Uzdaviniai_From_Book._01_Tiesiniai_Algoritmai._004_Automobilis_006psl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Double tunelioIlgis=0.264;//km
        Integer automobilioGreitis;//km/h
        Double laikas;//s

        Scanner scan=new Scanner(System.in);
        System.out.println("Koks automobilio greitis km/h?");
        automobilioGreitis=scan.nextInt();

        laikas=tunelioIlgis/automobilioGreitis*3600;
        System.out.printf("Automobilis tunelį pervažiuos per: %.2fs.",laikas);
    }
}
