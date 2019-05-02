//4. Kalėdinės eglutės. Prieš Kalėdas miško urėdijos prekiauja įvairaus aukščio eglutėmis. Į prekybos vietą atvežta
// n eglučių. Jų aukščiai yra e1, e2, …, en. Parašykite programą, skaičiuojančią vidutinį eglutės aukštį.

package _00_Objektinis_Programavimas_2019._00_Uzdaviniai_From_Book._03_Cikliniai_Algoritmai;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KaledinesEglutes {
    public static void main(String[] args) {
        Integer egluciuSk;
        Integer eglutesAukstis;
        Double eglutesVid;
        List<Integer> eglutesAuksciai=new ArrayList<>();

        Scanner scanner=new Scanner(System.in);

        System.out.println("Kiek eglučių atvežta?");
        egluciuSk=scanner.nextInt();

        while (egluciuSk<0){
            System.out.println("Its has to be a positive number, try again: ");
            egluciuSk=scanner.nextInt();
        }

        for (int i=0; i<egluciuSk; i++){
            System.out.println("Įveskite "+(i+1)+"-osios eglutės aukštį:");
            eglutesAukstis=scanner.nextInt();
            eglutesAuksciai.add(eglutesAukstis);
        }
        Integer sum=0;
        for (int j=0; j<eglutesAuksciai.size(); j++){
         sum+=eglutesAuksciai.get(j);
        }
        eglutesVid=sum*1.0/eglutesAuksciai.size()*1.0;
        System.out.println("Eglutės aukščio vidurkis yra: "+eglutesVid+";");


    }



}
