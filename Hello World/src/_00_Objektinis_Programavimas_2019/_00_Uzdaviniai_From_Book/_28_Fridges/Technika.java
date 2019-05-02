package _00_Objektinis_Programavimas_2019._00_Uzdaviniai_From_Book._28_Fridges;

public class Technika {
    private String pavadinimasTechnikos;
    private Integer prekesKodas;
    private Integer prekiuSk;
    private Double kaina;

    public Technika(String pavadinimasTechnikos, Integer prekesKodas, Integer prekiuSk, Double kaina) {
        this.pavadinimasTechnikos = pavadinimasTechnikos;
        this.prekesKodas = prekesKodas;
        this.prekiuSk = prekiuSk;
        this.kaina = kaina;
    }

    public String getPavadinimasTechnikos() {
        return pavadinimasTechnikos;
    }

    public void setPavadinimasTechnikos(String pavadinimasTechnikos) {
        this.pavadinimasTechnikos = pavadinimasTechnikos;
    }

    public Integer getPrekesKodas() {
        return prekesKodas;
    }

    public void setPrekesKodas(Integer prekesKodas) {
        this.prekesKodas = prekesKodas;
    }

    public Integer getPrekiuSk() {
        return prekiuSk;
    }

    public void setPrekiuSk(Integer prekiuSk) {
        this.prekiuSk = prekiuSk;
    }

    public Double getKaina() {
        return kaina;
    }

    public void setKaina(Double kaina) {
        this.kaina = kaina;
    }
    @Override
    public String toString(){
        return pavadinimasTechnikos+" "+prekesKodas+" "+prekiuSk+" "+kaina+";";
    }
}
