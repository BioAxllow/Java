package _00_Objektinis_Programavimas_2019._00_Uzdaviniai_From_Book._23_Weekend_HW_BasketBall_82psl;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        String scoreString = new File("").getAbsolutePath() + "\\src\\_00_Objektinis_Programavimas_2019._00_Uzdaviniai_From_Book._23_Weekend_HW_BasketBall_82psl\\Score.txt";
        String playersString = new File("").getAbsolutePath() + "\\src\\_00_Objektinis_Programavimas_2019._00_Uzdaviniai_From_Book._23_Weekend_HW_BasketBall_82psl\\Players.txt";

        List<Player> zaidejai = readPlayerTxt(playersString);
        List<Points> taskai = readPlayerPoints(scoreString);

        Map<String, Map<Integer, List<Integer>>> duomenys = susidarytiDuomenuMap(taskai, zaidejai);
        System.out.println(duomenys);

        Map<String, Integer> procTaiklumas = metimuTikslumas(duomenys);
        System.out.println(procTaiklumas);


    }

    public static List<Player> readPlayerTxt(String data) {
        List<Player> players = new ArrayList<>();
        String[] eilutesDuomenys;

        try (BufferedReader br = new BufferedReader(new FileReader(data))) {
            String line = br.readLine();
            while (line != null) {
                eilutesDuomenys = line.split(" ");
                Player temp = new Player(eilutesDuomenys[1], eilutesDuomenys[2], Integer.parseInt(eilutesDuomenys[0]));
                players.add(temp);
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("IOException happened");
        }
        return players;
    }

    public static List<Points> readPlayerPoints(String data) {
        List<Points> score = new ArrayList<>();
        String[] eilutesDuomenys;

        try (BufferedReader br = new BufferedReader(new FileReader(data))) {
            String line = br.readLine();
            while (line != null) {
                eilutesDuomenys = line.split(" ");
                Points temp = new Points(Integer.parseInt(eilutesDuomenys[0]), Integer.parseInt(eilutesDuomenys[1]));
                score.add(temp);
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("IOException happened....");
        }
        return score;
    }

    public static Map<String, Map<Integer, List<Integer>>> susidarytiDuomenuMap(List<Points> pts, List<Player> play) {

        Set<Integer> uniquePlayerNr = new HashSet<>();
        pts.forEach(c -> uniquePlayerNr.add(c.getPlayerNr()));

        Map<Integer, List<Integer>> visiPelnytiTaskai = new HashMap<>();

        for (Integer obj : uniquePlayerNr) {
            List<Integer> visiTaskai = new ArrayList<>();
            for (Points task : pts) {
                if (obj == task.getPlayerNr()) {
                    visiTaskai.add(task.getScore());
                }
            }
            visiPelnytiTaskai.put(obj, visiTaskai);
        }

        Map<String, Map<Integer, List<Integer>>> galutinisMapVaNrTsk = new HashMap<>();
        for (Player player : play) {
            String str = player.getVardas() + " " + player.getPavarde();
            Map<Integer, List<Integer>> tarpinis = new HashMap<>();
            for (Map.Entry<Integer, List<Integer>> mapEach : visiPelnytiTaskai.entrySet()) {
                if (player.getPlayerNr() == mapEach.getKey()) {
                    tarpinis.put(mapEach.getKey(), mapEach.getValue());
                    galutinisMapVaNrTsk.put(str, tarpinis);
                }
            }
        }
        for (Map.Entry<String,Map<Integer,List<Integer>>> ttt: galutinisMapVaNrTsk.entrySet()){
            System.out.println(ttt);
        }

        return galutinisMapVaNrTsk;
    }

    public static Map<String, Integer> metimuTikslumas(Map<String, Map<Integer, List<Integer>>> duomenysAll) {
        Map<String, Integer> taiklumas = new HashMap<>();

        for (Map.Entry<String, Map<Integer, List<Integer>>> mapEach : duomenysAll.entrySet()) {
            String str = mapEach.getKey();
            Integer aim = 0;
            Map<Integer, List<Integer>> taskai = mapEach.getValue();

            for (Map.Entry<Integer, List<Integer>> task : taskai.entrySet()) {
                aim = metimuTaiklumasSkaiciavimas(task.getValue());
            }
            taiklumas.put(str, aim);
        }
        return taiklumas;
    }

    public static Integer metimuTaiklumasSkaiciavimas(List<Integer> intList) {
        Double count = 0.0;
        for (Integer ea : intList) {
            if (ea > 0) {
                count++;
            }
        }
        Double temp = count * 1.0 / intList.size() * 100;
        Integer tempas = temp.intValue();
        return tempas;
    }

//    public static ??? daugiausiaiTaskuPelne(Map<String, Map<Integer, List<Integer>>> duomenysAll){
//        Map<String, Integer> taiklumas = new HashMap<>();
//
//        for (Map.Entry<String, Map<Integer, List<Integer>>> mapEach : duomenysAll.entrySet()) {
//            String str = mapEach.getKey();
//            Integer aim = 0;
//            Map<Integer, List<Integer>> taskai = mapEach.getValue();
//
//            for (Map.Entry<Integer, List<Integer>> task : taskai.entrySet()) {
//                aim = metimuTaiklumasSkaiciavimas(task.getValue());
//            }
//            taiklumas.put(str, aim);
//        }
//        return taiklumas;
//    }

}
