package _00_Objektinis_Programavimas_2019._13_Abstract_Figures._Abstract_Aditional_Work;

public abstract class Zmogus {
    private String vardas;
    private String pavarde;
    private Integer amzius;

    public abstract String toString();

    public Zmogus(String vardas, String pavarde, Integer amzius) {
        this.vardas = vardas;
        this.pavarde = pavarde;
        this.amzius = amzius;
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

}
