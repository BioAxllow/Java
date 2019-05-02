//3. Snaigės už lango. Per atostogas Simas turėjo daugiau laisvo laiko ir nutarė suskaičiuoti, kiek sningant po jo
// namo langu nukrenta snaigių. Jis pastebėjo, kad kiekvieną kitą sekundę nukrenta dvigubai daugiau snaigių, nei prieš
// tai buvusią. Parašykite programą, skaičiuojančią kiek snaigių s bus nukritę per n sekundžių, kai per pirmąją
// sekundę nukrito k snaigių.

package _00_Objektinis_Programavimas_2019._00_Uzdaviniai_From_Book._03_Cikliniai_Algoritmai._03_SnaigesUzLango;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Integer seconds;
        Integer amount;
        Integer totalAmount=0;

        Scanner scanner=new Scanner(System.in);

        System.out.println("Kiek sekundžių stebėsite snaiges?");
        seconds=scanner.nextInt();
        while (seconds<1){
            System.out.println("Skirkite stebėjimui daugiau laiko: ");
            seconds=scanner.nextInt();
        }

        System.out.println("Kiek snaigių nukrito per pirmą sekundę? ");
        amount=scanner.nextInt();
        while (amount<0){
            System.out.println("Snaigių kiekis negali būti neigiamas, try again: ");
            amount=scanner.nextInt();
        }
        totalAmount=amount;
        for (int i=1; i< seconds; i++){
            amount*=2;
            totalAmount+=amount;
        }

        System.out.println("Per "+seconds+" sekundes iškris "+totalAmount+" snaigės;");

    }
}
