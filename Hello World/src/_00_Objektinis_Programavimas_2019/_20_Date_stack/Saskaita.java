package _00_Objektinis_Programavimas_2019._20_Date_stack;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Saskaita {
    private String vardas;
    private LocalDate sasaitosDate;
    private BigDecimal suma;

    public Saskaita(String vardas, LocalDate sasaitosDate, BigDecimal suma) {
        this.vardas = vardas;
        this.sasaitosDate = sasaitosDate;
        this.suma = suma;
    }

    public String getVardas() {
        return vardas;
    }

    public void setVardas(String vardas) {
        this.vardas = vardas;
    }

    public LocalDate getSasaitosDate() {
        return sasaitosDate;
    }

    public void setSasaitosDate(LocalDate sasaitosDate) {
        this.sasaitosDate = sasaitosDate;
    }

    public BigDecimal getSuma() {
        return suma;
    }

    public void setSuma(BigDecimal suma) {
        this.suma = suma;
    }

    @Override
    public String toString(){
        return vardas+"; "+sasaitosDate+"; "+suma+";";
    }
}
