//9. Gimtadienis. Tautvydas rengia gimtadienio šventę. Norėdamas pavaišinti svečius, jis iškepė
//        a sausainių. Prasidėjus šventei, jis pastebėjo, kad dar b draugų iškepė lygiai tiek pat sausainių
//        kaip ir jis, ir atsinešė į gimtadienį. Šventėje iš viso dalyvavo c žmonių (įskaitant ir patį
//        jubiliatą). Norėdamas, kad nei vienas neliktų nuskriaustas, Tautvydas sausainius visiems
//        svečiams padalijo po lygiai ir, kadangi šiandien jo gimtadienis, likusius po dalybų nusprendė
//        pasilikti sau. Parašykite programą, kuri apskaičiuotų, po kiek sausainių gavo kiekvienas
//        gimtadienio dalyvis ir kiek papildomai sausainių atiteko Tautvydui.

package _00_Objektinis_Programavimas_2019._00_Uzdaviniai_From_Book._01_Tiesiniai_Algoritmai._009_Gimtadienis_008psl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Integer iskeptiSausainiai;
        Integer draugaiSuSausainiais;
        Integer sventesDalyviuSk;
        Integer sausainiaiKiekvienam;
        Integer allCookies;
        Integer likutis;

        Scanner scan=new Scanner(System.in);

        System.out.println("How many cookies did jubilee bake?");
        iskeptiSausainiai=scan.nextInt();

        System.out.println("How many friends did bring the same amount of cookies as the jubily has baked?");
        draugaiSuSausainiais=scan.nextInt();

        System.out.println("How many guests did participate in the party (including the host)?");
        sventesDalyviuSk=scan.nextInt();

        while (sventesDalyviuSk<draugaiSuSausainiais){
            System.out.println("Could guests left before the party started? I dont think so, try again:");
            sventesDalyviuSk=scan.nextInt();
        }
        allCookies=iskeptiSausainiai*(draugaiSuSausainiais+1);
        sausainiaiKiekvienam=allCookies/sventesDalyviuSk;
        likutis= allCookies-sausainiaiKiekvienam*sventesDalyviuSk;

        System.out.println("All of the party guests received "+sausainiaiKiekvienam+" cookies each!");
        System.out.println("The Jubilee after sharing all of them received an additional batch of cookies that sum up to:" +
                " "+likutis+"! yay!");

    }
}
