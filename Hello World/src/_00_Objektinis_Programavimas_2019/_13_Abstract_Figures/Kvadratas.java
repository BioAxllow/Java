package _00_Objektinis_Programavimas_2019._13_Abstract_Figures;

public class Kvadratas extends Figura{
    private double krastine;

    public Kvadratas(Double krastine){
        this.krastine=krastine;
    }

    public double getKrastine() {
        return krastine;
    }

    public Kvadratas(){}

    public void setKrastine(double krastine) {
        this.krastine = krastine;
    }



    public double perimetras() {
        return 4*krastine;
    }
    public double perimetras(Double krastine2) {
        return 4*krastine2;
    }

    @Override
    public double plotas() {
        return krastine*krastine;
    }

    public double plotas(Double krastine){
        return krastine*krastine;
    }

    @Override
    public double plotuTikrinimas() {
        return 0;
    }

    @Override
    public double perimetruTikrinimas() {
        return 0;
    }

    public double perimetruTikrinimas(double plotas){
        return plotas(plotas/4);
    }

    public double plotuTikrinimas(Double plotas) {
        return perimetras(Math.sqrt(plotas));
    }


}
