package _00_Objektinis_Programavimas_2019._00_Uzdaviniai_From_Book._27_Klases_Vidurkis;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String dataStringData = new File("").getAbsolutePath() + "\\src\\_00_Objektinis_Programavimas_2019._00_Uzdaviniai_From_Book._27_Klases_Vidurkis\\Duomenys.txt";
        String rezultatai = new File("").getAbsolutePath() + "\\src\\_00_Objektinis_Programavimas_2019._00_Uzdaviniai_From_Book._27_Klases_Vidurkis\\Rezultatai.txt";

        Map<String, List<Mokiniai>> visaMokiniuData = readMokiniuDuomenis(dataStringData);

        for (Map.Entry<String, List<Mokiniai>> eachMap : visaMokiniuData.entrySet()) {
            System.out.println(eachMap.getValue());
            eachMap.getValue().forEach(c -> System.out.println(c.getVidurkis(c.getPazymiai())));
        }

    }

    public static Map<String, List<Mokiniai>> readMokiniuDuomenis(String data) {
        Map<String, List<Mokiniai>> visiMokiniai = new HashMap<>();
        String[] eilutesDuomenys;


        try (BufferedReader br = new BufferedReader(new FileReader(data))) {
            String line = br.readLine();
            line = br.readLine();
            while (line != null) {
                eilutesDuomenys = line.split(" ");
                String vardas = eilutesDuomenys[0];
                String pavarde = eilutesDuomenys[1];
                String klase = eilutesDuomenys[2];
                Integer dalykuSk = Integer.parseInt(eilutesDuomenys[3]);
                Mokiniai temp = new Mokiniai(vardas, pavarde, klase, dalykuSk);
                temp.setPazymiai(eilutesDuomenys);

                if (visiMokiniai.containsKey(klase)) {
                    visiMokiniai.get(klase).add(temp);
                } else {
                    List<Mokiniai> tempVisi = new ArrayList<>();
                    tempVisi.add(temp);
                    visiMokiniai.put(klase, tempVisi);
                }
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("IOException happened");
        }

        return visiMokiniai;
    }
}
