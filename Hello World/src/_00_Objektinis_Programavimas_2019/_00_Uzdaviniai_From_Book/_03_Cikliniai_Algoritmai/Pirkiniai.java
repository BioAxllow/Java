//9. Pirkiniai. Mama liepė Petriukui nupirkti n pirkinių. Kiekvienas pirkinys turi savo kainą (centais) ir svorį
// (gramais). Petriukas gali panešti tik iki 5 kg. Parašykite programą, kuri suskaičiuotų, kiek vidutiniškai kainuoja
// vienas pirkinys, ir ar Petriukas galės parnešti visus pirkinius iš parduotuvės.

package _00_Objektinis_Programavimas_2019._00_Uzdaviniai_From_Book._03_Cikliniai_Algoritmai;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pirkiniai {
    public static void main(String[] args) {
        Integer pirkiniuSk;
        Integer pirkinioKaina;
        Integer pirkinioSvoris;
        List<Integer> pirkiniuKainos = new ArrayList<>();
        List<Integer> pirkiniuSvoriai = new ArrayList<>();
        Double vidKaina;
        Integer kainaLt;
        Integer kainaCnt;
        Integer kainuSuma = 0;
        Integer svoriuSuma=0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Kiek buvo pirkinių? ");
        pirkiniuSk = scanner.nextInt();

        while (pirkiniuSk <= 0) {
            System.out.println("It has to be a positive integer: ");
            pirkiniuSk = scanner.nextInt();
        }

        for (int i = 0; i < pirkiniuSk; i++) {

            System.out.println("Kiek kainavo ir kiek svėrė " + (i + 1) + " prekė: ");
            pirkinioKaina = scanner.nextInt();
            pirkinioSvoris = scanner.nextInt();

            while (pirkinioKaina <= 0 || pirkinioSvoris <= 0) {
                if (pirkinioKaina <= 0) {
                    System.out.println("Price has to be a positive integer (centai): ");
                    pirkinioKaina = scanner.nextInt();
                }
                if (pirkinioSvoris <= 0) {
                    System.out.println("Weight has to be a positive number (grams): ");
                    pirkinioSvoris = scanner.nextInt();
                }
            }

            pirkiniuKainos.add(pirkinioKaina);
            pirkiniuSvoriai.add(pirkinioSvoris);
        }

        for (Integer ea : pirkiniuKainos) {
            kainuSuma += ea;
        }

        vidKaina = kainuSuma * 1.0 / pirkiniuKainos.size() * 1.0;
        kainaLt=(Integer)vidKaina.intValue()/100;
        kainaCnt=(Integer)vidKaina.intValue()-kainaLt*100;

        for (Integer ea: pirkiniuSvoriai) {
            svoriuSuma+=ea;
            if (svoriuSuma>5000){
               break;
            }
        }

        System.out.println("Pirkinio vidutinė kaina: "+kainaLt+"Lt "+kainaCnt+"ct;");
        if (svoriuSuma>5000){
            System.out.println("Petriukas negalės parnešti pirkinių.");
        }else {
            System.out.println("Petriukas galės parnešti pirkinių.");
        }

    }
}
