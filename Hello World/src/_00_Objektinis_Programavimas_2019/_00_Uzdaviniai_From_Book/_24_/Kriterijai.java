package _00_Objektinis_Programavimas_2019._00_Uzdaviniai_From_Book._24_;

public class Kriterijai {
    private Integer kambariuSkMin;
    private Integer kambariuSkMax;
    private Double kvadraturaMin;
    private Double kvadraturaMax;
    private Double nuomosKainaMin;
    private Double nuomosKainaMax;

    public Kriterijai(Integer kambariuSkMin, Integer kambariuSkMax, Double kvadraturaMin, Double kvadraturaMax, Double nuomosKainaMin, Double nuomosKainaMax) {
        this.kambariuSkMin = kambariuSkMin;
        this.kambariuSkMax = kambariuSkMax;
        this.kvadraturaMin = kvadraturaMin;
        this.kvadraturaMax = kvadraturaMax;
        this.nuomosKainaMin = nuomosKainaMin;
        this.nuomosKainaMax = nuomosKainaMax;
    }

    public Integer getKambariuSkMin() {
        return kambariuSkMin;
    }

    public void setKambariuSkMin(Integer kambariuSkMin) {
        this.kambariuSkMin = kambariuSkMin;
    }

    public Integer getKambariuSkMax() {
        return kambariuSkMax;
    }

    public void setKambariuSkMax(Integer kambariuSkMax) {
        this.kambariuSkMax = kambariuSkMax;
    }

    public Double getKvadraturaMin() {
        return kvadraturaMin;
    }

    public void setKvadraturaMin(Double kvadraturaMin) {
        this.kvadraturaMin = kvadraturaMin;
    }

    public Double getKvadraturaMax() {
        return kvadraturaMax;
    }

    public void setKvadraturaMax(Double kvadraturaMax) {
        this.kvadraturaMax = kvadraturaMax;
    }

    public Double getNuomosKainaMin() {
        return nuomosKainaMin;
    }

    public void setNuomosKainaMin(Double nuomosKainaMin) {
        this.nuomosKainaMin = nuomosKainaMin;
    }

    public Double getNuomosKainaMax() {
        return nuomosKainaMax;
    }

    public void setNuomosKainaMax(Double nuomosKainaMax) {
        this.nuomosKainaMax = nuomosKainaMax;
    }

    @Override
    public String toString(){
      return kambariuSkMin+kambariuSkMax+kvadraturaMin+kvadraturaMax+nuomosKainaMin+nuomosKainaMax+"; \n";
    }
}
