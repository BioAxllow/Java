//6. Trapecijos plotas. Parašykite programą, kuri, įvedus trapecijos pagrindų a ir b bei
//        aukštinės h ilgius, apskaičiuotų trapecijos plotą.

package _00_Objektinis_Programavimas_2019._00_Uzdaviniai_From_Book._01_Tiesiniai_Algoritmai._006_Trapecijos_Plotas_007psl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Integer pagrindasIlg;
        Integer pagrindasTr;
        Integer aukstine;
        Double plotas;

        Scanner scan=new Scanner(System.in);

        System.out.println("Whats the length of a longer base?");
        pagrindasIlg=scan.nextInt();

        System.out.println("Whats the length of a shorter base");
        pagrindasTr=scan.nextInt();
        Integer k=0;
        while (pagrindasIlg<=pagrindasTr && k<3){
            System.out.println("ivestas sk turi buti mazesnis nei: "+pagrindasIlg+";");
            pagrindasTr=scan.nextInt();
            k++;
        }

        System.out.println("What is the height of a figure?");
        aukstine=scan.nextInt();

        plotas=(pagrindasIlg+pagrindasTr)/2.0*aukstine;

        System.out.printf("Pltoas: %.2fkv.v.", plotas);

    }
}
