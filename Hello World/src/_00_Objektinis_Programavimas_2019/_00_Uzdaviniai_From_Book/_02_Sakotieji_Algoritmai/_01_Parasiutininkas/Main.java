//1. Parašiutininkas. Parašiutininkas šoka iš h metrų aukščio. Vos iššokęs, iškart pradeda skleisti
//        parašiutą, kuris iki galo išsiskleidžia per t sekundžių. Parašykite programą, kuri apskaičiuotų, ar
//        parašiutas spės išsiskleisti prieš parašiutininkui pasiekiant žemę. Laikas, per kurį objektas
//        nukrenta iš aukščio h randamas pagal formulę: t = sqrt(2h/g). Čia g - laisvojo kritimo pagreitis, kuris
//        yra lygus 9.8 m/s^2.

package _00_Objektinis_Programavimas_2019._00_Uzdaviniai_From_Book._02_Sakotieji_Algoritmai._01_Parasiutininkas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Double height;
        Double parachuteDeployTime;
        Double timeTillCollision;
        Double freeFall=9.8; //m/s^2;

        Scanner scan=new Scanner(System.in);

        System.out.println("At what height (m) the man will start to descent?");
        height=scan.nextDouble();
        while(height<=0){
            System.out.println("Please input height above 100m or so: ");
            height=scan.nextDouble();
        }

        System.out.println("How long will it take for the parachute to deploy?");
        parachuteDeployTime=scan.nextDouble();
        while (parachuteDeployTime<0){
            System.out.println("Parachute deployment time has to be a possitive number! try again!");
            parachuteDeployTime=scan.nextDouble();
        }

        timeTillCollision=Math.sqrt(2*height/freeFall);

        if (timeTillCollision<=parachuteDeployTime){
            System.out.printf("You will fall for: %.2fs, and your parachute wont deploy in " +
                    "time for you to survive :/",timeTillCollision);
        }else{
            System.out.printf("Your parachute will deploy and you will have %.2f s to slow down before the impact!",(timeTillCollision-parachuteDeployTime));
        }

    }
}
