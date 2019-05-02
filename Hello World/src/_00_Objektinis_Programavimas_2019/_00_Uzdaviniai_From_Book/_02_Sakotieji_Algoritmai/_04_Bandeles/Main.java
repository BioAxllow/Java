//4. Bandelės. Julius, grįžęs iš mokyklos namo, rado tokį mamos raštelį:
//        Nueik į parduotuvę ir nupirk bandelių su varške.
//        Jei viena bandelė kainuos ne daugiau kaip a Lt, nupirk n1 bandelių;
//        Jei daugiau nei a, bet mažiau nei b, nupirk n2 bandelių;
//        O jei kainuos b arba daugiau, negu b - n3 bandelių.
//        Nuėjęs į parduotuvę, Julius pamatė, kad bandelė kainuoja k Lt.
//        Parašykite programą, kuri apskaičiuotų, kiek pinigų už bandeles sumokės Julius.
//        (a visada mažiau nei b).

package _00_Objektinis_Programavimas_2019._00_Uzdaviniai_From_Book._02_Sakotieji_Algoritmai._04_Bandeles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Double kainaMin;
        Double kainaMax;
        Integer bandelesUzMin;
        Integer bandelesTarpPrice;
        Integer bandelesUzMax;
        Double bandelesKaina;
        String check;
        Double busSumoketa;

        Scanner scan=new Scanner(System.in);
        System.out.println("Iveskite kiek kainuos a ir b bandeles? (a<b)");
        kainaMin=scan.nextDouble();
        kainaMax=scan.nextDouble();

        while (kainaMin>kainaMax){
            System.out.println("Minimali kaina negali buti mazesne, nei maksimali, jus notite pakeisti min ar max bandeles kaina? (Type Min or Max):");
            check=scan.next();
            String temp="False";
            if (check.equals("Min") || check.equals("Max")){
                if (check.equals("Min")){
                    System.out.println("Iveskite bandeles Min kaina: ");
                    kainaMin=scan.nextDouble();
                }else{
                    System.out.println("Iveskite bandeles Max kaina: ");
                    kainaMax=scan.nextDouble();
                }
            }else{
                while (!temp.equals("True")){
                    System.out.println("Iveskite ka norite pakeisti Min ar Max?");
                    check=scan.next();
                    if (check.equals("Min")){
                        temp="True";
                    }else if(check.equals("Max")){
                        temp="True";
                    }
                }
                if (check.equals("Min")){
                    System.out.println("Iveskite bandeles Min kaina: ");
                    kainaMin=scan.nextDouble();
                }else{
                    System.out.println("Iveskite bandeles Max kaina: ");
                    kainaMax=scan.nextDouble();
                }
            }
        }

        System.out.println("Kiek bus perkama bandeliu, jei jos kainuos maziau nei: "+kainaMin+"," +
                "arba kainuos tarp "+kainaMin+" ir "+kainaMax+", arba daugiau kaip "+ kainaMax+"?");
        bandelesUzMin=scan.nextInt();
        bandelesTarpPrice=scan.nextInt();
        bandelesUzMax=scan.nextInt();

        while (bandelesUzMin<0 || bandelesTarpPrice<0 || bandelesUzMax<0){
            if (bandelesUzMin<0){
                System.out.println("Bandeliu kiekis negali buti neigiamas, perkamas uz maziau, nei "+kainaMin+" per vieneta, pandykit is naujo: ");
                bandelesUzMin=scan.nextInt();
            }
            if (bandelesTarpPrice<0){
                System.out.println("Bandeliu kiekis negali buti neigiamas, perkamas tuo atveju, kai bandeles kaina yra tarp "+kainaMin+" ir "+kainaMax+"Lt, pandykit is naujo: ");
                bandelesTarpPrice=scan.nextInt();
            }
            if (bandelesUzMax<0){
                System.out.println("Bandeliu kiekis negali buti neigiamas, perkamas tuo atveju, kai bandeles kaina yra didesne nei "+kainaMax+", pandykit is naujo: ");
                bandelesUzMax=scan.nextInt();
            }
        }

        System.out.println("Iveskite bandeles kaina: ");
        bandelesKaina=scan.nextDouble();

        while (bandelesKaina<0){
            System.out.println("kaina negali buti neigiama, bandykite dar karta: ");
            bandelesKaina=scan.nextDouble();
        }

        if (bandelesKaina<=kainaMin){
            busSumoketa=bandelesKaina*bandelesUzMin;
            System.out.printf("Už bandeles bus sumokėta: %.2f Lt.",busSumoketa);
        }else if(bandelesKaina>=kainaMax){
            busSumoketa=bandelesKaina*bandelesUzMax;
            System.out.printf("Už bandeles bus sumokėta: %.2f Lt.",busSumoketa);
        }else{
            busSumoketa=bandelesKaina*bandelesTarpPrice;
            System.out.printf("Už bandeles bus sumokėta: %.2f Lt.",busSumoketa);
        }
    }
}
