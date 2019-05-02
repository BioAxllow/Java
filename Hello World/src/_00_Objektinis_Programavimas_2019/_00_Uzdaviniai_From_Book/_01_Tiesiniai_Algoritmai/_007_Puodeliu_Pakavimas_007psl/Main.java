//7. Puodelių pakavimas. Į vieną kartoninę dėžutę telpa trys puodeliai. Pakuotojas užklijuoja dėžutę ir
//        išsiunčia ją į parduotuvę, jei ji pilna. Iš viso reikia supakuoti m puodelių. Parašykite programą,
//        kuri apskaičiuotų, kelios bus pilnos dėžutės ir kiek puodelių liks nesupakuota.

package _00_Objektinis_Programavimas_2019._00_Uzdaviniai_From_Book._01_Tiesiniai_Algoritmai._007_Puodeliu_Pakavimas_007psl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Integer puodeliuSK;
        Integer puodeliuSkPakuoteje;
        Integer pilnosDezes;
        Integer likutis;

        Scanner scan=new Scanner(System.in);

        System.out.println("How many cups?");
        puodeliuSK=scan.nextInt();

        System.out.println("How many cups will fit in a box?");
        puodeliuSkPakuoteje=scan.nextInt();

        likutis=puodeliuSK%puodeliuSkPakuoteje;
        pilnosDezes=(puodeliuSK-likutis)/puodeliuSkPakuoteje;

        System.out.println("Full boxes: "+pilnosDezes+";");
        System.out.println("Unpacked amount of cups: "+likutis+";");
    }
}
