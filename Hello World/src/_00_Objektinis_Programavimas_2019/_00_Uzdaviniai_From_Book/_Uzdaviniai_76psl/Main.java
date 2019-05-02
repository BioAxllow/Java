package _00_Objektinis_Programavimas_2019._00_Uzdaviniai_From_Book._Uzdaviniai_76psl;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        String allCandiesData = new File("").getAbsolutePath() + "\\src\\_00_Objektinis_Programavimas_2019._00_Uzdaviniai_From_Book._Uzdaviniai_76psl\\SaldainiuDuomenys.txt";
        String allCandiesReults = new File("").getAbsolutePath() + "\\src\\_00_Objektinis_Programavimas_2019._00_Uzdaviniai_From_Book._Uzdaviniai_76psl\\SaldainiuRezultatai.txt";
        
        Map<String, List<Saldainis>> allCandies=skaitytiData(allCandiesData);
        rasytiToFile(allCandiesReults,allCandies);
        
    }

    public static void rasytiToFile(String outputData, Map<String,List<Saldainis>> allCandies){

        try (BufferedWriter output= new BufferedWriter(new FileWriter(outputData))){

            for (String key: allCandies.keySet()){
                output.write("\nFirma: "+key+", jos gaminamos saldanių rūšys/ivertinimai:\n\n");
                Collections.sort(allCandies.get(key));
                for (Saldainis sald: allCandies.get(key)){
                    output.write(sald.toString()+"\n");
                }
            }

        }catch (IOException e){
            System.out.println("check Input");
        }
    }

    public static Map<String, List<Saldainis>> skaitytiData(String allData) {
        Map<String, List<Saldainis>> allCandies = new HashMap<>();
        String[] eilutesDuomenys;

        try (BufferedReader br = new BufferedReader(new FileReader(allData))) {
            String line = br.readLine();
            eilutesDuomenys = line.split(" ");
            Integer imoniusSk = Integer.parseInt(eilutesDuomenys[0]);

            for (int i = 0; i < imoniusSk; i++) {
                line = br.readLine();
                eilutesDuomenys = line.split(" ");
                Integer saldainiuSk = gautiSk(eilutesDuomenys);
                String firmosPavadinimas = gautiPavadinima(eilutesDuomenys);
                List<Saldainis> saldainiai = new ArrayList<>();

                for (int j = 0; j < saldainiuSk; j++) {
                    line = br.readLine();
                    eilutesDuomenys = line.split(" ");
                    Saldainis temp = new Saldainis(gautiPavadinima(eilutesDuomenys), gautiSk(eilutesDuomenys));
                    saldainiai.add(temp);
                }
                allCandies.put(firmosPavadinimas, saldainiai);
            }

        } catch (IOException e) {
            System.out.println("something");
        }
        return allCandies;
    }

    public static String gautiPavadinima(String[] all) {
        String pavadinimas ="";
        String tarpelis;
        for (int i = 0; i < all.length - 1; i++) {
            if (i == all.length - 2) {
                tarpelis = "";
            } else {
                tarpelis = " ";
            }
            pavadinimas += all[i] + tarpelis;
        }
        return pavadinimas;
    }

    public static Integer gautiSk(String[] all) {
        Integer skaicius = Integer.parseInt(all[all.length - 1]);
        return skaicius;
    }
}

