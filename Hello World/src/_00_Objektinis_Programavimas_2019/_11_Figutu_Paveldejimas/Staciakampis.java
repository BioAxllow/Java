package _00_Objektinis_Programavimas_2019._11_Figutu_Paveldejimas;

public class Staciakampis extends Figura implements interfaceStaciakampis {

    private Double krastineA;
    private Double krastineB;

    public Staciakampis() {
        this.krastineA = 0.0;
        this.krastineB = 0.0;
    }

    public Staciakampis(Double krastineA, Double krastineB) {
        this.krastineA = krastineA;
        this.krastineB = krastineB;
    }

    public Double getKrastineA() {
        return krastineA;
    }

    public void setKrastineA(Double krastineA) {
        this.krastineA = krastineA;
    }

    public Double getKrastineB() {
        return krastineB;
    }

    public void setKrastineB(Double krastineB) {
        this.krastineB = krastineB;
    }



    @Override
    public String toString() {
        return "Perimetras: " + sraciakampioPerimetras(krastineA,krastineB) + "; Plotas: " + getPlotas(krastineA,krastineB) + ";";
    }
}
