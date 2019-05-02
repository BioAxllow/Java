package _00_Objektinis_Programavimas_2019.main;

import java.io.*;

public class InputWords {
    public static void main(String[] args) {
        String file = "C:\\Users\\bioax_000\\IdeaProjects\\Hello World\\Duomenys.txt";
        String fileRasymui = "C:\\Users\\bioax_000\\IdeaProjects\\Hello World\\Atsakymai.txt";
        try {
            String nuskaitytasTekstas = Skaityti(file);
            // \\W pasalina ne zodzius char elementus
            String[] zodziuMasyvas = nuskaitytasTekstas.split("\\W+");
            Integer zodziuSkaicius = zodziuMasyvas.length;

            Rasyti(fileRasymui, zodziuSkaicius, nuskaitytasTekstas);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String Skaityti(String failas) throws IOException {       //nurodome jog funkcija lukia string tipo failo.
        String nuskaitytasTekstas = "";                                     //sukuriame kintamaji, kuris yra tuscias string.
        BufferedReader br = new BufferedReader(new FileReader(failas));     //
        try {
            StringBuilder sb = new StringBuilder();                         //
            String line = br.readLine();                                    //nuskaito eilute

            while (line != null) {                                          //kol eilute nera tuscia vukdom cikla while
                sb.append(line);
                sb.append(System.lineSeparator());
                nuskaitytasTekstas += line + " ";
                line = br.readLine();
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Failas nerastas");
        } finally {
            br.close();
        }

        return nuskaitytasTekstas;
    }

    public static void Rasyti(String failas, Integer zodziuSkaicius, String tekstas) throws IOException {
        BufferedWriter output = null;
        try {
            output = new BufferedWriter(new FileWriter(failas));
            output.write("Zodziu skaicius = " + zodziuSkaicius + "\n");
            output.write(tekstas);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (output != null) {
                output.close();
            }
        }
    }
}

