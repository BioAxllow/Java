package _17_Parametrizuotos_Klases_Weekend;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String data = new File("").getAbsolutePath() +"\\src\\_17_Parametrizuotos_Klases_Weekend\\Data.txt";
        String dataOutput = new File("").getAbsolutePath() +"\\src\\_17_Parametrizuotos_Klases_Weekend\\DataOutput.txt";
        Cars[] laikinas = skaitytiFile(data);

        Integer senumas = 2030;
        Integer senumasMin = 2005;
        Integer senumasMax = 2020;
        String marke = "VW";
        Character tipas = 'D';

        String str = "Database";
        String uzduotis = bruksniuSk(str);
        System.out.println(uzduotis);
        spausdinti(laikinas);

        Integer[] seniausias = rastiSeniausia(laikinas);
        Integer[] naujausias = rastiNaujausia(laikinas);
        Integer[] naujesnesNei = rastiNaujesniasNei(laikinas, senumas);
        Integer[] specMetuMasinos = rastiSpecificMetuMasinas(laikinas, senumasMin, senumasMax);
        Integer[] specMarkesMasinos = rastiSpecificMarkes(laikinas, marke);
        Integer[] maxVariklioTuris = rastiMaxVariklioTuri(laikinas);
        Integer masinuSkSuSpecFuel = rastiSkMasinuSuSpecificFuel(laikinas, tipas);

        rasyti(dataOutput,
                laikinas,
                seniausias,
                naujausias,
                naujesnesNei, senumas,
                specMetuMasinos, senumasMin, senumasMax,
                specMarkesMasinos, marke,
                maxVariklioTuris,
                masinuSkSuSpecFuel, tipas);

    }

    public static void rasyti(String dataOutput,
                              Cars[] obj,
                              Integer[] seniausias,
                              Integer[] naujausias,
                              Integer[] naujesnesNei, Integer senumas,
                              Integer[] specMetuMasinos, Integer senumasMin, Integer senumasMax,
                              Integer[] specMarkesMasinos, String marke,
                              Integer[] maxVariklioTuris,
                              Integer masinuSkSuSpecFuel, Character tipas) {

        try (BufferedWriter output = new BufferedWriter(new FileWriter(dataOutput))) {
            String str = "Database";
            String uzduotis = bruksniuSk(str);
            output.write(uzduotis + "\n");
            for (int i = 0; i < obj.length; i++) {
                output.write(obj[i].toString() + "\n");
            }

            String str1 = "Rasti seniausią mašiną ir ją atspausdinti";
            String uzduotis1 = bruksniuSk(str1);
            output.write(uzduotis1 + "\n");
            if (seniausias.length == 1) {
                output.write("Seniausias automobilis yra: " + obj[seniausias[0]].getGamintojas() + " gamintojo ir jis pagamintas: " + obj[seniausias[0]].getMetai() + " metais.\n");
            } else {
                output.write("Duomenu bazeje yra keli tiek pat seni automobiliai: \n");
                for (int i = 0; i < seniausias.length; i++) {
                    output.write("Seniausias automobilis yra: " + obj[seniausias[i]].getGamintojas() + " gamintojo ir jis pagamintas: " + obj[seniausias[i]].getMetai() + " metais.\n");
                }
            }

            String str2 = "Rasti naujausią mašiną ir ją atspausdinti";
            String uzduotis2 = bruksniuSk(str2);
            output.write(uzduotis2 + "\n");
            if (naujausias.length == 1) {
                output.write("Naujausias automobilis yra: " + obj[naujausias[0]].getGamintojas() + " gamintojo ir jis pagamintas: " + obj[naujausias[0]].getMetai() + " metais.");
            } else {
                output.write("Duomenu bazeje yra keli nauji automobiliai, pagaminti tais pačiais metais: \n");
                for (int i = 0; i < naujausias.length; i++) {
                    output.write("Naujausias automobilis yra: " + obj[naujausias[i]].getGamintojas() + " gamintojo ir jis pagamintas: " + obj[naujausias[i]].getMetai() + " metais.\n");
                }
            }

            String str3 = "Rasti visas mašinas naujesnes nei " + senumas + " metai:";
            String uzduotis3 = bruksniuSk(str3);
            output.write(uzduotis3 + "\n");
            if (naujesnesNei.length == 0) {
                output.write("Naujesniu masinu, nei " + senumas + "metai, duomenu bazeje nera!\n");
            } else {
                output.write("Visos naujesnes, nei: " + senumas + " yra:\n");
                for (int i = 0; i < naujesnesNei.length; i++) {
                    output.write(obj[naujesnesNei[i]].getGamintojas() + "; " + obj[naujesnesNei[i]].getMetai() + ";\n");
                }
            }

            String str4 = "Rasti visas mašinas, kurios yra pagamintos tarp " + senumasMin + " ir " + senumasMax + " metų ir jas atspausdinti";
            String uzduotis4 = bruksniuSk(str4);
            output.write(uzduotis4 + "\n");
            if (specMetuMasinos.length == 0) {
                System.out.println("Tarp nurodytu metu: " + senumasMin + "-" + senumasMax + " duomenu bazeje masinu nera!\n");
            } else{
                for (int i = 0; i < specMetuMasinos.length; i++) {
                    output.write(obj[specMetuMasinos[i]].getGamintojas() + " gamintojo ir buvo pagamintas: " + obj[specMetuMasinos[i]].getMetai() + ";\n");
                }
            }


            String str5 = "Rasti visas " + marke + " markės mašinas ir jas atspausdinti";
            String uzduotis5 = bruksniuSk(str5);
            output.write(uzduotis5 + "\n");
            if (specMarkesMasinos.length == 0) {
                output.write("Tokios markes: '" + marke + "' automobiliu duomenu bazeje nera.");
            } else {
                output.write(marke + " gamintojo masinos esancios duomenu bazeje yra: \n");
                for (int i = 0; i < specMarkesMasinos.length; i++) {
                    output.write(obj[specMarkesMasinos[i]].toString() + "\n");
                }
            }

            String str6 = "Rasti didžiausią variklio tūrį turinčią mašiną ir ją atspausdinti";
            String uzduotis6 = bruksniuSk(str6);
            output.write(uzduotis6 + "\n");
            if (maxVariklioTuris.length == 1) {
                output.write("Didziausias variklio turis yra: " + obj[maxVariklioTuris[0]].toString() + ";\n");
            } else {
                output.write("Yra keli vienodi didziausi variklio turiai: \n");
                for (int i = 0; i < maxVariklioTuris.length; i++) {
                    output.write(obj[maxVariklioTuris[i]].toString() + "\n");
                }
            }

            String str7 = "Rasti " + tipas + " variklį turinčių mašinų kiekį";
            String uzduotis7 = bruksniuSk(str7);
            output.write(uzduotis7 + "\n");
            if (masinuSkSuSpecFuel == 0) {
                output.write("Masinu, kurios naudoja toki kura, duomenu bazeje nera.");
            } else {
                String tarpinis;
                if (tipas.equals('D')) {
                    tarpinis = "dyzeliną";
                } else {
                    tarpinis = "benziną";
                }
                output.write("Duomenu bazeje yra " + masinuSkSuSpecFuel + " masinos, kurios naudoja " + tarpinis + ".");
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Cars[] skaitytiFile(String data) {

        Cars[] allCars = new Cars[0];
        String[] eilutesDuomenys;

        try (BufferedReader br = new BufferedReader(new FileReader(data))) {
            br.readLine();
            String line = br.readLine();
            while (line != null) {
                eilutesDuomenys = line.split(" ");
                Cars temp = new Cars(eilutesDuomenys[0], eilutesDuomenys[1], Integer.parseInt(eilutesDuomenys[2]), Integer.parseInt(eilutesDuomenys[3]), Double.parseDouble(eilutesDuomenys[4]), eilutesDuomenys[5].charAt(0));
                allCars = addCar(allCars, temp);
                line = br.readLine();
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Failas nerastas");
        } catch (Exception e) {
            System.out.println("something happened");
        }
        return allCars;
    }

    public static Cars[] addCar(Cars[] vidTemp, Cars car) {
        vidTemp = Arrays.copyOf(vidTemp, vidTemp.length + 1);
        vidTemp[vidTemp.length - 1] = car;
        return vidTemp;
    }

    public static void spausdinti(Cars[] objektai) {
        for (int i = 0; i < objektai.length; i++) {
            System.out.println(objektai[i].toString());
        }
    }

    public static Integer[] rastiSeniausia(Cars[] obj) {
        Integer seniausias = 9999;
        Integer[] tempArray = new Integer[0];
        for (int i = 0; i < obj.length; i++) {
            if (seniausias >= obj[i].getMetai()) {
                if (seniausias > obj[i].getMetai()) {
                    seniausias = obj[i].getMetai();
                    tempArray = Arrays.copyOf(tempArray, 1);
                    tempArray[0] = i;
                } else {
                    tempArray = pridetiInteger(tempArray, i);
                }
            }
        }
        String str = "Rasti seniausią mašiną ir ją atspausdinti";
        String uzduotis = bruksniuSk(str);
        System.out.println(uzduotis);
        if (tempArray.length == 1) {
            System.out.println("Seniausias automobilis yra: " + obj[tempArray[0]].getGamintojas() + " gamintojo ir jis pagamintas: " + obj[tempArray[0]].getMetai() + " metais.");
        } else {
            System.out.println("Duomenu bazeje yra keli tiek pat seni automobiliai: ");
            for (int i = 0; i < tempArray.length; i++) {
                System.out.println("Seniausias automobilis yra: " + obj[tempArray[i]].getGamintojas() + " gamintojo ir jis pagamintas: " + obj[tempArray[i]].getMetai() + " metais.");
            }
        }
        return tempArray;

    }

    public static Integer[] rastiNaujausia(Cars[] obj) {
        Integer naujausias = 0;
        Integer[] tempArray = new Integer[0];
        for (int i = 0; i < obj.length; i++) {
            if (naujausias <= obj[i].getMetai()) {
                if (naujausias < obj[i].getMetai()) {
                    naujausias = obj[i].getMetai();
                    tempArray = Arrays.copyOf(tempArray, 1);
                    tempArray[0] = i;
                } else {
                    tempArray = pridetiInteger(tempArray, i);
                }
            }
        }
        String str = "Rasti naujausią mašiną ir ją atspausdinti";
        String uzduotis = bruksniuSk(str);
        System.out.println(uzduotis);
        if (tempArray.length == 1) {
            System.out.println("Naujausias automobilis yra: " + obj[tempArray[0]].getGamintojas() + " gamintojo ir jis pagamintas: " + obj[tempArray[0]].getMetai() + " metais.");
        } else {
            System.out.println("Duomenu bazeje yra keli nauji automobiliai, pagaminti tais pačiais metais: ");
            for (int i = 0; i < tempArray.length; i++) {
                System.out.println("Naujausias automobilis yra: " + obj[tempArray[i]].getGamintojas() + " gamintojo ir jis pagamintas: " + obj[tempArray[i]].getMetai() + " metais.");
            }
        }
        return tempArray;

    }

    public static Integer[] rastiNaujesniasNei(Cars[] obj, Integer senumas) {
        Integer[] temp = new Integer[0];
        for (int i = 0; i < obj.length; i++) {
            if (obj[i].getMetai() > senumas) {
                temp = pridetiInteger(temp, i);
            }
        }
        String str = "Rasti visas mašinas naujesnes nei " + senumas + " metai:";
        String uzduotis = bruksniuSk(str);
        System.out.println(uzduotis);
        if (temp.length == 0) {
            System.out.println("Naujesniu masinu, nei " + senumas + "metai, duomenu bazeje nera!");
        } else {
            System.out.println("Visos naujesnes, nei: " + senumas + " yra:");
            for (int i = 0; i < temp.length; i++) {
                System.out.println(obj[temp[i]].getGamintojas() + "; " + obj[temp[i]].getMetai() + ";");
            }
        }


        return temp;
    }

    public static Integer[] pridetiInteger(Integer[] laikinas, Integer vieta) {
        laikinas = Arrays.copyOf(laikinas, laikinas.length + 1);
        laikinas[laikinas.length - 1] = vieta;
        return laikinas;
    }

    public static Integer[] rastiSpecificMetuMasinas(Cars[] obj, Integer senumasMin, Integer senumasMax) {
        Integer[] temp = new Integer[0];
        for (int i = 0; i < obj.length; i++) {
            if (obj[i].getMetai() > senumasMin && obj[i].getMetai() < senumasMax) {
                temp = pridetiInteger(temp, i);
            }
        }
        String str = "Rasti visas mašinas, kurios yra pagamintos tarp " + senumasMin + " ir " + senumasMax + " metų ir jas atspausdinti";
        String uzduotis = bruksniuSk(str);
        System.out.println(uzduotis);

        if (temp.length == 0) {
            System.out.println("Tarp nurodytu metu: " + senumasMin + "-" + senumasMax + " duomenu bazeje masinu nera!\n");
        } else {
            for (int i = 0; i < temp.length; i++) {
                System.out.println(obj[temp[i]].getGamintojas() + " gamintojo ir buvo pagamintas: " + obj[temp[i]].getMetai() + ";");
            }
        }

        return temp;

    }

    public static Integer[] rastiSpecificMarkes(Cars[] obj, String marke) {
        Integer[] temp = new Integer[0];
        for (int i = 0; i < obj.length; i++) {
            if (obj[i].getGamintojas().equals(marke)) {
                temp = pridetiInteger(temp, i);
            }
        }

        String str = "Rasti visas " + marke + " markės mašinas ir jas atspausdinti";
        String uzduotis = bruksniuSk(str);
        System.out.println(uzduotis);
        if (temp.length == 0) {
            System.out.println("Tokios markes: '" + marke + "' automobiliu duomenu bazeje nera.");
        } else {
            System.out.println(marke + " gamintojo masinos esancios duomenu bazeje yra: ");
            for (int i = 0; i < temp.length; i++) {
                System.out.println(obj[temp[i]].toString());
            }
        }
        return temp;

    }

    public static Integer[] rastiMaxVariklioTuri(Cars[] obj) {
        Double temp = 0.0;
        Integer[] vietos = new Integer[0];
        for (int i = 0; i < obj.length; i++) {
            if (obj[i].getVariklioTuris() >= temp) {
                if (obj[i].getVariklioTuris() > temp) {
                    temp = obj[i].getVariklioTuris();
                    vietos = Arrays.copyOf(vietos, 1);
                    vietos[0] = i;
                } else {
                    vietos = pridetiInteger(vietos, i);
                }
            }
        }
        String str = "Rasti didžiausią variklio tūrį turinčią mašiną ir ją atspausdinti";
        String uzduotis = bruksniuSk(str);
        System.out.println(uzduotis);
        if (vietos.length == 1) {
            System.out.println("Didziausias variklio turis yra: " + obj[vietos[0]].toString() + ";");
        } else {
            System.out.println("Yra keli vienodi didziausi variklio turiai: ");
            for (int i = 0; i < vietos.length; i++) {
                System.out.println(obj[vietos[i]].toString());
            }
        }
        return vietos;

    }

    public static Integer rastiSkMasinuSuSpecificFuel(Cars[] obj, Character tipas) {
        Integer temp = 0;
        for (int i = 0; i < obj.length; i++) {
            if (obj[i].getKuroTipas().equals(tipas)) {
                temp++;
            }
        }
        String str = "Rasti " + tipas + " variklį turinčių mašinų kiekį";
        String uzduotis = bruksniuSk(str);
        System.out.println(uzduotis);
        if (temp == 0) {
            System.out.println("Masinu, kurios naudoja toki kura, duomenu bazeje nera.");
        } else {
            String tarpinis;
            if (tipas.equals('D')) {
                tarpinis = "dyzeliną";
            } else {
                tarpinis = "benziną";
            }
            System.out.println("Duomenu bazeje yra " + temp + " masinos, kurios naudoja " + tarpinis + ".");
        }
        return temp;

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
