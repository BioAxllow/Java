package _00_Objektinis_Programavimas_2019._10_Paveldejimas;

public class Cow extends Animal{
    private String balsas = "Muuu";

    public String suoFainas() {
        return "suo fainas ir karve";
    }

    @Override
    public String toString() {
        return getKlase() + " " + getBalsas();
    }
//
    public String getBalsas() {
        return balsas;
    }

    public void setBalsas(String balsas) {
        this.balsas = balsas;
    }
}

