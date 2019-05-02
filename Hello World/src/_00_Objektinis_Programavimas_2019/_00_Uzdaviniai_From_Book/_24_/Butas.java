package _00_Objektinis_Programavimas_2019._00_Uzdaviniai_From_Book._24_;

public class Butas {
    private Integer butoNr;
    private String adresas;
    private Integer kambSk;
    private Double kvadratura;
    private Double nuomosKaina;

    public Butas(Integer butoNr, String adresas, Integer kambSk, Double kvadratura, Double nuomosKaina) {
        this.butoNr = butoNr;
        this.adresas = adresas;
        this.kambSk = kambSk;
        this.kvadratura = kvadratura;
        this.nuomosKaina = nuomosKaina;
    }

    public Integer getButoNr() {
        return butoNr;
    }

    public void setButoNr(Integer butoNr) {
        this.butoNr = butoNr;
    }

    public String getAdresas() {
        return adresas;
    }

    public void setAdresas(String adresas) {
        this.adresas = adresas;
    }

    public Integer getKambSk() {
        return kambSk;
    }

    public void setKambSk(Integer kambSk) {
        this.kambSk = kambSk;
    }

    public Double getKvadratura() {
        return kvadratura;
    }

    public void setKvadratura(Double kvadratura) {
        this.kvadratura = kvadratura;
    }

    public Double getNuomosKaina() {
        return nuomosKaina;
    }

    public void setNuomosKaina(Double nuomosKaina) {
        this.nuomosKaina = nuomosKaina;
    }

    @Override
    public String toString(){
        return butoNr+" "+adresas+" "+kambSk+" "+kvadratura+" "+nuomosKaina+";\n";
    }
}
