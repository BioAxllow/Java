package _00_Objektinis_Programavimas_2019._19_Maps_Streams;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        List<Zmogus> zodynas= new ArrayList<>();
//        zodynas.add(new Zmogus("Aurimas","Jonaitis","11"));
//        zodynas.add(new Zmogus("Mindaugas","Prusaitis","22"));
//        zodynas.add(new Zmogus("Urte","Kanopine","33"));
//        zodynas.add(new Zmogus("Gintare","Griniute","44"));

//        System.out.println(zodynas);

//        Collections.sort(zodynas);
//        System.out.println(zodynas);
//        (o1,o2)-> o1.compareTo

        Map<String,Zmogus> zodynas= new HashMap();
        zodynas.put("11",new Zmogus("Aurimas","Jonaitis","11"));
        zodynas.put("22",new Zmogus("Mindaugas","Prusaitis","22"));
        zodynas.put("33",new Zmogus("Urte","Kanopine","33"));
        zodynas.put("44",new Zmogus("Gintare","Griniute","44"));
        zodynas.put("44",new Zmogus("Gintare","Griniute","44"));
        zodynas.put("44",new Zmogus("Gintare","Griniute","44"));
        zodynas.put("44",new Zmogus("Gintare","Griniute","44"));

        TreeMap<String, Zmogus> treeZodynas = new TreeMap<>(zodynas);
        System.out.println(treeZodynas);


        List<Auromobilis> masinos=new ArrayList<>();
        Auromobilis prim0=new Auromobilis("Aurimas", "Klastauskas", "HKM-197","Lexus");
        Auromobilis prim1=new Auromobilis("Tadas", "Salkauskas", "HKM-187","Mercedes");
        Auromobilis prim2=new Auromobilis("Bartas", "Bernatonis", "PLM-197","Pegueo");
        Auromobilis prim3=new Auromobilis("Evaldas", "Klasta", "HOM-197","Shoda");
        Auromobilis prim4=new Auromobilis("Rimas", "Simasius", "APM-187","Lamborgini");

        Collections.sort(masinos);
        System.out.println(masinos.toString());
        masinos.sort(Comparator.comparing(Auromobilis::getVardas));
        System.out.println(masinos);



        List<Parts> dalys=new ArrayList<>();
        Double[] remontas0=new Double[]{800.0,500.0,250.0,55.99,20.50,1500.0,2.00};
        Double[] remontas1=new Double[]{80.0,950.0,20.0,550.99,200.50};
        Double[] remontas2=new Double[]{1800.0,200.0,50.0,5.99,204.50,150.0, 100.0,20.0,53.20,47.0};
        Double[] remontas3=new Double[]{400.0,100.0,290.0,95.99,420.50,500.0,55.0};
        Double[] remontas4=new Double[]{700.0,4400.0,50.0,45.99,820.50,1900.0};


        dalys.add(new Parts(remontas0,prim0));
        dalys.add(new Parts(remontas1,prim1));
        dalys.add(new Parts(remontas2,prim2));
        dalys.add(new Parts(remontas3,prim3));
        dalys.add(new Parts(remontas4,prim4));



        dalys.forEach(c-> c.toString(c));
        dalys.forEach(y->Arrays.sort(y.getRemontas()));

        dalys.forEach(x-> System.out.println(x.getMasina().getVardas()+" "+x.toString2(x)));
        System.out.println("------------------");
        dalys.forEach(x-> System.out.println(x.getMasina().getVardas()+" vartotojas sumokejo uz remonta "+Arrays.stream(x.getRemontas()).count()+" kartus;"));

    }
}
