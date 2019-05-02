package _00_Objektinis_Programavimas_2019.Classes;

import java.io.*;
import java.util.Arrays;

public class Return {
    public static void main(String[] args) {


        String file = "C:\\Users\\bioax_000\\IdeaProjects\\Hello World\\src\\Masyvai\\Duomenys.txt";
        String atsakymai = "C:\\Users\\bioax_000\\IdeaProjects\\Hello World\\src\\Masyvai\\Rezultatai.txt";
        try {
            String skaiciaiString = Skaityti(file);
            String[] skaiciuMasyvasString = skaiciaiString.split(" ");
            Integer[] skaiciuMasyvas = GautiSkaiciuMasyva(skaiciuMasyvasString);

            Double sum = suma(1.0, 2.0);
            Double vid = vidurkis(skaiciuMasyvas);
            Integer mini=minimumas(skaiciuMasyvas);

            rasyti(atsakymai, skaiciuMasyvas, sum, vid, mini);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static String Skaityti(String failas) throws IOException {
        String visosEilutes = "";
        BufferedReader br = new BufferedReader(new FileReader(failas));
        try {
            String line = br.readLine();
            while (line != null) {
                visosEilutes += line + " ";
                line = br.readLine();
            }

        } catch (FileNotFoundException ex) {
            System.out.println("Failas nerastas");
        } finally {
            br.close();
        }

        return visosEilutes;
    }

    public static Integer[] GautiSkaiciuMasyva(String[] skaiciai) {
        Integer[] skaiciuMasyvas = new Integer[skaiciai.length];
        for (int i = 0; i < skaiciai.length; i++) {
            skaiciuMasyvas[i] = Integer.parseInt(skaiciai[i]);
        }
        return skaiciuMasyvas;
    }


    public static void rasyti(String failas, Integer[] masyvas, Double suma, Double vid, Integer mini) throws IOException {
        BufferedWriter output = null;
        try {
            output = new BufferedWriter(new FileWriter(failas));
//            output.write("Nuskaitytu skaiciu vidurkis = " + String.format("%.2f", vidurkis) + "\n");
            output.write("---------------1 uzduotis---------------\n");
            for (int i = 0; i < masyvas.length; i++) {
                output.write(masyvas[i] + " ");
            }
            output.write("\n---------------2 uzduotis---------------\n");
            output.write("suma: " + suma.toString() + "\n");
            output.write("---------------3 uzduotis---------------\n");
            for (int i = 0; i < masyvas.length; i++) {
                if (arLyginis(masyvas[i])) {
                    output.write(masyvas[i] + " skaicius lyginis\n");
                } else {
                    output.write(masyvas[i] + " skaicius nelyginis\n");
                }

            }
            output.write("\n---------------4 uzduotis---------------\n");
            output.write(vid.toString());
            output.write("\nskaiciu vidurkis yra: "+vid+";(be .toString);");
            output.write("\n---------------5 uzduotis---------------\n");
            output.write("minimalus sk yra: "+mini+";");
            output.write("\n---------------5 uzduotis---------------\n");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (output != null) {
                output.close();
            }
        }
    }

    public static Double suma(Double a, Double b) {
        return a + b;
    }

    public static boolean arLyginis(Integer skaicius) {
        if (skaicius % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static Double vidurkis(Integer[] masyvas) {
        Double suma = 0.0;
        for (int i = 0; i < masyvas.length; i++) {
            suma += masyvas[i];
        }
        return (double) suma / masyvas.length;
    }

    public static Integer minimumas(Integer[] masyvas){
        Integer min=9999;
        for (int i=0; i<masyvas.length; i++){
            if (min>masyvas[i]){
                min=masyvas[i];
            }
        }
        return min;
    }

    public static Integer[] pridetiElementa(Integer[] masyvas, Integer skaicius) {
        masyvas = Arrays.copyOf(masyvas, masyvas.length + 1);
        masyvas[masyvas.length - 1] = skaicius;
        return masyvas;
    }
    public static Integer[] grazintiMasyva(Integer[] masyvas){
        Integer[] tmp= new Integer[0];
        for (int i=0; i<masyvas.length; i++){
            if (masyvas[i]<10){
                tmp=pridetiElementa(tmp,masyvas[i]);
            }

        }
        return tmp;
    }
}

