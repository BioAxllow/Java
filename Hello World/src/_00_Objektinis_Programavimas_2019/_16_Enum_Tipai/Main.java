package _00_Objektinis_Programavimas_2019._16_Enum_Tipai;

public class Main {
    public static void main(String[] args) {
        String[] first=new String[]{"Aurimas","Bartas","Cukinja","Bartas"};
        Double[] doub=new Double[]{2.0,3.3,5.5,6.4,2.0,2.0};
        Integer[] intger=new Integer[]{5,8,9,7,1,2,5,5};

        atspausdinti(first);
        System.out.println("\n-----------------");
        atspausdinti(doub);
        System.out.println("\n-----------------");
        atspausdinti(intger);

        BetkoksKintamasis<String> lalal=new BetkoksKintamasis<>();
//        lalal.setArgumentas("\nlaabas");
//        System.out.println(lalal.getArgumentas());
        System.out.println(lalal.kartojimasis(first,"Bartas")+"; Vardas");

        BetkoksKintamasis<Double> doublas=new BetkoksKintamasis<>();
//        doublas.setArgumentas(6.0);
//        System.out.println(doublas.getArgumentas());
        System.out.println(doublas.kartojimasis(doub,2.0)+"; Doublas");

        BetkoksKintamasis<Integer> intas=new BetkoksKintamasis<>();
//        intas.setArgumentas(7);
//        System.out.println(intas.getArgumentas());
        System.out.println(intas.kartojimasis(intger,5)+"; Integeris");


        BendrineKlase<String,String> kkk=new BendrineKlase<>("labbas", "ddddd");
        BendrineKlase<Double,String> kkk1=new BendrineKlase<>(2.0, "ddd555dd");
        System.out.println("------------------------");
        rikiavimas(first);
        atspausdinti(first);
        System.out.println("------------------------");




    }
    public static <E> void atspausdinti(E[] array){
        for (E element: array){
            System.out.printf("%s",element+"; ");
        }
    }

    public static <E extends Comparable<E>> void rikiavimas(E[] masyvas){
        E temp;
        for (int i=0; i<masyvas.length; i++){
            for (int j=i+1; j<masyvas.length; j++){
               if (masyvas[i].compareTo(masyvas[j])>0){
                    temp=masyvas[i];
                    masyvas[i]=masyvas[j];
                    masyvas[j]=temp;
               }
            }
        }
//        for (int i=0; i<masyvas.length; i++){
//            System.out.println(masyvas[i]+"; ");
//        }
    }
}
