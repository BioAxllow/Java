package _00_Objektinis_Programavimas_2019._11_Figutu_Paveldejimas;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Figuros {
    public static void main(String[] args) {
        String Duomenys = "C:\\Users\\bioax_000\\IdeaProjects\\Hello World\\src\\_00_Objektinis_Programavimas_2019._11_Figutu_Paveldejimas\\Data.txt";
        String Rezultatai = "C:\\Users\\bioax_000\\IdeaProjects\\Hello World\\src\\_00_Objektinis_Programavimas_2019._11_Figutu_Paveldejimas\\Results.txt";
        Figura[] objektuMasyvasFinal = SkaitytiString(Duomenys);
        System.out.println(objektuMasyvasFinal[0]);

        Figura naujas=new Staciakampis(2.0,4.0);
        ((Staciakampis) naujas).getPlotas(((Staciakampis) naujas).getKrastineA(),((Staciakampis) naujas).getKrastineB());



    }

    public static Figura[] SkaitytiString(String filas) {

        Figura[] objektuMasyvas = new Figura[9];
        Double[] objektai;

        String visosEilutes = "";
        String[] objektuEilutes;
        String[] objektoEiluciuStringSkaiciai;

        try (BufferedReader br = new BufferedReader(new FileReader(filas))) {
            String line = br.readLine();
            while (line != null) {
                visosEilutes += line + ";";
                line = br.readLine();
            }

            objektuEilutes = visosEilutes.split(";");

            for (int i = 0; i < objektuEilutes.length-1; i++) {
                objektoEiluciuStringSkaiciai = objektuEilutes[i].split(" ");

                objektai = GautiSkaiciuMasyva(objektoEiluciuStringSkaiciai);

                if (objektai.length == 1) {
                    objektuMasyvas[i] = new Kvadratas(objektai[0] * 1.0);
                } else if (objektai.length == 2) {
                    objektuMasyvas[i] = new Staciakampis(objektai[0] * 1.0, objektai[1] * 1.0);
                } else {
                    objektuMasyvas[i] = new Trikampis(objektai[0] * 1.0, objektai[1] * 1.0, objektai[2] * 1.0);
                }
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Failas nerastas");
        } catch (Exception e) {
            System.out.println("something happened");
        }
        return objektuMasyvas;

    }

    public static Double[] GautiSkaiciuMasyva(String[] skaiciai) {
        Double[] skaiciuMasyvas = new Double[skaiciai.length];
        for (int i = 0; i < skaiciai.length; i++) {
            skaiciuMasyvas[i] = Double.parseDouble(skaiciai[i]);
        }
        return skaiciuMasyvas;
    }






}

