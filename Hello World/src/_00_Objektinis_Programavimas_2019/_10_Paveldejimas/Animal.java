package _00_Objektinis_Programavimas_2019._10_Paveldejimas;

public class Animal {
    private String klase = "tevine";

    @Override
    public String toString() {
        return getKlase();
    }

    public String getKlase() {
        return klase;
    }

    public void setKlase(String klase) {
        this.klase = klase;
    }
}
