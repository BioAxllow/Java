//6. Kauliukai. Tomas dalyvauja loterijoje. Jis meta n standartinių lošimo kauliukų (ant jų sienelių skaičiai nuo 1
// iki 6). Kiekvieno skaičiaus iškritimo tikimybė yra vienoda. Loterija laimima tada, jei Tomo išridentų skaičių suma
// yra didesnė nei pusė visos galimos taškų sumos. Parašykite programą, kuri nustatytų:
//         koks maksimalus taškų kiekis;
//         kiek iš viso taškų surinko Tomas;
//         koks jo surinktų taškų vidurkis
//         ar berniukas laimėjo loterijoje.
//        Pradiniai duomenys – kauliukų kiekis n ir išridentas kiekvieno kauliuko skaičius.

package _00_Objektinis_Programavimas_2019._00_Uzdaviniai_From_Book._03_Cikliniai_Algoritmai;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kauliukai {
    public static void main(String[] args) {
        Integer kauliukuKiekis;
        List<Integer> skaiciai= new ArrayList<>();
        Integer skaicius;
        Integer sumaVisu=0;
        Double sumVid;

        Scanner scanner= new Scanner(System.in);
        System.out.println("Kiek mesite kauliukų?");
        kauliukuKiekis=scanner.nextInt();

        while (kauliukuKiekis<1 || kauliukuKiekis>20){
            System.out.println("Pasirinkite realų metamų kauliukų skaičių (nuo 0 iki 20): ");
            kauliukuKiekis=scanner.nextInt();
        }

        for (int i=0; i<kauliukuKiekis; i++){
            System.out.println((i+1)+"-o kauliuko taškų kiekis: ");
            skaicius=scanner.nextInt();
            while (skaicius<1 || skaicius>6){
                System.out.println("Kauliukas gali įgyti reikšmes tik nuo 1 iki 6: ");
                skaicius=scanner.nextInt();
            }
            skaiciai.add(skaicius);
        }

        for (Integer skai: skaiciai) {
            sumaVisu+=skai;
        }

        sumVid=sumaVisu*1.0/skaiciai.size()*1.0;

        System.out.println("Iš viso buvo galima surinkti taškų: "+(kauliukuKiekis*6)+";");
        System.out.println("Tomas iš viso surinko: "+sumaVisu+" taškų;");
        System.out.printf("Jo taškų vidurkis: %.2f;\n",sumVid);

        if (sumaVisu>(kauliukuKiekis*6)/2){
            System.out.println("Loterija laimėta;");
        }else {
            System.out.println("Loterija pralaimėta;");
        }

    }
}
