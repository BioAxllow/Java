package _00_Objektinis_Programavimas_2019._00_Uzdaviniai_From_Book._23_Weekend_HW_BasketBall_82psl._2nd_Try;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        String scoreString = new File("").getAbsolutePath() + "\\src\\_00_Objektinis_Programavimas_2019._00_Uzdaviniai_From_Book._23_Weekend_HW_BasketBall_82psl\\Score.txt";
        String playersString = new File("").getAbsolutePath() + "\\src\\_00_Objektinis_Programavimas_2019._00_Uzdaviniai_From_Book._23_Weekend_HW_BasketBall_82psl\\Players.txt";
        String dataOutput = new File("").getAbsolutePath() + "\\src\\_00_Objektinis_Programavimas_2019._00_Uzdaviniai_From_Book._23_Weekend_HW_BasketBall_82psl\\_2nd_Try\\Rezultatai.txt";

        List<Player2> zaidejai = readPlayerTxt(playersString);
        Map<Integer, Statistika> taskai = readPlayerPoints(scoreString, zaidejai);
        Collections.sort(zaidejai);

        Map<String, Statistika> geriausi = rastiGeriausius(taskai);

        rasyti(dataOutput, zaidejai, taskai, geriausi);


    }

    public static List<Player2> readPlayerTxt(String data) {
        List<Player2> player2s = new ArrayList<>();
        String[] eilutesDuomenys;

        try (BufferedReader br = new BufferedReader(new FileReader(data))) {
            String line = br.readLine();
            while (line != null) {
                eilutesDuomenys = line.split(" ");
                Player2 temp = new Player2(eilutesDuomenys[1], eilutesDuomenys[2], Integer.parseInt(eilutesDuomenys[0]));
                player2s.add(temp);
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("IOException happened");
        }
        return player2s;
    }

    public static Map<Integer, Statistika> readPlayerPoints(String data, List<Player2> zaidejai) {
        Map<Integer, Statistika> scores = new HashMap<>();
        String[] eilutesDuomenys;

        try (BufferedReader br = new BufferedReader(new FileReader(data))) {
            String line = br.readLine();
            while (line != null) {
                eilutesDuomenys = line.split(" ");

                if (zaidejai.contains(eilutesDuomenys[0])) {

                }else{
                    line=br.readLine();
                }

                Integer taskas = Integer.parseInt(eilutesDuomenys[1]);
                Integer zaidejoNr = Integer.parseInt(eilutesDuomenys[0]);
                Statistika temp = new Statistika(zaidejoNr, 0, 0, 0, 0);

                if (scores.containsKey(zaidejoNr)) {
                    Statistika stat = scores.get(zaidejoNr);
                    if (taskas == 0) {
                        stat.setNepataikyti(stat.getNepataikyti() + 1);
                    } else if (taskas == 1) {
                        stat.setBaudos(stat.getBaudos() + 1);
                    } else if (taskas == 2) {
                        stat.setDvitaskiai(stat.getDvitaskiai() + 1);
                    } else if (taskas == 3) {
                        stat.setTritaskiai(stat.getTritaskiai() + 1);
                    }
                    stat.setAllPoints();
                    stat.setTaiklumas();
                } else {
                    scores.put(zaidejoNr, temp);
                    Statistika stat = scores.get(zaidejoNr);
                    if (taskas == 0) {
                        stat.setNepataikyti(stat.getNepataikyti() + 1);
                    } else if (taskas == 1) {
                        stat.setBaudos(stat.getBaudos() + 1);
                    } else if (taskas == 2) {
                        stat.setDvitaskiai(stat.getDvitaskiai() + 1);
                    } else if (taskas == 3) {
                        stat.setTritaskiai(stat.getTritaskiai() + 1);
                    }
                    stat.setAllPoints();
                    stat.setTaiklumas();
                }

                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("IOException happened....");
        }
        return scores;
    }

    public static Map<String, Statistika> rastiGeriausius(Map<Integer, Statistika> allData) {
        Map<String, Statistika> geriausi = new HashMap<>();
        Integer max3pointers = 0;
        Integer maxPoints = 0;
        Double bestAim = 0.0;

        for (Map.Entry<Integer, Statistika> singlePlayerData : allData.entrySet()) {
            if (singlePlayerData.getValue().getAllPoints() > maxPoints) {
                maxPoints = singlePlayerData.getValue().getAllPoints();
                geriausi.put("Daugiausiai taškų pelnė: ", singlePlayerData.getValue());
            }
            if (singlePlayerData.getValue().getTritaskiai() > max3pointers) {
                max3pointers = singlePlayerData.getValue().getTritaskiai();
                geriausi.put("Daugiausiai įmetė tritaškių: ", singlePlayerData.getValue());
            }
            if (singlePlayerData.getValue().getTaiklumas() > bestAim) {
                bestAim = singlePlayerData.getValue().getTaiklumas();
                geriausi.put("Taikliausias: ", singlePlayerData.getValue());
            }
        }
        return geriausi;
    }

    public static void rasyti(String dataOutput, List<Player2> zaidejai, Map<Integer, Statistika> taskai, Map<String, Statistika> geriausi) {

        try (BufferedWriter output = new BufferedWriter(new FileWriter(dataOutput))) {

            output.write(stars() + "\n");
            output.write(stulpNrtarpai("Nr.", 6) + stulpNrtarpai("Vardas Pavarde", 25) +
                    stulpNrtarpai("Baudos", 12) + stulpNrtarpai("Dvit.", 12) +
                    stulpNrtarpai("Trit.", 12) + stulpNrtarpai("Taškai", 12) +
                    stulpNrtarpai("Nepat.", 12) + stulpNrtarpai("Tikslumas", 12) + "|\n");
            output.write(stars() + "\n");

            for (Player2 zaidejas : zaidejai) {
                for (Map.Entry<Integer, Statistika> stats : taskai.entrySet()) {
                    if (zaidejas.getPlayerNr() == stats.getKey()) {

                        output.write(stulpNrtarpaiInt(stats.getKey(), 6) +
                                stulpNrtarpai(zaidejas.getVardas() + " " + zaidejas.getPavarde(), 25) +
                                stulpNrtarpaiInt(stats.getValue().getBaudos(), 12)
                                + stulpNrtarpaiInt(stats.getValue().getDvitaskiai(), 12) +
                                stulpNrtarpaiInt(stats.getValue().getTritaskiai(), 12)
                                + stulpNrtarpaiInt(stats.getValue().getAllPoints(), 12) +
                                stulpNrtarpaiInt(stats.getValue().getNepataikyti(), 12)
                                + stulpNrtarpaiDouble(stats.getValue().getTaiklumas(), 12) + "|\n");
                    }
                }
            }
            output.write(stars() + "\n");

            for (Map.Entry<String, Statistika> geriausias : geriausi.entrySet()) {
                Integer laik;
                if (geriausias.getKey().contains("taškų")){
                    laik=0;
                }else if (geriausias.getKey().contains("įmetė")){
                    laik=1;
                }else if(geriausias.getKey().contains("kliaus")){
                    laik=2;
                }else{
                    System.out.println("rewrtie the code");
                    laik=0;
                }

                for (Player2 zaidejas : zaidejai) {
                    Double spaus;
                    if (geriausias.getValue().getPlayerNr() == zaidejas.getPlayerNr()) {
                        if (laik==0){
                            spaus=geriausias.getValue().getAllPoints()*1.0;
                        }else if (laik==1){
                            spaus=geriausias.getValue().getTritaskiai()*1.0;
                        }else if (laik==2){
                            spaus=geriausias.getValue().getTaiklumas()*1.0;
                        }else{
                            System.out.println(" you messed up!");
                            spaus=0.0;
                        }
                        output.write(rikiavimasStringIsDesines(geriausias.getKey(), 50) +
                                stulpNrtarpaiInt(geriausias.getValue().getPlayerNr(), 6) +
                                rikiavimasStringIsDesines(zaidejas.getVardas()+" "+zaidejas.getPavarde(),25)+
                                stulpNrtarpaiDouble(spaus,13)+"\n");
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String stars() {
        String star = "*";
        for (int i = 0; i < 119; i++) {
            star += "*";
        }
        return star;
    }

    public static String stulpNrtarpai(String zodziai, Integer maxIlgis) {
        String laikinas = " ";
        for (int i = 0; i < (maxIlgis - zodziai.length()) - 2; i++) {
            laikinas += " ";
        }
        String galutinis = "|  " + zodziai + laikinas;
        return galutinis;
    }

    public static String stulpNrtarpaiInt(Integer zodziai, Integer maxIlgis) {
        String laikinas = " ";
        String zodziai2 = Integer.toString(zodziai);
        for (int i = 0; i < (maxIlgis - zodziai2.length()) - 2; i++) {
            laikinas += " ";
        }
        String galutinis = "|  " + zodziai2 + laikinas;
        return galutinis;
    }

    public static String stulpNrtarpaiDouble(Double zodziai, Integer maxIlgis) {
        String laikinas = " ";
        String zodziai2 = Double.toString(zodziai);
        if (zodziai2.length() > 10) {
            zodziai2 = zodziai2.substring(0, 5);
        }

        for (int i = 0; i < (maxIlgis - zodziai2.length()) - 2; i++) {
            laikinas += " ";
        }
        String galutinis = "|  " + zodziai2 + laikinas;
        return galutinis;
    }

    public static String rikiavimasStringIsDesines(String zodziai, Integer maxIlgis) {
        String laikinas = " ";
        for (int i = 0; i < (maxIlgis - zodziai.length() - 1); i++) {
            laikinas += " ";
        }
        return laikinas + zodziai + ": ";
    }

}
