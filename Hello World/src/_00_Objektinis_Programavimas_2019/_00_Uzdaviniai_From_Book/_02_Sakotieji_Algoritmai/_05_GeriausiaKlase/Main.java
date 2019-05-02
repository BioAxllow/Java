//5. Geriausia klasė. Giraitės mokykloje yra keturios dešimtos klasės: a, b, c ir d. Direktorius atlieka analizę, nori
//        surasti geriausiai besimokančią dešimtokų klasę, pasižiūrėti, keliais balais kiekvienos kitos klasės vidurkis
//        yra mažesnis už geriausiai besimokančios klasės vidurkį.
//        Parašykite programą, kuri surastų, koks yra didžiausias vidurkis ir keliais balais skiriasi likusių klasių
//        vidurkiai nuo geriausiai besimokančios klasės vidurkio.

package _00_Objektinis_Programavimas_2019._00_Uzdaviniai_From_Book._02_Sakotieji_Algoritmai._05_GeriausiaKlase;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Double classA;
        Double classB;
        Double classC;
        Double classD;
        Double[] vidurkiai = new Double[0];

        Scanner scan = new Scanner(System.in);
        System.out.println("Iveskite klasiu A, B, C, D vidurkius: ");
        classA = scan.nextDouble();
        while (classA > 10 || classA <= 0) {
            System.out.println("Klases vidurkis negali būti mažesnis, nei 0 ar didesnis, nei 10, įveskite iš naujo: ");
            classA = scan.nextDouble();
        }
        vidurkiai = pridetiDouble(vidurkiai, classA);
        classB = scan.nextDouble();
        while (classB > 10 || classB <= 0) {
            System.out.println("Klases vidurkis negali būti mažesnis, nei 0 ar didesnis, nei 10, įveskite iš naujo: ");
            classB = scan.nextDouble();
        }
        vidurkiai = pridetiDouble(vidurkiai, classB);

        classC = scan.nextDouble();
        while (classC > 10 || classC <= 0) {
            System.out.println("Klases vidurkis negali būti mažesnis, nei 0 ar didesnis, nei 10, įveskite iš naujo: ");
            classC = scan.nextDouble();
        }
        vidurkiai = pridetiDouble(vidurkiai, classC);

        classD = scan.nextDouble();
        while (classD > 10 || classD <= 0) {
            System.out.println("Klases vidurkis negali būti mažesnis, nei 0 ar didesnis, nei 10, įveskite iš naujo: ");
            classD = scan.nextDouble();
        }
        vidurkiai = pridetiDouble(vidurkiai, classD);

        Integer[] bestVid = getMaxVid(vidurkiai);

        if (bestVid.length == 1) {

            String klase = getKlasesName(bestVid[0]);

            System.out.println("Didžiausias vidurkis yra klasės " + klase + ", ir jis yra: " + vidurkiai[bestVid[0]] + ";");

            String vidDiff = getKlasiuVidDiffString(bestVid, vidurkiai);

            System.out.println("Kitų klasių vidurkiai skiriasi: " + vidDiff);

        } else {
            String classNameString = "";
            for (int i = 0; i < bestVid.length; i++) {
                classNameString += getKlasesName(bestVid[i]) + "; ";
            }
            System.out.println("Kelių klasių vidrukiai yra vienodai puikūs!: " + classNameString + "ir jis yra " + vidurkiai[bestVid[0]]);

            if (bestVid.length < vidurkiai.length) {
                String vidurDiff = "";
                for (int i = 0; i < vidurkiai.length; i++) {
                    if (vidurkiai[i] < vidurkiai[bestVid[0]]) {
                        Double temp = vidurkiai[bestVid[0]] - vidurkiai[i];
                        vidurDiff += temp + "; ";
                    }
                }
                System.out.println("Kitų klasių vidurkiai skiriasi: " + vidurDiff + ";");
            }
        }
    }

    public static Double[] pridetiDouble(Double[] masyvas, Double vid) {
        masyvas = Arrays.copyOf(masyvas, masyvas.length + 1);
        masyvas[masyvas.length - 1] = vid;
        return masyvas;
    }

    public static Integer[] pridetiInteger(Integer[] masyvas, Integer location) {
        masyvas = Arrays.copyOf(masyvas, masyvas.length + 1);
        masyvas[masyvas.length - 1] = location;
        return masyvas;
    }

    public static Integer[] getMaxVid(Double[] vidurkiai) {
        Integer[] allBest = new Integer[0];
        Double best = 0.0;
        for (int i = 0; i < vidurkiai.length; i++) {
            if (vidurkiai[i] >= best) {
                if (vidurkiai[i] > best) {
                    best = vidurkiai[i];
                    allBest = new Integer[1];
                    allBest[0] = i;
                } else {
                    allBest = pridetiInteger(allBest, i);
                }
            }
        }
        return allBest;
    }

    public static String getKlasesName(Integer i) {
        String klase;
        if (i == 0) {
            klase = "A";
        } else if (i == 1) {
            klase = "B";
        } else if (i == 2) {
            klase = "C";
        } else {
            klase = "D";
        }
        return klase;
    }

    public static String getKlasiuVidDiffString(Integer[] bestVid, Double[] vidurkiai) {
        String vidDiff = "";
        for (int i = 0; i < vidurkiai.length; i++) {
            Double tempDiff;
            if (i != bestVid[0]) {
                tempDiff = vidurkiai[bestVid[0]] - vidurkiai[i];
                vidDiff += " " + tempDiff + ";";
            }
        }
        return vidDiff;
    }
}
