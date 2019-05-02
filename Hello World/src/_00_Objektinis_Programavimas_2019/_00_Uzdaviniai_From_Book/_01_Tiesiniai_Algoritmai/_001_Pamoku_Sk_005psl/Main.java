//1. Pamoka. Parašykite programą, kuri padėtų Petriukui suskaičiuoti, kiek pamokų jis turi per savaitę
//        ir kiek tai sudarys minučių. Klaviatūra įvedami 5 skaičiai, reiškiantys kiekvienos
//        dienos pamokų skaičių.

package _00_Objektinis_Programavimas_2019._00_Uzdaviniai_From_Book._01_Tiesiniai_Algoritmai._001_Pamoku_Sk_005psl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] dienos=new String[]{"pirmadienį","antradienį","trečiadienį","ketirtadienį","penktadienį"};
        Integer pamokuSuma=0;
        Integer pamokosMinutem=0;

        for (int i=0; i<5; i++){
            Scanner reader = new Scanner(System.in);
            System.out.println("Kiek pamokų yra "+dienos[i]+"?");
            Integer pamokuSk=reader.nextInt();
            pamokuSuma+=pamokuSk;
        }
        pamokosMinutem=pamokuSuma*45;
        System.out.println("Iš viso pamokų turėjo: "+pamokuSuma+";\n");
        System.out.println("Tai sudaro minučių: "+pamokosMinutem);
    }
}
