package _00_Objektinis_Programavimas_2019._13_Abstract_Figures;

public class Apskritimas extends Figura {
    private Double krastine;

    public Apskritimas(Double krastine) {
        this.krastine = krastine;
    }

    public Apskritimas() {
    }

    public double perimetras() {
        return 2 * Math.PI * krastine;
    }

    public double perimetras(Double krastine) {
        return 2 * Math.PI * krastine;
    }

    public double plotas(double krastine) {
        return Math.PI * Math.pow(krastine, 2);
    }

    @Override
    public double plotas() {
        return 0;
    }

    @Override
    public double plotuTikrinimas() {
        return 0;
    }

    @Override
    public double perimetruTikrinimas() {
        return 0;
    }

    public double plotuTikrinimas(Double plotas) {
        return perimetras(Math.sqrt(plotas / Math.PI));
    }

    public double perimetruTikrinimas(Double perim) {
        return plotas((perim / (2 * Math.PI)));
    }
}
