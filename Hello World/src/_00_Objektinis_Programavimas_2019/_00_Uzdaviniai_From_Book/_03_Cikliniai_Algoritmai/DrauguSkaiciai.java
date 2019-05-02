//5. Draugų skaičiai. 10 draugų sugalvojo po vieną skaičių iki 100 ir juos užrašė ant kortelių. Parašykite programą,
// surandančią keli draugai sugalvojo lyginius skaičius. Jeigu tokių skaičių bus, ekrane turi būti rodomas jų kiekis,
// priešingu atveju ekrane turi būti rodomas žodis Nėra.

package _00_Objektinis_Programavimas_2019._00_Uzdaviniai_From_Book._03_Cikliniai_Algoritmai;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DrauguSkaiciai {
    public static void main(String[] args) {
        Integer skaicius;
        Integer kiekis=0;
        List<Integer> skaiciai=new ArrayList<>();

        Scanner scanner=new Scanner(System.in);
        System.out.println("Įveskite draugų sugalvotus skaičius: ");
        for (int i=0; i<10; i++){
            System.out.println((i+1)+"-ąjį: ");
            skaicius=scanner.nextInt();
            while (skaicius<0 || skaicius>100){
                System.out.println("Išsirinkite skaičių ("+(i+1)+"-ąjį) esantį intervale (0;100]: ");
                skaicius=scanner.nextInt();
            }
            skaiciai.add(skaicius);
        }

        for (Integer skaic: skaiciai) {
            if (skaic%2==0){
                kiekis++;
            }
        }
        if (kiekis==0){
            System.out.println("Atsakymas: Nėra;");
        }else {
            System.out.println("Atsakymas: "+kiekis+";");
        }


    }
}
