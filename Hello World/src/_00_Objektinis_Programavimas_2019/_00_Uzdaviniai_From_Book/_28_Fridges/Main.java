package _00_Objektinis_Programavimas_2019._00_Uzdaviniai_From_Book._28_Fridges;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        String dataStringData = new File("").getAbsolutePath() + "\\src\\_00_Objektinis_Programavimas_2019._00_Uzdaviniai_From_Book._28_Fridges\\Duomenys.txt";
        String rezultataiLikutis = new File("").getAbsolutePath() + "\\src\\_00_Objektinis_Programavimas_2019._00_Uzdaviniai_From_Book._28_Fridges\\Rezultatai.txt";
        String rezultataiUzsakyti = new File("").getAbsolutePath() + "\\src\\_00_Objektinis_Programavimas_2019._00_Uzdaviniai_From_Book._28_Fridges\\Uzsakymai.txt";
        String sandelis = new File("").getAbsolutePath() + "\\src\\_00_Objektinis_Programavimas_2019._00_Uzdaviniai_From_Book._28_Fridges\\Sandelis.txt";

        Map<Integer, Technika> laikinas = readTechnikosDuomenis(dataStringData);
        Map<Integer, Integer> laikinasUpdate = readTechnikosDuomenisSandelis(sandelis);
        Map<Integer, Technika> allUpdated = updateTechnikosStorage(laikinas, laikinasUpdate);

        rasytiUzasakymai(rezultataiUzsakyti, allUpdated);
        rasytiLikeSandeli(rezultataiLikutis, allUpdated);
    }

    public static Map<Integer, Technika> readTechnikosDuomenis(String data) {

        Map<Integer, Technika> visaTechnika = new HashMap<>();
        String[] eilutesDuomenys;

        try (BufferedReader br = new BufferedReader(new FileReader(data))) {
            String line = br.readLine();
            while (line != null) {
                eilutesDuomenys = line.split(" ");
                String pavadinimas = "";

                for (int i = 0; i < eilutesDuomenys.length - 3; i++) {
                    pavadinimas += eilutesDuomenys[i] + " ";
                }

                Integer prekesKodas = Integer.parseInt(eilutesDuomenys[eilutesDuomenys.length - 3]);
                Integer prekiuSk = Integer.parseInt(eilutesDuomenys[eilutesDuomenys.length - 2]);
                Double kaina = Double.parseDouble(eilutesDuomenys[eilutesDuomenys.length - 1]);

                Technika temp = new Technika(pavadinimas, prekesKodas, prekiuSk, kaina);

                visaTechnika.put(prekesKodas, temp);

                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("IOException happened");
        }
        return visaTechnika;
    }

    public static Map<Integer, Integer> readTechnikosDuomenisSandelis(String data) {

        Map<Integer, Integer> visaTechnika = new HashMap<>();
        String[] eilutesDuomenys;

        try (BufferedReader br = new BufferedReader(new FileReader(data))) {
            String line = br.readLine();
            while (line != null) {
                eilutesDuomenys = line.split(" ");
                Integer prekesKodas = Integer.parseInt(eilutesDuomenys[0]);
                Integer prekesPaklausa = Integer.parseInt(eilutesDuomenys[1]);

                visaTechnika.put(prekesKodas, prekesPaklausa);

                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("IOException happened");
        }
        return visaTechnika;
    }

    public static Map<Integer, Technika> updateTechnikosStorage(Map<Integer, Technika> visaData, Map<Integer, Integer> dataUpdate) {
        for (Map.Entry<Integer, Integer> eachAll : dataUpdate.entrySet()) {
            if (visaData.containsKey(eachAll.getKey())) {
                Integer temp = visaData.get(eachAll.getKey()).getPrekiuSk() - eachAll.getValue();
                visaData.get(eachAll.getKey()).setPrekiuSk(temp);
            }
        }
        return visaData;
    }

    public static void rasytiUzasakymai(String dataBuy, Map<Integer, Technika> obj) {

        try (BufferedWriter outputBuy = new BufferedWriter(new FileWriter(dataBuy))){
            Double suma=0.0;
            for (Map.Entry<Integer, Technika> eachMap : obj.entrySet()) {
                if (eachMap.getValue().getPrekiuSk() < 0) {
                    Technika temp=eachMap.getValue();
                    outputBuy.write(temp.getPavadinimasTechnikos()+" "+temp.getPrekesKodas()+" "+Math.abs(temp.getPrekiuSk())+";\n");
                    suma+=temp.getKaina()*Math.abs(temp.getPrekiuSk());
                }
            }
            outputBuy.write("Sumoketi tiekejams: "+suma+" Eu;");
        } catch (IOException e) {
            System.out.println("found ya!");
        }
    }
public static void rasytiLikeSandeli(String dataStorage, Map<Integer, Technika> obj) {

        try (BufferedWriter outputStore = new BufferedWriter(new FileWriter(dataStorage))){

            for (Map.Entry<Integer, Technika> eachMap : obj.entrySet()) {
                if (eachMap.getValue().getPrekiuSk() >= 0) {
                    Technika temp=eachMap.getValue();
                    outputStore.write(temp.toString()+"\n");
                }
            }
        } catch (IOException e) {
            System.out.println("found ya!");
        }
    }

}
//    public static Map<Integer,Technika> uzsakymuMap(Map<Integer,Technika> negative){
//        Map<Integer,Technika> reikUzsakyti=new HashMap<>();
//
//    }

