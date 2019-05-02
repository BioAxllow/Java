//7. Šuoliai per virvutę. Kazys ir Onutė tikra komanda: Kazys padeda Onutei ruoštis sporto rungčiai, kurioje Onutė
// šokinėja per virvutę. Ji kartoja šuoliukus m kartų ir pirmuoju bandymu atlieka k1, antruoju – k2, ..., m-tuoju –
// km šuoliukų. Parašykite programą, kuri padėtų Kaziui suskaičiuoti, kiek kartų iš viso Onutė peršoko per virvutę ir
// koks vidutinis vienu bandymu atliktų šuoliukų skaičius.

package _00_Objektinis_Programavimas_2019._00_Uzdaviniai_From_Book._03_Cikliniai_Algoritmai;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SuoliaiPerVirve {
    public static void main(String[] args) {
        Integer suoliuPakrtojimai;
        Integer suolis;
        Integer suma=0;
        Double vid;
        List<Integer> allJumps = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Kiek kartų kartos Onutė šuoliukus? ");
        suoliuPakrtojimai = scanner.nextInt();

        while (suoliuPakrtojimai < 1) {
            System.out.println("please choose a positive Integer");
            suoliuPakrtojimai = scanner.nextInt();
        }

        for (int i = 0; i < suoliuPakrtojimai; i++) {
            System.out.println("Kiek sušokinėjo kartų " + (i + 1) + " bandymu: ");
            suolis=scanner.nextInt();
            while (suolis<0){
                System.out.println("It has to be a positive integer: ");
                suolis=scanner.nextInt();
            }
            allJumps.add(suolis);
        }


        for(Integer ea: allJumps){
            suma+=ea;
        }

        vid=suma*1.0/allJumps.size()*1.0;

        System.out.println("Iš viso: "+suma+";");
        System.out.printf("Vidutiniškai: %.2f",vid);


    }
}
