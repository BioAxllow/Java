package _00_Objektinis_Programavimas_2019._00_Uzdaviniai_From_Book._Uzdaviniai_85psl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        String stringDataFile = new File("").getAbsolutePath() + "\\src\\_00_Objektinis_Programavimas_2019\\_00_Uzdaviniai_From_Book\\_Uzdaviniai_85psl\\Duomenys.txt";
        String stringDataRezultatai = new File("").getAbsolutePath() + "\\src\\_00_Objektinis_Programavimas_2019\\_00_Uzdaviniai_From_Book\\_Uzdaviniai_85psl\\Rezultatai.txt";

        Map<Integer, Sportininkas> allDalyviai = skaitytiData(stringDataFile);
        Map<Integer,Sportininkas> atrinktiLaimetojai=atrinktiTinkamus(allDalyviai);

        List<Sportininkas> listLaimetojai = new ArrayList<>(atrinktiLaimetojai.values());

        Collections.sort(listLaimetojai);
        System.out.println("Begikas: "+ listLaimetojai.get(0).getVardas()+" "+listLaimetojai.get(0).getPavarde()+" I-pirma vieta");
        listLaimetojai.forEach(c-> System.out.println(c.toString()));

    }

    public static Map<Integer, Sportininkas> skaitytiData(String allData) {
        Map<Integer, Sportininkas> visiSportininkai = new HashMap<>();
        String[] eilutesDuommenys;

        try (BufferedReader br = new BufferedReader(new FileReader(allData))) {

            String line = br.readLine();
            Integer dalyviuSk = Integer.parseInt(line);

            for (int i = 0; i < dalyviuSk; i++) {
                line = br.readLine();
                Sportininkas temp=gautiSportininka(line, i);
                visiSportininkai.put(temp.getSportininkoNr(), temp);
            }

            line = br.readLine();
            Integer punktuSk = Integer.parseInt(line);

            for (int i = 0; i < punktuSk; i++) {
                line = br.readLine();
                uzfiksuotiPunktus(line, visiSportininkai);
            }

        } catch (IOException e) {
            System.out.println("something");
        }
        return visiSportininkai;
    }

    public static Sportininkas gautiSportininka(String eilute, Integer sportNr){

        String[] eilutesDuommenys = eilute.split(" ");

        Integer sportininkoNr = sportNr + 1;
        String name = eilutesDuommenys[0];
        String surname = eilutesDuommenys[1];
        String startTime = eilutesDuommenys[2];
        String endTime = eilutesDuommenys[3];
        Sportininkas temp = new Sportininkas(sportininkoNr, name, surname, startTime, endTime);

        return temp;
    }

    public static void uzfiksuotiPunktus(String line, Map<Integer,Sportininkas> visiSportininkai){

        String[] eilutesDuommenys = line.split(" ");
        Integer punktoNr = Integer.parseInt(eilutesDuommenys[0]);
        Integer apsilankiusiuDalyviuSk = Integer.parseInt(eilutesDuommenys[1]);

        for (int j = 2; j < apsilankiusiuDalyviuSk + 2; j++) {
            visiSportininkai.get(Integer.parseInt(eilutesDuommenys[j])).setPunktai(punktoNr);
        }
    }

    public static Map<Integer,Sportininkas> atrinktiTinkamus(Map<Integer, Sportininkas> allSportsmen){
        Map<Integer,Sportininkas> atrinktiSportininkai= new HashMap<>();
        for(Map.Entry<Integer,Sportininkas> mapEach: allSportsmen.entrySet()){
            if (mapEach.getValue().getPunktai().contains(5)){
                atrinktiSportininkai.put(mapEach.getKey(),mapEach.getValue());
            }
        }
        return atrinktiSportininkai;
    }

}
