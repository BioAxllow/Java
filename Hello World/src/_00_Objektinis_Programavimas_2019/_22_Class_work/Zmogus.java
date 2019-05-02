package _00_Objektinis_Programavimas_2019._22_Class_work;

public class Zmogus {
    private String vardas;
    private String pavarde;
    private String carNr;

    public Zmogus(String vardas, String pavarde, String carNr) {
        this.vardas = vardas;
        this.pavarde = pavarde;
        this.carNr = carNr;
    }

    public String getVardas() {
        return vardas;
    }

    public void setVardas(String vardas) {
        this.vardas = vardas;
    }

    public String getPavarde() {
        return pavarde;
    }

    public void setPavarde(String pavarde) {
        this.pavarde = pavarde;
    }

    public String getCarNr() {
        return carNr;
    }

    public void setCarNr(String carNr) {
        this.carNr = carNr;
    }

    @Override
    public String toString(){
        return vardas+"; "+pavarde+"; "+carNr+";";
    }
}
