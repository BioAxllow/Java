package _00_Objektinis_Programavimas_2019._20_Date_stack._2nd_Work;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.math.BigDecimal;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        String data = new File("").getAbsolutePath() + "\\src\\_00_Objektinis_Programavimas_2019._20_Date_stack\\_2nd_Work\\Data.txt";
        List<Employee> laikinas = skaitytiFile(data);

        Integer didumasMin = 1000;


        Collections.sort(laikinas);
        laikinas.forEach(c -> System.out.println(c.toString()));
        Collections.sort(laikinas, (o1, o2) -> o1.getDepartamentas().compareTo(o2.getDepartamentas()));
        System.out.println("--------------------------------------------");

        List<Employee> didziausi = gautiDaugiausiaiUzdirbanti(laikinas);
        didziausi.forEach(v -> System.out.println(v.toString()));
        System.out.println("--------------------------------------------");

        List<Employee> didesnesNei = didesnesAlgosNei(laikinas, didumasMin);
        didesnesNei.forEach(x -> System.out.println(x.toString()));
        System.out.println("--------------------------------------------");

        Map<String, Integer> mapMasyvas = rastiDepartamentus(laikinas);
        System.out.println(mapMasyvas);
        System.out.println("--------------------------------------------");

        System.out.println(rastiVienodus(laikinas));
    }

    public static List<Employee> skaitytiFile(String data) {

        List<Employee> darbuotojai = new ArrayList<>();
        String[] eilutesDuomenys;

        try (BufferedReader br = new BufferedReader(new FileReader(data))) {
            String line = br.readLine();
            while (line != null) {
                eilutesDuomenys = line.split(" ");
                Employee temp = new Employee(eilutesDuomenys[0], eilutesDuomenys[1], eilutesDuomenys[2], BigDecimal.valueOf(Double.parseDouble(eilutesDuomenys[3])));
                darbuotojai = addDarbuotojai(darbuotojai, temp);
                line = br.readLine();
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Failas nerastas");
        } catch (Exception e) {
            System.out.println("something happened");
        }
        return darbuotojai;
    }

    public static List<Employee> addDarbuotojai(List<Employee> vidTemp, Employee darb) {
        vidTemp.add(darb);
        return vidTemp;
    }

    public static List<Employee> gautiDaugiausiaiUzdirbanti(List<Employee> obj) {
        List<Employee> temp = new ArrayList<>();
        BigDecimal tempSk = BigDecimal.valueOf(0);
        for (Employee emp : obj) {
            if (emp.getAlga().compareTo(tempSk) >= 0) {
                if (emp.getAlga().compareTo(tempSk) > 0) {
                    tempSk = emp.getAlga();
                    temp.clear();
                    temp.add(emp);
                } else if (emp.getAlga().compareTo(tempSk) == 0) {
                    temp.add(emp);
                }
            }
        }
        return temp;
    }

    public static List<Employee> didesnesAlgosNei(List<Employee> obj, Integer didumasMin) {
        List<Employee> temp = new ArrayList<>();
        for (Employee emp : obj) {
            if (emp.getAlga().compareTo(BigDecimal.valueOf(didumasMin)) > 0) {
                temp.add(emp);
            }
        }
        return temp;
    }

    public static Map<String, Integer> rastiDepartamentus(List<Employee> obj) {
        Map<String, Integer> bandymas = new HashMap();

        List<Employee> departments = new ArrayList<>();

        departments.add(0, obj.get(0));
        for (Employee emp : obj) {
            Integer tempInt = 0;
            for (Employee dep : departments) {
                if (emp.getDepartamentas().compareTo(dep.getDepartamentas()) == 0) {
                    tempInt++;
                }
            }
            if (tempInt <= 1) {
                departments.add(emp);
            }
        }

        for (Employee obje : departments) {
            bandymas.put(obje.getDepartamentas(), 0);
            for (Employee obj2 : obj) {
                if (obje.getDepartamentas().compareTo(obj2.getDepartamentas()) == 0) {
                    bandymas.put(obje.getDepartamentas(), bandymas.get(obje.getDepartamentas()) + 1);
                }
            }
        }
        return bandymas;
    }

    public static Map<Integer, List<Employee>> rastiVienodus(List<Employee> obj) {
        Map<Integer, List<Employee>> bandymas = new HashMap();

        List<Employee> different = new ArrayList<>();

        for (Employee emp1: obj){
            Integer tempInt1=0;

            for (Employee emp2: obj){
                if (emp1.compareTo(emp2)==0);
                tempInt1++;
            }
            Integer tempInt2=0;
            if (tempInt1>1){
                for (Employee diff: different) {
                    if (diff.compareTo(emp1)==0 &&diff!=null){
                        tempInt2++;
                    }
                }
                if (tempInt2<1){
                    different.add(emp1);
                }
            }
        }

        int i = 0;
        for (Employee diff : different) {
            List<Employee> vienodi=new ArrayList<>();
            i++;
            for (Employee emp : obj) {
                if (diff.compareTo(emp) == 0) {
                    vienodi.add(emp);
                }
            }
            bandymas.put(i, vienodi);
        }
        return bandymas;
    }

//    public static List<Employee> rastiVienodus(List<Employee> obj){
//        for (int i = 0; i <obj.size() ; i++) {
//            for (int j = i; j <obj.size() ; j++) {
//                if ()
//
//            }
//        }
//    }
}
