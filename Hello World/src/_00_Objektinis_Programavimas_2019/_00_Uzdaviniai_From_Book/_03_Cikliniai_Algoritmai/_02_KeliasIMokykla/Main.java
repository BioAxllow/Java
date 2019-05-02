
//        2. Kelias į mokyklą. Kiekvieną dieną Petriukas, eidamas į mokyklą, skaičiuoja kiekvieną savo žingsnį ir
//        žaidžia tokį žaidimą: kai žingsnių skaičius baigiasi nuliu, Petriukas suploja rankomis, o kai penketu -
//        spragteli pirštais. Parašykite programą, kuri suskaičiuotų, kiek kartų Petriukas suplos rankomis ir kiek –
//        spragtels pirštais, jei jam iki mokyklos yra lygiai n žingsnių.

package _00_Objektinis_Programavimas_2019._00_Uzdaviniai_From_Book._03_Cikliniai_Algoritmai._02_KeliasIMokykla;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Integer steps;
        Integer claps=0;
        Integer clicks=0;

        Scanner scanner=new Scanner(System.in);
        System.out.println("Kiek liko Petriukui žingsnių iki mokyklos?");
        steps=scanner.nextInt();

        while (steps<0){
            System.out.println("Žingsnių skaičius iki mokyklos negali būti neigiamas, try again: ");
            steps=scanner.nextInt();
        }

        for (int i = 1; i <=steps ; i++) {
            if (i%10==0){
                claps++;
            }else if(i%5==0){
                clicks++;
            }
        }

        System.out.println("Suplojimų bus: "+claps+";");
        System.out.println("Spragtelėjimų bus: "+clicks+";");




    }
}
