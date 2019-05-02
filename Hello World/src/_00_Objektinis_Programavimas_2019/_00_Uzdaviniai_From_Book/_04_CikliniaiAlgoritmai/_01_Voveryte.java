//1. Voverytė. Per vasarą voverytė sukaupė X riešutėlių. Prasidėjus žiemai voverytė kartu su savo V voveriukų sugraužia
// pusryčiams, pietums ir vakarienei po vieną riešutą kiekvienas. Apskaičiuokite, kelioms dienoms K voverytei su
// voveriukais užteks sukauptų riešutų. Patikrinkite, ar riešutų užteks visai žiemai, jeigu žiema trunka 92 dienas.

package _00_Objektinis_Programavimas_2019._00_Uzdaviniai_From_Book._04_CikliniaiAlgoritmai;

import java.util.Scanner;

public class _01_Voveryte {
    public static void main(String[] args) {
            Integer sukauptiRiesutai;
            Integer vaikuSk;

        Scanner scanner=new Scanner(System.in);
        System.out.println("Kiek voverė sukaupė riešutų? ");
        sukauptiRiesutai=scanner.nextInt();

        while (sukauptiRiesutai<=0){
            System.out.println("it has to be a positive number: ");
            sukauptiRiesutai=scanner.nextInt();
        }

        System.out.println("Kiek voveriukų turi voverytė? ");
        vaikuSk=scanner.nextInt();

        while (vaikuSk<0){
            System.out.println("It cant be a negative number: ");
            vaikuSk=scanner.nextInt();
        }











    }
}
