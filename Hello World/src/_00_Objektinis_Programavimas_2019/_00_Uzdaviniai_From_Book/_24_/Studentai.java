package _00_Objektinis_Programavimas_2019._00_Uzdaviniai_From_Book._24_;

public class Studentai {
    private String vardas;
    private String pavarde;
    private String grupe;

    public Studentai(String vardas, String pavarde, String grupe) {
        this.vardas = vardas;
        this.pavarde = pavarde;
        this.grupe = grupe;
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

    public String getGrupe() {
        return grupe;
    }

    public void setGrupe(String grupe) {
        this.grupe = grupe;
    }
}
