package _00_Objektinis_Programavimas_2019.main;

import java.io.*;

public class InputFromFile {

    public static void main(String[] args) {
        String file = "C:\\Users\\bioax_000\\IdeaProjects\\Hello World\\Bandymas1.txt";
        String fileRasymui = "C:\\Users\\bioax_000\\IdeaProjects\\Hello World\\B.txt";
        try {
            Integer[] nuskaitytiSkaiciai = Skaityti(file);
            Integer gautaSuma = Suma(nuskaitytiSkaiciai);
            Rasyti(fileRasymui, gautaSuma);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Integer Suma(Integer[] skaiciuMasyvas) {
        Integer suma = 0;
        for (int i = 0; i < skaiciuMasyvas.length; i++) {
            suma += skaiciuMasyvas[i];
        }
        return suma;
    }

    public static Integer[] Skaityti(String failas) throws IOException {

        Integer[] masyvas = null;
        BufferedReader br = new BufferedReader(new FileReader(failas));
        try {
            StringBuilder sb = new StringBuilder();
            String nReiksme = br.readLine();
            Integer n = Integer.parseInt(nReiksme);
            masyvas = new Integer[n];
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                String[] skaiciai = line.split(" ");
                for (int i = 0; i < skaiciai.length; i++) {
                    masyvas[i] = Integer.parseInt(skaiciai[i]);
                }
                line = br.readLine();
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Failas nerastas");
        } finally {
            br.close();
        }

        return masyvas;
    }

    public static void Rasyti(String failas, Integer ats) throws IOException {
        BufferedWriter output = null;
        try {
            output = new BufferedWriter(new FileWriter(failas));
            output.write("Gauta suma lygi = " + ats);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (output != null) {
                output.close();
            }
        }
    }

}