package _00_Objektinis_Programavimas_2019._00_Uzdaviniai_From_Book._25_Programuotoju_Klase;

public class Kriterijai {
    private Integer maxGrupe;

    public Kriterijai(Integer maxGrupe) {
        this.maxGrupe = maxGrupe;
    }

    public Integer getMaxGrupe() {
        return maxGrupe;
    }

    public void setMaxGrupe(Integer maxGrupe) {
        this.maxGrupe = maxGrupe;
    }

    @Override
    public String toString(){
        return maxGrupe+";";
    }
}
