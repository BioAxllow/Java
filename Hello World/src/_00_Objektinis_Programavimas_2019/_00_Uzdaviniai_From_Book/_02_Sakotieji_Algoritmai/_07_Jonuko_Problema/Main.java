//7. Jonuko problema. Jonukas žino, kad mokytoja jam gali duoti spręsti vieną iš trijų kontrolinio darbo variantų.
// Atlikdamas užduotį jis gaus du skaičius a ir b, o jam reikės apskaičiuoti x reikšmę pagal vieną iš trijų formulių.
//        Pirmas variantas: x = ab+3;
//        Antras variantas: x = a+b;
//        Trečias variantas: x = a-b.
//        Parašykite programą, kuri padėtų Jonukui pasitikrinti, ar jis teisingai skaičiuoja x reikšmę spręsdamas
//        kiekvieno varianto užduotį.

package _00_Objektinis_Programavimas_2019._00_Uzdaviniai_From_Book._02_Sakotieji_Algoritmai._07_Jonuko_Problema;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Integer uzdVariantas;
        Double kintA;
        Double kintB;
        Double Ats;

        Scanner scan=new Scanner(System.in);

        System.out.println("Įveskite uždavinio variantą (1,2 arba 3): ");
        uzdVariantas=scan.nextInt();
        while (uzdVariantas <1 || uzdVariantas>3){
            System.out.println("Galimi variantai: 1,2,3 - pasirinkti vieną iš jų.");
            uzdVariantas=scan.nextInt();
        }
        System.out.println("Įveskite a reikšmę: ");
        kintA=scan.nextDouble();

        System.out.println("Įveskite b reikšmę: ");
        kintB=scan.nextDouble();

       switch (uzdVariantas){
           case 1:
               Ats=kintA*kintB+3;
               System.out.printf("Atsakymas: x = %.2f;",Ats);
               break;
           case 2:
               Ats=kintA+kintB;
               System.out.printf("Atsakymas: x = %.2f;",Ats);
               break;
           case 3:
               Ats=kintA-kintB;
               System.out.printf("Atsakymas: x = %.2f;",Ats);
               break;
       }

    }
}
