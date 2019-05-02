//1. Konkursas. Restorano ,,Skanu" vadybininkas sugalvojo surengti konkursą lankytojams, kurio metu galima laimėti
// marškinėlius su restorano logotipu. Visi lankytojai kartu su sąskaita gauna po vieną kortelę, ant kurios parašytas
// sveikasis teigiamas skaičius iš intervalo [a;b] (a – intervalo pradžia, b – intervalo pabaiga). Laimi tie lankytojai,
// kurių kortelėse įrašytas skaičius dalijasi iš 6. Parašykite programą, kuri apskaičiuotų, kiek marškinėlių reikia
// užsakyti restorano vadybininkui.

package _00_Objektinis_Programavimas_2019._00_Uzdaviniai_From_Book._03_Cikliniai_Algoritmai._01_Konkursas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Integer intStart;
        Integer intEnd;
        Integer lucky;
        Integer Tshirts=0;

        Scanner scanner=new Scanner(System.in);
        System.out.println("Įveskite intervalo pradžios reikšmę: ");
        intStart=scanner.nextInt();
        while (intStart<0){
            System.out.println("Intervalo pradžia negali būti mažesnė, nei 0, try agaiin: ");
            intStart=scanner.nextInt();
        }

        System.out.println("Įveskite intervalo pabaigos reikšmę: ");
        intEnd=scanner.nextInt();
        while (intEnd<=intStart){
            System.out.println("Intervalo pabaigos reikšmė, privalo būti didesnė, nei pradžios: ");
            intEnd=scanner.nextInt();
        }

        System.out.println("Kas kelinta kortelė yra laiminga?");
        lucky=scanner.nextInt();
        while (lucky<0){
            System.out.println("It has to be a positive number, try again: ");
            lucky=scanner.nextInt();
        }

        for (int i=intStart; i<=intEnd; i++){
            if (i%lucky==0){
                Tshirts++;
            }
        }

        System.out.println("Reikalingų marškinėlių skaičius: "+Tshirts+";");
    }
}
