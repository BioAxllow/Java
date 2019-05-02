package _00_Objektinis_Programavimas_2019._17_Parametrizuotos_Klases_Weekend._17_Parametrizouotos_Klases_Weekend_List;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        String data = new File("").getAbsolutePath() + "\\src\\_00_Objektinis_Programavimas_2019._17_Parametrizuotos_Klases_Weekend\\_17_Parametrizouotos_Klases_Weekend_List\\Data.txt";
        String dataOutput = new File("").getAbsolutePath() + "\\src\\_00_Objektinis_Programavimas_2019._17_Parametrizuotos_Klases_Weekend\\_17_Parametrizouotos_Klases_Weekend_List\\DataOutput.txt";
        List<Cars> laikinas = skaitytiFile(data);

        Integer senumas = 2003;
        Integer senumasMin = 2005;
        Integer senumasMax = 2009;
        String marke = "VW";
        Character tipas = 'D';

//        String str = "Database";
//        String uzduotis = bruksniuSk(str);
//        System.out.println(uzduotis);
//        laikinas.forEach(c-> System.out.println(c.toString()));

        rasyti(dataOutput,laikinas,senumas,senumasMin,senumasMax,marke,tipas);

    }

    public static void rasyti(String dataOutput, List<Cars> listMasyvas,Integer senumas, Integer senumasMin, Integer senumasMax, String marke, Character tipas) {

        try (BufferedWriter output = new BufferedWriter(new FileWriter(dataOutput))) {
            String str = "Database";
            String uzduotis = bruksniuSk(str);
            output.write(uzduotis + "\n");

                listMasyvas.forEach(c-> {try {
                    output.write(c.toString()+"\n");
                }catch (IOException e){
                    System.out.println("nerastas");
                }
                });

//              -------------------------------------------------------------------------------------

            String str1 = "Rasti seniausią mašiną ir ją atspausdinti";
            String uzduotis1 = bruksniuSk(str1);
            output.write(uzduotis1 + "\n");


                listMasyvas.sort(Comparator.comparing(Cars::getMetai));
                listMasyvas.forEach(c-> {if (c.getMetai().equals(listMasyvas.get(0).getMetai())){
                    try {
                        output.write(c.toString()+"\n");
                    }catch (IOException e){
                        System.out.println("kazkas");
                    }
                }} );

//              -------------------------------------------------------------------------------------

            String str2 = "Rasti naujausią mašiną ir ją atspausdinti";
            String uzduotis2 = bruksniuSk(str2);
            output.write(uzduotis2 + "\n");

            listMasyvas.forEach(c-> {if (c.getMetai().equals(listMasyvas.get(listMasyvas.size()-1).getMetai())){
                try {
                    output.write(c.toString()+"\n");
                }catch (IOException e){
                    System.out.println("kazkas");
                }
            }} );

//            -------------------------------------------------------------------------------------

            String str3 = "Rasti visas mašinas naujesnes nei " + senumas + " metai:";
            String uzduotis3 = bruksniuSk(str3);
            output.write(uzduotis3 + "\n");

            listMasyvas.forEach(c-> {if (c.getMetai()>senumas){
                try {
                    output.write(c.toString()+"\n");
                }catch (IOException e){
                    System.out.println("kazkas");
                }
            }} );

//            -------------------------------------------------------------------------------------


            String str4 = "Rasti visas mašinas, kurios yra pagamintos tarp " + senumasMin + " ir " + senumasMax + " metų ir jas atspausdinti";
            String uzduotis4 = bruksniuSk(str4);
            output.write(uzduotis4 + "\n");

            listMasyvas.forEach(c-> {if (c.getMetai()>senumasMin && c.getMetai()<senumasMax){
                try {
                    output.write(c.toString()+"\n");
                }catch (IOException e){
                    System.out.println("kazkas");
                }
            }} );

//            -------------------------------------------------------------------------------------

            String str5 = "Rasti visas " + marke + " markės mašinas ir jas atspausdinti";
            String uzduotis5 = bruksniuSk(str5);
            output.write(uzduotis5 + "\n");

            listMasyvas.forEach(c-> {if (c.getGamintojas().equals(marke)){
                try {
                    output.write(c.toString()+"\n");
                }catch (IOException e){
                    System.out.println("kazkas");
                }
            }} );

//            -------------------------------------------------------------------------------------

            String str6 = "Rasti didžiausią variklio tūrį turinčią mašiną ir ją atspausdinti";
            String uzduotis6 = bruksniuSk(str6);
            output.write(uzduotis6 + "\n");

            listMasyvas.sort(Comparator.comparing(Cars::getVariklioTuris));
            listMasyvas.forEach(c-> {if (c.getVariklioTuris().equals(listMasyvas.get(listMasyvas.size()-1).getVariklioTuris())){
                try {
                    output.write(c.toString()+"\n");
                }catch (IOException e){
                    System.out.println("kazkas");
                }
            }} );

//            -------------------------------------------------------------------------------------

            String str7 = "Rasti " + tipas + " variklį turinčių mašinų kiekį";
            String uzduotis7 = bruksniuSk(str7);
            output.write(uzduotis7 + "\n");

            listMasyvas.forEach(c-> {if (c.getKuroTipas().equals(tipas)){
                try {
                    output.write(c.toString()+"\n");
                }catch (IOException e){
                    System.out.println("kazkas");
                }
            }} );

//            -------------------------------------------------------------------------------------


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Cars> skaitytiFile(String data) {

        List<Cars> allCars = new ArrayList<>();
        String[] eilutesDuomenys;

        try (BufferedReader br = new BufferedReader(new FileReader(data))) {
            br.readLine();
            String line = br.readLine();
            while (line != null) {
                eilutesDuomenys = line.split(" ");
                Cars temp = new Cars(eilutesDuomenys[0], eilutesDuomenys[1], Integer.parseInt(eilutesDuomenys[2]), Integer.parseInt(eilutesDuomenys[3]), Double.parseDouble(eilutesDuomenys[4]), eilutesDuomenys[5].charAt(0));
                allCars.add(temp);
                line = br.readLine();
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Failas nerastas");
        } catch (Exception e) {
            System.out.println("something happened");
        }
        return allCars;
    }

    public static String bruksniuSk(String temp) {
        String laikinas = "-";
        if (temp.length() > 120) {
            return laikinas;
        } else {
//            if (temp.length()%2==0){
            Integer ilgis = (120 - temp.length()) / 2;
            for (int i = 0; i < ilgis; i++) {
                laikinas += "-";
            }
//            }

        }
        laikinas = "\n" + laikinas + temp + laikinas + "\n";
        return laikinas;
    }



}
