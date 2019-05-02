package _00_Objektinis_Programavimas_2019._10_Paveldejimas;

public class Cat extends Animal {
    private String balsas = "Miau";


    @Override
    public String toString() {
        return getKlase() + " " + getBalsas();
    }

    public String getBalsas() {
        return balsas;
    }

    public void setBalsas(String balsas) {
        this.balsas = balsas;
    }


}
