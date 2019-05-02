package _00_Objektinis_Programavimas_2019.main;

import java.io.*;

public class Marius_Min_input {


    public static void main(String[] args) {
        try {

            Skaityti("C:\\Coding\\java_01_22_JDK_11_install\\src\\fundamental\\files\\fileReadx.txt");

            Rasyti("C:\\Coding\\java_01_22_JDK_11_install\\src\\fundamental\\files\\fileWrite.txt");

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("rad klaidą nėra failo");
        }
    }

    public static void Skaityti(String failas) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader(failas));
        try {
            String line = br.readLine();
            System.out.println(line);

        } catch (FileNotFoundException ex) {

            System.out.println("Failas nerastas");
        } finally {
            br.close();
        }
    }

    public static void Rasyti(String failas) throws IOException {

        BufferedWriter output = null;
        try {
            output = new BufferedWriter(new FileWriter(failas));
            output.write("aaa bbbbbb ccccccccc");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (output != null) {
                output.close();
            }
        }
    }

}
