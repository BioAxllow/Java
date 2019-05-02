package _00_Objektinis_Programavimas_2019.KD;

import java.io.*;
import java.util.Arrays;

public class ClassWork {

    public static void main(String[] args) {


        String file = "C:\\Users\\bioax_000\\IdeaProjects\\Hello World\\src\\KD\\Data1.txt";
        String file2 = "C:\\Users\\bioax_000\\IdeaProjects\\Hello World\\src\\KD\\Data2.txt";
        String atsakymai = "C:\\Users\\bioax_000\\IdeaProjects\\Hello World\\src\\KD\\Rezultatai.txt";
        try {
            String skaiciaiString = Skaityti(file);
            String skaiciaiString2 = Skaityti(file2);

            String[] skaiciuMasyvasString = skaiciaiString.split(" ");
            String[] skaiciuMasyvasString2 = skaiciaiString2.split(" ");

            Integer[] skaiciuMasyvas = GautiSkaiciuMasyva(skaiciuMasyvasString);
            Integer[] skaiciuMasyvas2 = GautiSkaiciuMasyva(skaiciuMasyvasString2);

            Double vid = vidurkis(skaiciuMasyvas);
            Double vid2 = vidurkis(skaiciuMasyvas2);
            Double maxVid = vidCompare(vid, vid2);

            Double moreNum = moreVids(skaiciuMasyvas, vid);
            Double moreNum2 = moreVids(skaiciuMasyvas2, vid2);

            rasyti(atsakymai, skaiciuMasyvas, skaiciuMasyvas2, vid, vid2, moreNum, moreNum2, maxVid);

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


    public static void rasyti(String failas, Integer[] masyvas, Integer[] masyvas2, Double vid, Double vid2 , Double moreNum, Double moreNum2, Double maxVid) throws IOException {
        BufferedWriter output = null;
        try {
            output = new BufferedWriter(new FileWriter(failas));
            output.write("Pirmojo masyvo vidurkis yra:" + vid + "\n");
            output.write("Antrojo masyvo vidurkis yra:" + vid2 + "\n");
            output.write("Didesnis yra: " + maxVid + "\n");
            output.write("--------------------------------------------\n");
            output.write(moreNum+": 1-ajam masyve didesniu sk nr uz jo skaiciu vid;\n"+moreNum2+": 2-ajam masyve didesniu sk nr uz jo skaiciu vid;\n");
            output.write("Sis masyvas turi daugiau elementu, didesniu nei savasis vidurkis: \n");
            output.write(masyvas[0].toString() + "; ");
            output.write(masyvas[1].toString() + "; ");


            if (moreNum > moreNum2) {

                for (int i = 0; i < masyvas.length; i++) {
                    output.write(masyvas[i].toString() + "; ");
                }
            } else{
                for (int i = 0; i < masyvas2.length; i++) {
                    output.write(masyvas2[i].toString() + "; ");
                }
            }


        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (output != null) {
                output.close();
            }
        }
    }

    public static Double vidurkis(Integer[] masyvas) {
        Double suma = 0.0;
        for (int i = 0; i < masyvas.length; i++) {
            suma += masyvas[i];
        }
        return (double) suma / masyvas.length;
    }

    public static Double vidCompare(Double vid, Double vid2) {
        if (vid > vid2) {
            return vid;
        } else {
            return vid2;
        }
    }

    public static Double moreVids(Integer[] masyvas, Double vid) {
        Double temp = 0.0;
        for (int i = 0; i < masyvas.length; i++) {
            if (masyvas[i] > vid) {
                temp++;
            }
        }
        return (double) temp;
    }


}
