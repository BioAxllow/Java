package _00_Objektinis_Programavimas_2019._11_Figutu_Paveldejimas;

public class Kvadratas extends Figura implements interfaceKvadratas {

    private Double krastine;

    public Kvadratas() {
        this.krastine = 0.0;
    }

    public Double getKrastine() {
        return krastine;
    }

    public void setKrastine(Double krastine) {
        this.krastine = krastine;
    }

    public Kvadratas(Double krastine) {
        this.krastine = krastine;
    }

    @Override
    public String toString() {
        return "Perimetras: " + perimetras(krastine) + "; Plotas: " + getPlotas(krastine) + ";";
    }
}
