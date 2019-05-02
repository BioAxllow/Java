//3. Matematika. Petriukas per pusmetį gavo 5 matematikos pažymius. Mokytoja nusprendė padaryti vaikams staigmeną: mokiniai,
//        kurių pažymių vidurkis yra didesnis už 9, gaus tris saldainius, o mokiniams, kurių vidurkis yra tarp 7 ir 9, įskaitant
//        intervalo galus, bus apdovanoti dviem saldainiais. Visi likusieji gaus po vieną saldainį.
//        Parašykite programą, kuri pagal įvestus Petriuko pažymius apskaičiuotų, kiek saldainių jis gaus.

package _00_Objektinis_Programavimas_2019._00_Uzdaviniai_From_Book._02_Sakotieji_Algoritmai._03_Matematika;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Integer[] pazymiai= new Integer[5];
        Double vidurkis;
        Integer suma=0;

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter 5 marks that Peter received during semester:");
        for (int i=0; i<5; i++){
            pazymiai[i]=scan.nextInt();
            suma+=pazymiai[i];
        }
        vidurkis=(suma*1.0)/pazymiai.length*1.0;
        System.out.println(vidurkis);

        if (vidurkis>9){
            System.out.println("Peter will receive 3 candies! Yum!");
        }else if (vidurkis<=9 && vidurkis >=7){
            System.out.println("Peter will receive 2 candies.");
        }else{
            System.out.println("Peter will receive only 1 candy, better luck next time!");
        }
    }
}
