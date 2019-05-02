package _00_Objektinis_Programavimas_2019._14_Interfaces_;

public class Klientas implements Mokejimas {

//    private Double[] masyvas;

    private String saskaitoNumeris;
    private String saskaitosTuretojas;
    private Double suma;
    private Double[] mokejimuSumos = new Double[0];



    public Klientas(String saskaitoNumeris, String saskaitosTuretojas, Double suma) {
        this.saskaitoNumeris = saskaitoNumeris;
        this.saskaitosTuretojas = saskaitosTuretojas;
        this.suma = suma;
        this.mokejimuSumos=pridetiSuma(mokejimuSumos, suma);
    }

//    public Double[] pridetiSuma(Double sumaToAdd){
//        Double[] newMokejimuSumos= new Double[this.mokejimuSumos.length+1];
//        System.arraycopy(mokejimuSumos,0,newMokejimuSumos,0,mokejimuSumos.length);
//        newMokejimuSumos[newMokejimuSumos.length-1]=sumaToAdd;
//        mokejimuSumos=new Double[newMokejimuSumos.length];
//        System.arraycopy(newMokejimuSumos,0,mokejimuSumos,0,newMokejimuSumos.length);
//        return mokejimuSumos;
//    }


    public Double[] pridetiSuma(Double[] mokejimuSumos2, Double sumaToAdd){
        mokejimuSumos= new Double[mokejimuSumos2.length+1];
        System.arraycopy(mokejimuSumos2,0,mokejimuSumos,0,mokejimuSumos2.length);
        mokejimuSumos[mokejimuSumos.length-1]=sumaToAdd;
        return mokejimuSumos;
    }



    public Double[] getMokejimuSumos(){
        return this.mokejimuSumos;
    }

    @Override
    public String saskaitosNumeris() {
        return saskaitoNumeris;
    }

    @Override
    public String saskaitosTuretojas() {
        return saskaitosTuretojas;
    }

    @Override
    public Double suma() {
        return suma;
    }

    @Override
    public String toString(){
        return "Kliento vardas: "+saskaitosTuretojas+"; Kliento saskaita: "+saskaitoNumeris+"\n";
    }

    public String toStringSumos(){
        for (int i=0; i<mokejimuSumos.length; i++){
            System.out.println(mokejimuSumos[i]+"; ");
        }
        return "išspausdinom sumas";
    }
}
