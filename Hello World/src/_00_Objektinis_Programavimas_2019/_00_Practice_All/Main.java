package _00_Objektinis_Programavimas_2019._00_Practice_All;

import _00_Objektinis_Programavimas_2019._20_Date_stack._2nd_Work.Employee;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] a = {1,2,3};
        System.out.println(a[0]+"; "+a[1]+"; "+a[2]+";");
        changeValue(a);
        System.out.println(a[0]+"; "+a[1]+"; "+a[2]+";");
        addInteger(a,1);
        System.out.println(a[0]+"; "+a[1]+"; "+a[2]+";");
//        System.out.println(a[0]+"; "+a[1]+"; "+a[2]+"; "+a[3]+";");

        String ab = "Labas";
        String b = ab;
        changeString(ab);
        System.out.println(ab);

        Date lalal= new Date();
        System.out.println(lalal);

        Integer[] inte=new Integer[]{1,2,3,2,4,5};
        String[] str=new String[]{"Labas","Labas","Labas2","Labas","Labas","Labas","Labas1"};

        System.out.println(str[0].contains("as"));
        List<String> las=new ArrayList<>();
        las.add("labas");
        las.add("labas1");
        las.add("labas");
        las.add("labas2");
        las.add("labas");
        System.out.println(las.contains("labas1"));

        Employee la=new Employee("Aur","Kla", "Tur1", BigDecimal.valueOf(1000));
        Employee la1=new Employee("Aur1","Kla1", "Tur2", BigDecimal.valueOf(1000));
        Employee la2=new Employee("Aur2","Kla", "Tur", BigDecimal.valueOf(1000));

        List<Employee> kkk=new ArrayList<>();
        kkk.add(la);
        kkk.add(la1);
        kkk.add(la2);

        System.out.println(kkk.contains(la));

        Scanner scan= new Scanner(System.in);

        String zod="Max";
        String zodis=scan.next();

        if (zod.equals(zodis)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }


    }



    private static void changeValue(int[] array2){
        array2[0]=4;
    }

    private static void addInteger(int[] array, int add){
//        array= Arrays.copyOf(array,array.length+1);
//        array[array.length-1]=add;
//        array[3]=add;
        array[2]=add;
    }

    public static void mainArgumentuCycle(Integer[][] args, Integer[] indexLocationsArray, Integer argumentLocation){
        args[argumentLocation]=new Integer[indexLocationsArray.length];
        for (int i=0; i< indexLocationsArray.length; i++){
            args[argumentLocation][i]=indexLocationsArray[i];
        }
    }

    private static void changeString(String a){
        a = a + " vakaras";
        System.out.println(a);
    }





}
