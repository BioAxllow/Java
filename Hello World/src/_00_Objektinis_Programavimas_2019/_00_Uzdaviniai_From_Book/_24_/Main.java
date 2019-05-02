package _00_Objektinis_Programavimas_2019._00_Uzdaviniai_From_Book._24_;

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
        String dataStringData = new File("").getAbsolutePath() + "\\src\\_00_Objektinis_Programavimas_2019._00_Uzdaviniai_From_Book._24_\\Duomenys.txt";
        String dataStringStudentai = new File("").getAbsolutePath() + "\\src\\_00_Objektinis_Programavimas_2019._00_Uzdaviniai_From_Book._24_\\Studentai.txt";
        String dataStringKriterijai = new File("").getAbsolutePath() + "\\src\\_00_Objektinis_Programavimas_2019._00_Uzdaviniai_From_Book._24_\\Kriterijai.txt";
        String dataOutput = new File("").getAbsolutePath() + "\\src\\_00_Objektinis_Programavimas_2019._00_Uzdaviniai_From_Book._24_\\Output.txt";

        List<Butas> butai = readButaiTxt(dataStringData);
        Map<String,List<Studentai>> studentuMap=readPlayerTxt(dataStringStudentai);
        Kriterijai kriterijai=readKriterijaiString(dataStringKriterijai);

        List<Butas> atrinkti=lyginimasPagalKriterijus(butai,kriterijai);
        atrinkti.forEach(c-> System.out.println(c));


    }

    public static Map<String, List<Studentai>> readPlayerTxt(String data) {
        Map<String, List<Studentai>> visiDuomenys = new HashMap<>();

        String[] eilutesDuomenys;

        try (BufferedReader br = new BufferedReader(new FileReader(data))) {
            String line = br.readLine();
            while (line != null) {
                eilutesDuomenys = line.split(" ");
                String vardas = eilutesDuomenys[0];
                String pavarde = eilutesDuomenys[1];
                String grupe = eilutesDuomenys[2];

                Studentai temp = new Studentai(vardas, pavarde, grupe);
                if (visiDuomenys.containsKey(grupe)) {
                    visiDuomenys.get(grupe).add(temp);
                } else {
//                    List<Studentai> studentai = new ArrayList<>();  both way are working
//                    studentai.add(temp);
//                    visiDuomenys.put(grupe,studentai);
                    visiDuomenys.put(grupe, new ArrayList<>());
                    visiDuomenys.get(grupe).add(temp);
                }
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("IOException happened");
        }
        return visiDuomenys;
    }

    public static List<Butas> readButaiTxt(String data) {
        List<Butas> butas = new ArrayList<>();
        String[] eilutesDuomenys;

        try (BufferedReader br = new BufferedReader(new FileReader(data))) {
            String line = br.readLine();
            while (line != null) {
                eilutesDuomenys = line.split(" ");
                Integer butoNr = Integer.parseInt(eilutesDuomenys[0]);
                String adresas = eilutesDuomenys[1] + " " + eilutesDuomenys[2] + " " + eilutesDuomenys[3];
                Integer butuKamSk = Integer.parseInt(eilutesDuomenys[4]);
                Double kvadratura = Double.parseDouble(eilutesDuomenys[5]);
                Double nuomoksKaina = Double.parseDouble(eilutesDuomenys[6]);

                Butas temp = new Butas(butoNr, adresas, butuKamSk, kvadratura, nuomoksKaina);

                butas.add(temp);

                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("IOException happened");
        }
        return butas;
    }

    public static Kriterijai readKriterijaiString(String data) {

        Kriterijai kriterijai=null;

        String[] eilutesDuomenys1;
        String[] eilutesDuomenys2;
        String[] eilutesDuomenys3;

        try (BufferedReader br = new BufferedReader(new FileReader(data))) {
            String line1 = br.readLine();
            String line2 = br.readLine();
            String line3 = br.readLine();

            eilutesDuomenys1 = line1.split(" ");
            eilutesDuomenys2 = line2.split(" ");
            eilutesDuomenys3 = line3.split(" ");

            Integer butuSkMin=Integer.parseInt(eilutesDuomenys1[0]);
            Integer butuSkMax=Integer.parseInt(eilutesDuomenys1[1]);

            Double kvadraturaMin=Double.parseDouble(eilutesDuomenys2[0]);
            Double kvadraturaMax=Double.parseDouble(eilutesDuomenys2[1]);

            Double nuomoksKainaMin=Double.parseDouble(eilutesDuomenys3[0]);
            Double nuomoksKainaMax=Double.parseDouble(eilutesDuomenys3[1]);

            kriterijai = new Kriterijai(butuSkMin,butuSkMax,kvadraturaMin,kvadraturaMax,nuomoksKainaMin,nuomoksKainaMax);

        } catch (IOException e) {
            System.out.println("IOException happened");
        }

        return kriterijai;
    }

    public static List<Butas> lyginimasPagalKriterijus(List<Butas> butai,Kriterijai kriterijai){
        List<Butas> butas=new ArrayList<>();

        for (Butas obj: butai){
            if (obj.getKambSk()>=kriterijai.getKambariuSkMin() && obj.getKambSk()<=kriterijai.getKambariuSkMax() &&
                    obj.getKvadratura()>=kriterijai.getKvadraturaMin() && obj.getKvadratura()<=kriterijai.getKvadraturaMax() &&
                    obj.getNuomosKaina()>=kriterijai.getNuomosKainaMin() && obj.getNuomosKaina()<=kriterijai.getNuomosKainaMax()){
                butas.add(obj);
            }
        }
        return butas;
    }

//    public static List<Butas> butai(){
//
//    }
}
