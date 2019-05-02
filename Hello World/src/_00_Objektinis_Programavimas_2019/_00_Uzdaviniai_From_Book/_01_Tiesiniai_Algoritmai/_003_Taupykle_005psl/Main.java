//3. Taupyklė. Jonas turi kiaulę taupyklę, kurioje yra a monetų po 5 ct, b monetų po 20 ct ir c monetų po 2 Lt.
//        Kitokios vertės monetų taupyklėje nėra. Parašykite programą, kuri suskaičiuotų, kiek pinigų kiaulėje
//        taupyklėje iš viso turi Jonas. Atsakymą pateikite litais, pvz.: kai taupyklėje yra 12 monetų po 5 ct,
//        5 monetos po 20 ct ir 6 monetos po 2 Lt, tuomet ekrane turi būti rodoma: Taupyklėje yra 13.60 Lt.

package _00_Objektinis_Programavimas_2019._00_Uzdaviniai_From_Book._01_Tiesiniai_Algoritmai._003_Taupykle_005psl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Integer centai5;
        Integer centai20;
        Integer litai2;
        Double litaiAll;

        Scanner scan=new Scanner(System.in);
        System.out.println("Kiek yra monetų po 5 centus?");
        centai5=scan.nextInt();

        System.out.println("Kiek yra monetų po 20 centų?");
        centai20=scan.nextInt();

        System.out.println("Kiek yra monetų po 2 litus? ");
        litai2=scan.nextInt();

        litaiAll=(5*centai5+20*centai20+200*litai2)/100.0;
        System.out.printf("Taupyklėje yra: %.2f",litaiAll);
    }
}
