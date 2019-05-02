//10. Mariaus saldainiai. Marius kiekvieną dieną gauna po n saldainių. Jis suvalgo po a
//        saldainių, o likusius kaupia Kalėdų dovanoms. Kai Marius pradėjo kaupti saldainius, iki Kalėdų
//        buvo likę k dienų. Parašykite programą, kuri suskaičiuotų keliems draugams d Marius galės
//        paruošti kalėdinius saldainių rinkinius, jei kiekviename rinkinyje bus po a saldainių ir kiek
//        saldainių s liks supakavus dovanas.

package _00_Objektinis_Programavimas_2019._00_Uzdaviniai_From_Book._01_Tiesiniai_Algoritmai._010_Mariaus_Saldainiai_008psl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Integer getCandy;
        Integer eatCandy;
        Integer daysTillChristmas;
        Integer totalCandies;
        Integer friends;
        Integer leftoverCandiesAfterGift;

        Scanner scan=new Scanner(System.in);

        System.out.println("How many candies does Marius get every day?");
        getCandy=scan.nextInt();

        System.out.println("How many candies does Marius eat each day?");
        eatCandy=scan.nextInt();
        while(eatCandy>getCandy){
            System.out.println("Not possible to eat more candies than you get, try eating less than "+getCandy+" candies.");
            eatCandy=scan.nextInt();
        }

        System.out.println("How many days are left till Christmas?");
        daysTillChristmas=scan.nextInt();
        while(daysTillChristmas>364){
            System.out.println("The amout of days that Marius hoards candies cant overexceed 364 days, try again.");
            daysTillChristmas=scan.nextInt();
        }

        totalCandies=(getCandy-eatCandy)*daysTillChristmas;
        friends=totalCandies/eatCandy;
        leftoverCandiesAfterGift=totalCandies-friends*eatCandy;

        System.out.println("Marius will prepare a gift for: "+friends+" of his friends, giving them "+eatCandy+" candies each.");
        System.out.println("After Marius is done wrapping all of the presents, he will have "+leftoverCandiesAfterGift
                +" unpacked candies left for himself!");

    }
}
