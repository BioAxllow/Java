package _00_Objektinis_Programavimas_2019._11_Figutu_Paveldejimas;

public class Trikampis extends Figura implements interfaceTrikampis {

    private Double krastineA;
    private Double krastineB;
    private Double krastineC;

    public Trikampis() {
        this.krastineA = 0.0;
        this.krastineB = 0.0;
        this.krastineC = 0.0;
    }

    public Trikampis(Double krastineA, Double krastineB, Double krastineC) { //kuo skiriasi | nuo ||
        if (krastineA + krastineB <= krastineC || krastineA + krastineC <= krastineB || krastineB + krastineC <= krastineA) {
            System.out.println("Is duotu krastiniu: " + krastineA + "; " + krastineB + "; " + krastineC + "; neimanoma sudaryti trikampio.\n");
        } else {
            this.krastineA = krastineA;
            this.krastineB = krastineB;
            this.krastineC = krastineC;
        }
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

    public Double getKrastineC() {
        return krastineC;
    }

    public void setKrastineC(Double krastineC) {
        this.krastineC = krastineC;
    }

    @Override
    public String toString() {
        return "Perimetras: " + trikampioPerimetras(krastineA, krastineB, krastineC) + "; Plotas: " + getPlotas(krastineA, krastineB, krastineC) + ";";
    }
}
