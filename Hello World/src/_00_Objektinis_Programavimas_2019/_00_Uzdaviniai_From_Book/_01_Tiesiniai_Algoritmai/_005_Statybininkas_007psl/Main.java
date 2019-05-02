//5. Statybininkas. Statybininkui reikia pastatyti sieną, kurios ilgis yra a metrų, o aukštis h metrų
//        (a ir h – sveikieji skaičiai). Kiek reikės plytų, kurių ilgis 20 cm, o aukštis 10 cm ir kiek
//        kainuos plytos, jeigu vienos plytos kaina k Lt. Pinigų sumą pateikti šimtųjų tikslumu.

package _00_Objektinis_Programavimas_2019._00_Uzdaviniai_From_Book._01_Tiesiniai_Algoritmai._005_Statybininkas_007psl;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Integer sienosIlgis; //m
        Integer sienosPlotis; //m
        Double plytosKaina; //Lt
        Integer plytuKiekis;
        Double plytuKainaAll;

        Scanner scan=new Scanner(System.in);

        System.out.println("Koks sienos ilgis? ");
        sienosIlgis=scan.nextInt();

        System.out.println("Koks sienos plotis? ");
        sienosPlotis=scan.nextInt();

        System.out.println("Kokia vienos plytos kaina? ");
        plytosKaina=scan.nextDouble();

        plytuKiekis=sienosIlgis*sienosPlotis*50;
        plytuKainaAll=plytuKiekis*plytosKaina;

        System.out.println("Plytų kiekis: "+plytuKiekis+" vnt.");
        System.out.printf("Plytų kaina: %.2fLt.",plytuKainaAll);

    }
}
