//8. Keltas. Parašykite programą, kuri suskaičiuotų, kelis kartus keltui teks kelti per upę k automobilių,
//        jeigu vienu metu jis gali perkelti m automobilių. Keltas kelia tik tada, kai yra pilnas
//        (susidaro m automobilių.) Taip pat išveskite automobilių skaičių, kuriems persikelti per upę nepavyks
//        (jei buvo 11 automobilių, o į keltą telpa 10, tai 10 perkels, o vienas liks neperkeltas).

package _00_Objektinis_Programavimas_2019._00_Uzdaviniai_From_Book._01_Tiesiniai_Algoritmai._008_Keltas_007psl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Integer autSk;
        Integer keltoTalpa;
        Integer kiekKartu;
        Integer likutis;

        Scanner scan=new Scanner(System.in);

        System.out.println("How many cars are waiting for the ferry?");
        autSk=scan.nextInt();

        System.out.println("How many cars can you load on a ferry?");
        keltoTalpa=scan.nextInt();

        kiekKartu=autSk/keltoTalpa;
        likutis=autSk-kiekKartu*keltoTalpa;

        System.out.println("The ferry will transport cars: "+kiekKartu+" times;");
        System.out.println("Amount of cars that wont be picked up: "+likutis+";");
    }
}
