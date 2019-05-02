//2. Didžioji kūdrinė varlė. Didžioji kūdrinė varlė – beuodegis varliagyvis.
//        Ji sveria m gramų (m - realusis skaičius). Mokslininkai, tyrinėjantys didžiąsias kūdrines
//        varles, nusprendė n varlių stebėti. Jei stebimos varlės svers daugiau kaip 5 kilogramus,
//        ekrane turi būti rodomas pranešimas ,,Varlių stebėjimui pakanka“, jei mažiau – ,,Varlių
//        stebėjimui per mažai“.

package _00_Objektinis_Programavimas_2019._00_Uzdaviniai_From_Book._02_Sakotieji_Algoritmai._02_Kudrine_Varle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Double varlesSvoris;
        Double varliuKiekis;

        Scanner scan=new Scanner(System.in);

        System.out.println("Kiek norima stebėti varlių?");
        varliuKiekis=scan.nextDouble();

        while(varliuKiekis<0){
            System.out.println("Stebejimui reikia bent vienos varlės!");
            varliuKiekis=scan.nextDouble();
        }

        System.out.println("Kiek sveria viena varlė (g)?");
        varlesSvoris=scan.nextDouble();

        while (varlesSvoris<0){
            System.out.println("Jokia varlė negali tiek mažai sverti! Sverkite per naują! ^^");
            varlesSvoris=scan.nextDouble();
        }

        if (varliuKiekis*varlesSvoris>5000){
            System.out.println("Varlių stebėjimui pakanka.");
        }else{
            System.out.println("Varlių stebėjimui nepakanka.");
        }

    }
}
