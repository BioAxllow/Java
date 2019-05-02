package _00_Objektinis_Programavimas_2019._20_Date_stack;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Saskaita> masyvas=new ArrayList<>();
        Saskaita first0=new Saskaita("Aurimas", LocalDate.parse("2015-02-04"), BigDecimal.valueOf(500.0));
        Saskaita first1=new Saskaita("Rokas", LocalDate.parse("2002-05-04"), BigDecimal.valueOf(1500.0));
        Saskaita first2=new Saskaita("Tomas", LocalDate.parse("2005-02-04"), BigDecimal.valueOf(2000.0));
        Saskaita first3=new Saskaita("Bartas", LocalDate.parse("2005-10-14"), BigDecimal.valueOf(88));
        Saskaita first4=new Saskaita("Tadas", LocalDate.parse("2006-02-24"), BigDecimal.valueOf(77));
        Saskaita first5=new Saskaita("Rasa", LocalDate.parse("2005-12-05"), BigDecimal.valueOf(5070.0));
        Saskaita first6=new Saskaita("Mindaugas", LocalDate.parse("2008-07-04"), BigDecimal.valueOf(5300.0));

        masyvas.add(first0);
        masyvas.add(first1);
        masyvas.add(first2);
        masyvas.add(first3);
        masyvas.add(first4);
        masyvas.add(first5);
        masyvas.add(first6);

        spausdinti(masyvas);
        Map<Integer,Double> laikinas=atrinktiSaskaitas(masyvas);
        System.out.println(laikinas);






    }
    public static void spausdinti(List<Saskaita> obj){
        for (Saskaita sss: obj) {
            System.out.println(sss);
        }
    }

    public static Map<Integer,Double> atrinktiSaskaitas(List<Saskaita> obj){
        Map<Integer,Double> temp=new HashMap<>();
        temp.put(1,0.0);
        temp.put(2,0.0);
        temp.put(3,0.0);
        temp.put(4,0.0);

        for (Saskaita sss: obj) {

                switch (sss.getSasaitosDate().getMonthValue()){
                    case 1:
                    case 2:
                    case 3:{
//                        temp.put(1, temp.containsKey(1)?temp.get(1):temp.put(1,0.0)+sss.getSuma().doubleValue()); ??
//                        temp.put(1, temp.get(1)+sss.getSuma().doubleValue());
                        pridedtiReiksmeMap(temp,sss,1);
                        break;
                    }
                    case 4:
                    case 5:
                    case 6:{
//                        temp.put(2, temp.get(2)+sss.getSuma().doubleValue());
                        pridedtiReiksmeMap(temp,sss,2);
                        break;
                    }
                    case 7:
                    case 8:
                    case 9:{
//                        temp.put(3, temp.get(3)+sss.getSuma().doubleValue());
                        pridedtiReiksmeMap(temp,sss,3);
                        break;
                    }
                    default:{
                       pridedtiReiksmeMap(temp,sss,4);
                        break;
                    }
                }
        }

        return temp;
    }

    public static void pridedtiReiksmeMap(Map<Integer,Double> mapas, Saskaita obj, Integer caseNr){
                     mapas.put(caseNr, mapas.get(caseNr)+obj.getSuma().doubleValue());
    }
}
