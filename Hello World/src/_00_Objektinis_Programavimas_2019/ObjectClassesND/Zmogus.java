package _00_Objektinis_Programavimas_2019.ObjectClassesND;

public class Zmogus {
    private String vardas;
    private String pavarde;
    private Integer amzius;
    private String profesija;

    public Zmogus(String vardas, String pavarde, Integer amzius, String profesija){
        this.vardas=vardas;
        this.pavarde=pavarde;
        this.amzius=amzius;
        this.profesija=profesija;
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

    public Integer getAmzius() {
        return amzius;
    }

    public void setAmzius(Integer amzius) {
        this.amzius = amzius;
    }

    public String getProfesija() {
        return profesija;
    }

    public void setProfesija(String profesija) {
        this.profesija = profesija;
    }

    @Override
    public String toString() {
        return "Vardas: " + getVardas() + " Pavarde: " + getPavarde()
                + " Amzius: " + getAmzius() + " Profesija: " +getProfesija() +"\n";
    }

}
