package _00_Objektinis_Programavimas_2019._18_Lambda_Lists;

import _00_Objektinis_Programavimas_2019._17_Parametrizuotos_Klases_Weekend.Cars;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> listMasyvas= new ArrayList<>();
        listMasyvas.add(1);
        listMasyvas.add(9);
        listMasyvas.add(8);
        listMasyvas.add(6);
        listMasyvas.forEach(f-> f.doubleValue());
//        List<Integer> tarp=;
//        List<Integer> tarp=listMasyvas.forEach(f-> f*2);



        ArrayList<Cars> listTry=new ArrayList<>();
        Cars firstCar=new Cars("mercedes","c220",209,2000,1.0,'B');
        Cars firstCar1=new Cars("mercedes1","c220",2019,200,5.0,'D');
        Cars firstCar2=new Cars("mercedes2","c220",29,20000,3.0,'D');
        listTry.add(firstCar);
        listTry.add(firstCar1);
        listTry.add(firstCar2);

        listTry.forEach(c-> c.setMetai(c.getMetai()*2));
        listTry.forEach(c -> System.out.println(c));


//        System.out.println(listTry.get(1));

    }
}
