package _00_Objektinis_Programavimas_2019._14_Interfaces_;

public class Darbuotojas implements Mokejimas {
    private String saskNr;
    private String vardas;
    private Double cash;

    public Darbuotojas(String saskNr, String vardas, Double cash){
        this.saskNr=saskNr;
        this.vardas=vardas;
        this.cash=cash;
    }

    @Override
    public String saskaitosNumeris() {
        return this.saskNr;
    }

    @Override
    public String saskaitosTuretojas() {
        return vardas;
    }

    @Override
    public Double suma() {
        return cash;
    }

    @Override
    public String toString(){
        return saskNr+" "+vardas+" "+cash;
    }

}
