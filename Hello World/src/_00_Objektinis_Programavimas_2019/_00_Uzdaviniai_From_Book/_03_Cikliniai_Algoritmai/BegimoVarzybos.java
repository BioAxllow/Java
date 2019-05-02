//8. Bėgimo varžybos. Varžybose dalyvauja n bėgikų. Pirmasis bėgikas įveikė distanciją per k1 sekundžių,
// antrasis – per k2, ..., n-tasis – per kn. Parašykite programą, surandančią, kuris bėgikas įveikė distanciją
// greičiausiai (išspausdinti bėgiko laiką) ir keliomis sekundėmis jis buvo greitesnis už vidutiniškai bėgusį bėgiką.

package _00_Objektinis_Programavimas_2019._00_Uzdaviniai_From_Book._03_Cikliniai_Algoritmai;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BegimoVarzybos {
    public static void main(String[] args) {
        Integer begikuSk;
        List<Integer> begikai=new ArrayList<>();
        Integer greiciausias=9999;
        Integer sumaLaiku=0;
        Double vidLaikas;
        Integer begikoLaikas;

        Scanner scanner=new Scanner(System.in);
        System.out.println("Kiek dalyvaus bėgikų? ");
        begikuSk=scanner.nextInt();

        while (begikuSk <= 0){
            System.out.println("Integer has to be a positive number: ");
            begikuSk=scanner.nextInt();
        }

        for (int i=0; i<begikuSk; i++){
            System.out.println("Įveskite "+(i+1)+"-ojo bėgiko laiką(s): ");
            begikoLaikas=scanner.nextInt();
            while (begikoLaikas<=0){
                System.out.println("It has to be a positive number: ");
                begikoLaikas=scanner.nextInt();
            }
            if (greiciausias>begikoLaikas){
                greiciausias=begikoLaikas;
            }
            sumaLaiku+=begikoLaikas;
            begikai.add(begikoLaikas);
        }

        vidLaikas=sumaLaiku*1.0/begikai.size()*1.0;

        System.out.println("Greičiausio bėgiko laikas: "+greiciausias+"sek.");
        System.out.printf("Jis buvo %.2f sek geresnis už vidurkį.",(vidLaikas-greiciausias));


    }
}
