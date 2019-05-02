package _00_Objektinis_Programavimas_2019._14_Interfaces_;

public class Mainas {
    public static void main(String[] args) {

        Mainas mainMethods = new Mainas();

        Klientas ugnius = new Klientas("LT123", "Ugnius", 5.0);
        ugnius.pridetiSuma(ugnius.getMokejimuSumos(), 10.0);
        ugnius.pridetiSuma(ugnius.getMokejimuSumos(), 20.0);
        ugnius.pridetiSuma(ugnius.getMokejimuSumos(), 5.0);
        mainMethods.spausdinti(ugnius);
        mainMethods.pridetiKlienta(mainMethods.getVisiKlientai(), ugnius);
//        System.out.println(mainMethods.getVisiKlientai()[0].getMokejimuSumos()[0]);

        Klientas aurimas = new Klientas("LT1233", "Aurimas", 50.0);
        aurimas.pridetiSuma(aurimas.getMokejimuSumos(), 800.0);
        aurimas.pridetiSuma(aurimas.getMokejimuSumos(), -200.0);
        aurimas.pridetiSuma(aurimas.getMokejimuSumos(), -500.0);
        aurimas.pridetiSuma(aurimas.getMokejimuSumos(), 200.0);
        aurimas.pridetiSuma(aurimas.getMokejimuSumos(), 300.0);
        mainMethods.spausdinti(aurimas);
        mainMethods.pridetiKlienta(mainMethods.getVisiKlientai(), aurimas);
//
        Klientas romas = new Klientas("LT9233", "Romas", 52.0);
        romas.pridetiSuma(romas.getMokejimuSumos(), 80.0);
        romas.pridetiSuma(romas.getMokejimuSumos(), -5.0);
        romas.pridetiSuma(romas.getMokejimuSumos(), 90.0);
        romas.pridetiSuma(romas.getMokejimuSumos(), 80.0);
        mainMethods.spausdinti(romas);
        mainMethods.pridetiKlienta(mainMethods.getVisiKlientai(), romas);

        Integer daugiausiai = mainMethods.spausdintiMaxAtliktusMokejimus(mainMethods.getVisiKlientai());
        System.out.println("daugiausiai mokejimu atliko: " + (daugiausiai + 1) + "-asis narys, t.y.: " + mainMethods.getVisiKlientai()[daugiausiai].saskaitosTuretojas() + ";");

    }

    Klientas[] visiKlientai = new Klientas[0];

    public Klientas[] getVisiKlientai() {
        return visiKlientai;
    }

    public void spausdinti(Klientas name) {
        System.out.println(name.toString());
        for (int i = 0; i < name.getMokejimuSumos().length; i++) {
            System.out.println(i + "-asis mokejimas: " + name.getMokejimuSumos()[i]);
        }
        System.out.println("-------------End of data----------------");
    }

    public Klientas[] pridetiKlienta(Klientas[] allClients2, Klientas client) {
        if (allClients2.length == 0) {
            visiKlientai = new Klientas[allClients2.length + 1];
            System.arraycopy(allClients2, 0, visiKlientai, 0, allClients2.length);
            visiKlientai[visiKlientai.length - 1] = client;
        } else {
            Integer temp = 0;
            Integer vieta = 0;

            for (int i = 0; i < allClients2.length; i++) {
                if (client.saskaitosNumeris() == allClients2[i].saskaitosNumeris()) {
//                  temp++;
                    vieta = i;
                }
            }
            if (temp > 0) {
                visiKlientai[vieta] = client;
            } else {
                visiKlientai = new Klientas[allClients2.length + 1];
                System.arraycopy(allClients2, 0, visiKlientai, 0, allClients2.length);
                visiKlientai[visiKlientai.length - 1] = client;
            }
        }
        return visiKlientai;
    }

    public Integer spausdintiMaxAtliktusMokejimus(Klientas[] visiClients) {
        Integer kartai = -1;
        Integer vieta = 0;
        for (int i = 0; i < visiClients.length; i++) {
            if (visiClients[i].getMokejimuSumos().length > kartai) {
                kartai = visiClients[i].getMokejimuSumos().length;
                vieta = i;
            }
        }
        return vieta;
    }

//    public Double[] spausdintiVirsijanciusUzVid(){
//
//    }

//    public static void spausdinti(Klientas[] name) {
//        System.out.println(name.toString());
//        for (int i = 0; i < name.length; i++) {
//            System.out.println(i + "-asis mokejimas: " + name[i].getMokejimuSumos()[i]);
//        }
//        System.out.println("-------------End of data----------------");
//    }

}
