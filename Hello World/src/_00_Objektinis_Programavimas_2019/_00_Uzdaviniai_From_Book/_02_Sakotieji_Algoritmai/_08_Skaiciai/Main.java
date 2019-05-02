//8. Skaičiai. Per matematikos pamoką teko nustatyti, kurie iš duotųjų teigiamų skaičių a, b ir c yra skaičiaus trys
//          kartotiniai. Jei yra keli, reikia išvesti pirmą rastą, jeigu nėra nei vieno, reikia išvesti - nėra.
//          Parašykite programą, sprendžiančią šį uždavinį.

package _00_Objektinis_Programavimas_2019._00_Uzdaviniai_From_Book._02_Sakotieji_Algoritmai._08_Skaiciai;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Integer pirmasSK;
        Integer antrasSK;
        Integer treciasSK;

        Scanner scan=new Scanner(System.in);
        System.out.println("Type in 3 numbers: ");
        pirmasSK=scan.nextInt();
        antrasSK=scan.nextInt();
        treciasSK=scan.nextInt();

        if (pirmasSK%3==0){
            System.out.println("Atsakymas: "+pirmasSK+";");
        }else if(antrasSK%3==0){
            System.out.println("Atsakymas: "+antrasSK+";");
        }else if(treciasSK%3==0){
            System.out.println("Atsakymas: "+treciasSK+";");
        }else {
            System.out.println("Atsakymas: nėra;");
        }

    }


}
