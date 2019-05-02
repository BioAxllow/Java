package _00_Objektinis_Programavimas_2019._13_Abstract_Figures;

public class Trikampis extends Figura {

    private Double krastine;

    public Trikampis(Double krastine){
        this.krastine=krastine;
    }

    public Trikampis(){

    }

    @Override
    public double perimetras() {
        return 3*krastine;
    }
    public double perimetras(Double krastine) {
        return 3*krastine;
    }

    @Override
    public double plotas() {
        return Math.sqrt(0.1875)*Math.pow(krastine,2);
    }

    public double plotas(double krastine){
        return Math.sqrt(0.1875)*Math.pow(krastine,2);
    }

    @Override
    public double plotuTikrinimas() {
        return perimetras();
    }

    @Override
    public double perimetruTikrinimas() {
        return 0;
    }

    public double perimetruTikrinimas(Double plotas){
        return plotas(plotas/3);
    }

    public double plotuTikrinimas(Double plotas) {
        return perimetras(Math.sqrt(plotas/Math.sqrt(0.1875)));
    }
}
