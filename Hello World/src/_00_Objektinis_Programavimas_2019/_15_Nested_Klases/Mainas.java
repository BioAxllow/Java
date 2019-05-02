package _00_Objektinis_Programavimas_2019._15_Nested_Klases;

import _00_Objektinis_Programavimas_2019._13_Abstract_Figures._Abstract_Aditional_Work.AtlyginimaiVisi;

public class Mainas {
    public static void main(String[] args) {

        Emploee naujas0 = new Emploee("Aurimas", 1300d, "Kaišiadorys", "Gediminas", 9);
        Emploee naujas1 = new Emploee("Paulius", 700d, "Kaišiadorys", "Vytauto", 9);
        Emploee naujas2 = new Emploee("Mindaugas", 1300d, "Kaišiadorys", "Vytauto", 8);
        Emploee naujas3 = new Emploee("Petras", 600d, "Vilnius", "Kosciuskos", 20);
        Emploee naujas4 = new Emploee("Rokas", 2400d, "Kaunas", "Laisves", 3);
        Emploee[] masyvasNauju = new Emploee[]{naujas0, naujas1, naujas2, naujas3, naujas4};
        System.out.println(skirtinguMiestuSk(masyvasNauju));
        System.out.println(skirtinguMiestuIrGatbiuSk(masyvasNauju));

//        Emploee.Address labas= new Emploee.Address("Kaunas","Prano",20);
//        System.out.println(labas.getNr2());

        Atlyginimai salary=new Atlyginimai() {
            @Override
            public Double alga(Emploee darbuotojas, Double times) {
                return darbuotojas.getAtlyginimas()*times/100.0+darbuotojas.getAtlyginimas();
            }
        };

        System.out.println(salary.alga(naujas0, 10.0));

        Atlyginimai salary1=new Atlyginimai() {
            @Override
            public Double alga(Emploee darbuotojas, Double priedelis) {
                return darbuotojas.getAtlyginimas()+priedelis;
            }
        };

        System.out.println(salary1.alga(naujas0,50.0));

        AtlyginimaiVisi visi=new AtlyginimaiVisi() {
            @Override
            public Double[] algaVisiems(Emploee[] darbuotojai, Double times) {
                Double[] tarp=new Double[darbuotojai.length+1];
                tarp[0]=times;
                for (int i=1; i<darbuotojai.length+1; i++){
                    tarp[i]=darbuotojai[i-1].getAtlyginimas()*times/100+darbuotojai[i-1].getAtlyginimas();
                }
                return tarp;
            }
        };
        Double[] pakeltiVisiAtlyginimai=visi.algaVisiems(masyvasNauju,90.0);

        System.out.println("--------------Padidintos algos: "+pakeltiVisiAtlyginimai[0]+"%--------------");

        for (int i=1; i<pakeltiVisiAtlyginimai.length; i++){
            System.out.println(pakeltiVisiAtlyginimai[i]+";");
        }

        System.out.printf("vardas %.2f ;pavarde: %.2f fkgkflajgjfklgjkfl",55.2222,66.3333);
        System.out.printf("vardas %.2f ...%%"+pakeltiVisiAtlyginimai[0]+";pavarde: %.2f fkgkflajgjfklgjkfl",55.2222,66.3333);


    }



    public static Integer skirtinguMiestuSk(Emploee[] nariai) {
        String[] temp = new String[nariai.length];
        temp[0] = nariai[0].getCityMain();
        Integer indeks = 0;
        for (int i = 0; i < nariai.length; i++) {
            Integer pasikartojimuSK = 0;
            for (int j = 0; j < temp.length; j++) {
                if (nariai[i].getCityMain().equals(temp[j])) {
                    pasikartojimuSK++;
                }
            }
            if (pasikartojimuSK == 0) {
                indeks++;
                temp[indeks] = nariai[i].getCityMain();
            }
        }
        Integer ras = 0;
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] != null) {
                ras++;
            }
        }
        return ras;
    }




    public static Integer skirtinguMiestuIrGatbiuSk(Emploee[] nariai) {
        String[] miestai = new String[nariai.length];
        String[] gatves = new String[nariai.length];
        miestai[0] = nariai[0].getCityMain();
        gatves[0] = nariai[0].getStreet();
        Integer indeks = 0;
        for (int i = 0; i < nariai.length; i++) {
            Integer pasikartojimuSK = 0;
            for (int j = 0; j < miestai.length; j++) {
                if (nariai[i].getCityMain().equals(miestai[j]) && nariai[i].getStreet().equals(gatves[j])) {
                    pasikartojimuSK++;
                }
            }
            if (pasikartojimuSK == 0) {
                indeks++;
                miestai[indeks] = nariai[i].getCityMain();
                gatves[indeks] = nariai[i].getStreet();
            }
        }
        Integer ras = 0;
        for (int i = 0; i < miestai.length; i++) {
            if (miestai[i] != null) {
                ras++;
            }
        }
        return ras;
    }




}
