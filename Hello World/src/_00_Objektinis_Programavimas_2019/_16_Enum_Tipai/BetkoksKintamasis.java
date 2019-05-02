package _00_Objektinis_Programavimas_2019._16_Enum_Tipai;

public class BetkoksKintamasis<T> {
    private T argumentas;

    public void setArgumentas(T argumentas) {
        this.argumentas = argumentas;
    }

    public T getArgumentas() {
        return argumentas;
    }

    public Integer kartojimasis(T[] masyvas, T skaicius){
        Integer tarp=0;
        for (T tarpinis: masyvas){
            if (skaicius.equals(tarpinis)){
                tarp++;
            }
        }
        return tarp;
    }
}
