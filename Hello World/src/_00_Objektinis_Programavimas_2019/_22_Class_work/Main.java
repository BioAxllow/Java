package _00_Objektinis_Programavimas_2019._22_Class_work;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String dataMasinos = new File("").getAbsolutePath() + "\\src\\_00_Objektinis_Programavimas_2019._22_Class_work\\Masinos.txt";
        String dataWorkers = new File("").getAbsolutePath() + "\\src\\_00_Objektinis_Programavimas_2019._22_Class_work\\DarbuotojuDuomenys.txt";
        List<Masina> masinos = skaitytiFileMasina(dataMasinos);
        List<Zmogus> zmones = skaitytiFileZmogus(dataWorkers);

        masinos.forEach(c -> System.out.println(c));
        System.out.println("-------------------------");
        zmones.forEach(c -> System.out.println(c));

    }

    public static List<Masina> skaitytiFileMasina(String data) {

        List<Masina> cars = new ArrayList<>();
        String[] eilutesDuomenys;

        try (BufferedReader br = new BufferedReader(new FileReader(data))) {
            String line = br.readLine();
            while (line != null) {
                eilutesDuomenys = line.split(" ");
                Masina temp = new Masina(eilutesDuomenys[0], eilutesDuomenys[1]);
                cars.add(temp);
                line = br.readLine();
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Failas nerastas");
        } catch (Exception e) {
            System.out.println("something happened");
        }
        return cars;
    }

    public static List<Zmogus> skaitytiFileZmogus(String data) {

        List<Zmogus> zmones = new ArrayList<>();
        String[] eilutesDuomenys;

        try (BufferedReader br = new BufferedReader(new FileReader(data))) {
            String line = br.readLine();
            while (line != null) {
                eilutesDuomenys = line.split(" ");
                String obj3=((eilutesDuomenys.length==3)? eilutesDuomenys[2]:"");
                Zmogus temp = new Zmogus(eilutesDuomenys[0], eilutesDuomenys[1], obj3);
//                Zmogus temp = new Zmogus(eilutesDuomenys[0], eilutesDuomenys[1], ((eilutesDuomenys.length==3)? eilutesDuomenys[2]:""));
                zmones.add(temp);
                line = br.readLine();

            }
        } catch (FileNotFoundException ex) {
            System.out.println("Failas nerastas");
        } catch (Exception e) {
            System.out.println("something happened");
        }
        return zmones;
    }

//    public static Map<String,List<Masina>> gautiMap(List<Zmogus> zmog, List<Masina> masi){
//        Map<String, List<Masina>> ats=new HashMap<>();
//        List<String[]> mhm=new ArrayList<>();
//        String[] random=new String[4];
//
//        for (Masina car: masi) {
//            for (Zmogus person: zmog){
//                    if (car.getCarNr().equals(person.getCarNr())){
//                        String vardas=person.getVardas();
//                        String pavarde=person.getPavarde();
//                        String marke=car.getMarke();
//                        String carNr=car.getCarNr();
//                        random[0]=vardas;
//                        random[1]=pavarde;
//                        random[2]=marke;
//                        random[3]=carNr;
//                        mhm.add(random);
//                    }
//            }
//        }
//
//        return
//    }


}
