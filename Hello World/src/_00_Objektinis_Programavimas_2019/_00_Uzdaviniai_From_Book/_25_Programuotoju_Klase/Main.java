package _00_Objektinis_Programavimas_2019._00_Uzdaviniai_From_Book._25_Programuotoju_Klase;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        String dataStringData = new File("").getAbsolutePath() + "\\src\\_00_Objektinis_Programavimas_2019._00_Uzdaviniai_From_Book._25_Programuotoju_Klase\\Data.txt";
        String rezultatai = new File("").getAbsolutePath() + "\\src\\_00_Objektinis_Programavimas_2019._00_Uzdaviniai_From_Book._25_Programuotoju_Klase\\Rezultatai.txt";

        List<Data> visiStud = readStudSarasas(dataStringData);
        Kriterijai getKrit=getKriterijai(dataStringData);

        Integer maxGrupesDydis = getKrit.getMaxGrupe();

        List<Data> atrinktiStudentai = atrinktiTinkamusStudentus(visiStud, maxGrupesDydis);
        Collections.sort(atrinktiStudentai);

        rasyti(rezultatai,atrinktiStudentai);

    }

    public static List<Data> readStudSarasas(String data) {
        List<Data> studSarasas = new ArrayList<>();
        String[] eilutesDuomenys;

        try (BufferedReader br = new BufferedReader(new FileReader(data))) {
            br.readLine();
            String line = br.readLine();
            while (line != null) {
                eilutesDuomenys = line.split(" ");

                String vardasPavarde = eilutesDuomenys[0];
                Integer ivertis = Integer.parseInt(eilutesDuomenys[1]);
                Data obj = new Data(vardasPavarde, ivertis);
                studSarasas.add(obj);

                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("IOException happened");
        }
        return studSarasas;
    }

    public static Kriterijai getKriterijai(String data){
        Kriterijai kritFinal=null;
        try(BufferedReader br=new BufferedReader(new FileReader(data))) {
            String line=br.readLine();
            if (line!=null){
                String[] eilData=line.split(" ");
                kritFinal=new Kriterijai(Integer.parseInt(eilData[0]));
            }

        }catch (IOException e){
            System.out.println("IOException happened");
        }
        return kritFinal;
    }

    public static List<Data> atrinktiTinkamusStudentus(List<Data> list, Integer maxGrupe) {
        List<Data> atrinktiStudentai = new ArrayList<>();

        if (list.size() <= maxGrupe) {
            return list;
        } else if (list.size() > maxGrupe) {
            for (int i = 1; i < list.size(); i++) {
                if (list.get(i).getIvertis() == 1 && atrinktiStudentai.size() <= maxGrupe) {
                    atrinktiStudentai.add(list.get(i));
                }
            }
            if (atrinktiStudentai.size() < maxGrupe) {
                for (int j = 1; j < list.size(); j++) {
                    if (list.get(j).getIvertis() == 2 && atrinktiStudentai.size() <= maxGrupe) {
                        atrinktiStudentai.add(list.get(j));
                    }
                }
            }
            if (atrinktiStudentai.size() < maxGrupe) {
                for (int z = 1; z < list.size(); z++) {
                    if (list.get(z).getIvertis() == 3 && atrinktiStudentai.size() <= maxGrupe) {
                        atrinktiStudentai.add(list.get(z));
                    }
                }
            }
        }
        return atrinktiStudentai;
    }

    public static void rasyti(String dataOutput, List<Data> obj) {

        try (BufferedWriter output = new BufferedWriter(new FileWriter(dataOutput))) {

            for (Data studentai: obj){
                output.write(studentai.toString()+"\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void pridetiStudenta(List<Data> obj, Data naujasStud){
        obj.add(naujasStud);
    }

    public static void pasalintiStudenta(List<Data> obj, String name, Integer ivertis){
        for (int i=0; i<obj.size(); i++){
            if (obj.get(i).getVardasPavarde().equals(name) && obj.get(i).getIvertis()==ivertis){
                obj.remove(i);
            }
        }
    }
}
