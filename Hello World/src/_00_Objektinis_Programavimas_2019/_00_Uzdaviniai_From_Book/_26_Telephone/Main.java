package _00_Objektinis_Programavimas_2019._00_Uzdaviniai_From_Book._26_Telephone;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String dataStringData = new File("").getAbsolutePath() + "\\src\\_00_Objektinis_Programavimas_2019._00_Uzdaviniai_From_Book._26_Telephone\\TelephoneData.txt";
        String rezultatai = new File("").getAbsolutePath() + "\\src\\_00_Objektinis_Programavimas_2019._00_Uzdaviniai_From_Book._26_Telephone\\Rezultatai.txt";

        Map<Integer, Telephone> allData = readPhoneData(dataStringData);

        //1- funkcija telStatistika gaus reiksme "true" ir ieskos tos reiksmes, 0- skip that operation;
        Integer pelingiausias = 0;
        Integer populiariausias = 1;
        Integer mazPop = 0;

        Map<String, Telephone> atrinkitiPhones = telStatistika(allData, 1, 1, 1);

        rasyti(rezultatai,atrinkitiPhones,pelingiausias,populiariausias,mazPop);

//        for (Map.Entry<Integer, Telephone> mapEach : allData.entrySet()) {
//            System.out.println(mapEach.toString());
//        }
//        for (Map.Entry<String, Telephone> mapEach : atrinkitiPhones.entrySet()) {
//            System.out.println(mapEach.toString());
//        }
    }

    public static void rasyti(String dataOutput,
                              Map<String, Telephone> atrinktiPhones,
                              Integer pelningiausias,
                              Integer populiariausias,
                              Integer mazPop) {

        try (BufferedWriter output = new BufferedWriter(new FileWriter(dataOutput))) {
            String strPopuliariausias = "populiariausias";
            String strPelningiausias = "pelningiausias";
            String strNotPopular = "mazPop";

            if (populiariausias == 1) {
                Telephone temp=atrinktiPhones.get(strPopuliariausias);
                output.write("Populiariausias: "+temp.getTelephoneName()+";\n");
                output.write("Parduota: "+temp.getTelephoneSold()+" vnt.\n");
                output.write("Surinkta: "+peliningumas(temp)+" Eu.\n\n");
            }
            if (pelningiausias == 1) {
                Telephone temp=atrinktiPhones.get(strPelningiausias);
                output.write("Pelningiausias: "+temp.getTelephoneName()+";\n");
                output.write("Parduota: "+temp.getTelephoneSold()+" vnt.\n");
                output.write("Surinkta: "+peliningumas(temp)+" Eu.\n\n");
            }
            if (mazPop == 1) {
                Telephone temp=atrinktiPhones.get(strNotPopular);
                output.write("Maziausiai populiarus: "+temp.getTelephoneName()+";\n");
                output.write("Parduota: "+temp.getTelephoneSold()+" vnt.\n");
                output.write("Surinkta: "+peliningumas(temp)+" Eu.\n\n");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Map<Integer, Telephone> readPhoneData(String data) {
        Map<Integer, Telephone> visiPhones = new HashMap<>();
        String[] eilutesDuomenys;

        try (BufferedReader br = new BufferedReader(new FileReader(data))) {
            String line = br.readLine();
            while (line != null) {
                eilutesDuomenys = line.split(" ");
                if (eilutesDuomenys.length == 1) {
                    line = br.readLine();
                    continue;
                }
                if (eilutesDuomenys.length == 2) {
                    Integer phoneID = Integer.parseInt(eilutesDuomenys[0]);
                    Integer visiParduoti = visiPhones.get(phoneID).getTelephoneSold() + Integer.parseInt(eilutesDuomenys[1]);
                    visiPhones.get(phoneID).setTelephoneSold(visiParduoti);

                }
                if (eilutesDuomenys.length > 2) {
                    Integer phoneID = Integer.parseInt(eilutesDuomenys[0]);
                    String phoneName = eilutesDuomenys[1] + " " + eilutesDuomenys[2] + " " + eilutesDuomenys[3];
                    Double phonePrice = Double.parseDouble(eilutesDuomenys[4]);
                    Telephone obj = new Telephone(phoneID, phoneName, phonePrice);
                    visiPhones.put(phoneID, obj);
                }

                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("IOException happened");
        }
        for (Map.Entry<Integer, Telephone> mapEach : visiPhones.entrySet()) {
            System.out.println(mapEach.toString());
        }

        return visiPhones;
    }

    public static Map<String, Telephone> telStatistika(Map<Integer, Telephone> allData, Integer populiariausias, Integer pelningiausias, Integer maziausiaiPop) {
        Map<String, Telephone> atrinktiPhones = new HashMap<>();

        String strPopuliariausias = "populiariausias";
        String strPelningiausias = "pelningiausias";
        String strNotPopular = "mazPop";

        Integer mostPopular = 0;
        Double mostProfitable = 0.0;
        Integer leastProfitable = 1000;

        for (Map.Entry<Integer, Telephone> eachTel : allData.entrySet()) {
            if (pelningiausias == 1) {
                if (peliningumas(eachTel.getValue()) > mostProfitable) {
                    mostProfitable = peliningumas(eachTel.getValue());
                    atrinktiPhones.put(strPelningiausias, eachTel.getValue());
                }
            }
            if (populiariausias == 1) {
                if (eachTel.getValue().getTelephoneSold() > mostPopular) {
                    mostPopular = eachTel.getValue().getTelephoneSold();
                    atrinktiPhones.put(strPopuliariausias, eachTel.getValue());
                }
            }
            if (maziausiaiPop == 1) {
                if (eachTel.getValue().getTelephoneSold() < leastProfitable) {
                    leastProfitable = eachTel.getValue().getTelephoneSold();
                    atrinktiPhones.put(strNotPopular, eachTel.getValue());
                }
            }
        }
        return atrinktiPhones;
    }

    public static Double peliningumas(Telephone phoneData) {
        Double cash = phoneData.getTelephonePrice() * phoneData.getTelephoneSold();
        return cash;
    }
}
