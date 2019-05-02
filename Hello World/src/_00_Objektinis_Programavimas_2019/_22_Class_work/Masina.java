package _00_Objektinis_Programavimas_2019._22_Class_work;

public class Masina {
    private String marke;
    private String carNr;

    public Masina(String marke, String carNr) {
        this.marke = marke;
        this.carNr = carNr;
    }

    public String getMarke() {
        return marke;
    }

    public void setMarke(String marke) {
        this.marke = marke;
    }

    public String getCarNr() {
        return carNr;
    }

    public void setCarNr(String carNr) {
        this.carNr = carNr;
    }

    @Override
    public String toString(){
        return marke+"; "+carNr+";";
    }
}
