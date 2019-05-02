//6. Žiemojantys paukščiai. Gamtininkas registruoja likusius žiemoti paukščius. Jo tikslas yra nustatyti, kurios iš
//        trijų paukščių rūšių atstovų liko žiemoti daugiausia. Klaviatūra įvedami trijų paukščių rūšių kiekiai,
//        parašykite programą, kuri surikiuotų juos iš eilės nuo didžiausio iki mažiausio ir apskaičiuotų, kiek skiriasi
//        didžiausias ir mažiausias kiekiai.

package _00_Objektinis_Programavimas_2019._00_Uzdaviniai_From_Book._02_Sakotieji_Algoritmai._06_ZiemojantysPauksciai;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Integer[] birds = new Integer[0];
        Integer[] maxBirds;
        Integer[] minBirds;
        Integer speciesAmount;

        Scanner scan = new Scanner(System.in);

        System.out.println("How many species do you want to observe?");
        speciesAmount = scan.nextInt();
        while (speciesAmount < 2) {
            System.out.println("Species!!! plural, try again: (hint: it has to be more that 1!)");
            speciesAmount = scan.nextInt();
        }

        int i = 0;
        while (birds.length < speciesAmount) {
            i++;
            System.out.println("Įveskite " + i + "-osios paukščių rūšies paukščių kiekį likusį žiemoti:");
            Integer temp = scan.nextInt();
            while (temp < 1) {
                System.out.println("Paukščių kiekis, kuris liko žiemoti negali būti neigiamas! try again:");
                temp = scan.nextInt();
            }
            birds = addBirds(birds, temp);
        }

        maxBirds = getMax(birds);
        minBirds = getMin(birds);

        if (birds[maxBirds[0]] == birds[minBirds[0]]) {
            System.out.println("Visų rūšių paukščių žiemoti liko po tiek pat, t.y. po "+birds[maxBirds[0]]+";");
        } else {
            if (maxBirds.length == 1) {
                System.out.println("Daugiausiai liko " + (maxBirds[0] + 1) + "-osios rūšies paukščių, žiemoti liko " + birds[maxBirds[0]] + ";");
                if (minBirds.length == 1) {
                    System.out.println("Mažiausiai žiemoti liko " + (minBirds[0] + 1) + "-osios rūšies paukščių, tik " + birds[minBirds[0]] + ";");
                } else {
                    System.out.println("Mažiausiai žiemoti liko " + getBirdString(minBirds) + " rūšies paukščių, tik po " + birds[minBirds[0]] + ";");
                }
            } else {
                System.out.println("Daugiausiai žiemoti liko " + getBirdString(maxBirds) + " rūšies paukščių, jų liko po " + birds[maxBirds[0]] + ";");
                if (minBirds.length == 1) {
                    System.out.println("Mažiausiai žiemoti liko " + (minBirds[0] + 1) + "-osios rūšies paukščių, tik " + birds[minBirds[0]] + ";");
                } else {
                    System.out.println("Mažiausiai žiemoti liko " + getBirdString(minBirds) + " rūšies paukščių, tik po " + birds[minBirds[0]] + ";");
                }
            }

            Integer skirtumas= birds[maxBirds[0]]-birds[minBirds[0]];
            System.out.println("Skirtumas tarp didžiausio ir mažiausio kiekio: "+skirtumas+";");
            Integer[] sortedBirds = sortBirds(birds);
            for (int j = 0; j < sortedBirds.length; j++) {
                System.out.println(sortedBirds[j] + ";");
            }
        }


    }

    public static Integer[] addBirds(Integer[] birds, Integer flock) {
        birds = Arrays.copyOf(birds, birds.length + 1);
        birds[birds.length - 1] = flock;
        return birds;
    }

    public static Integer[] getMax(Integer[] birds) {
        Integer[] maxBirds = new Integer[0];
        Integer max = 0;
        for (int i = 0; i < birds.length; i++) {
            if (max <= birds[i]) {
                if (max < birds[i]) {
                    max = birds[i];
                    maxBirds = new Integer[1];
                    maxBirds[0] = i;
                } else {
                    maxBirds = addBirds(maxBirds, i);
                }
            }
        }
        return maxBirds;
    }

    public static Integer[] getMin(Integer[] birds) {
        Integer[] minBirds = new Integer[0];
        Integer min = 9999;
        for (int i = 0; i < birds.length; i++) {
            if (birds[i] <= min) {
                if (birds[i] < min) {
                    min = birds[i];
                    minBirds = new Integer[1];
                    minBirds[0] = i;
                } else {
                    minBirds = addBirds(minBirds, i);
                }
            }
        }
        return minBirds;
    }

    public static String getBirdString(Integer[] birds) {
        String birdys = "";
        String end = ", ";
        for (int i = 0; i < birds.length; i++) {
            if (i == birds.length - 1) {
                if (i < 3) {
                    end = "-osios";
                } else {
                    end = "-čiosios ";
                }
            }
            birdys += (birds[i] + 1) + end;
        }
        return birdys;
    }

    public static Integer[] sortBirds(Integer[] birds) {
        Integer temp;
        for (int i = 0; i < birds.length; i++) {
            for (int j = 0; j < birds.length; j++) {
                if (birds[i] > birds[j]) {
                    temp = birds[j];
                    birds[j] = birds[i];
                    birds[i] = temp;
                }
            }
        }
        return birds;
    }
}
