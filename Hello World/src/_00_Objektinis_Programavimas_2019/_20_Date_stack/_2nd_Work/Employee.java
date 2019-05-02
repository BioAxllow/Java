package _00_Objektinis_Programavimas_2019._20_Date_stack._2nd_Work;

import java.math.BigDecimal;

public class Employee implements Comparable<Employee> {
    private String vardas;
    private String pavarde;
    private String departamentas;
    private BigDecimal alga;

    public Employee(String vardas, String pavarde, String departamentas, BigDecimal alga) {
        this.vardas = vardas;
        this.pavarde = pavarde;
        this.departamentas = departamentas;
        this.alga = alga;
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

    public String getDepartamentas() {
        return departamentas;
    }

    public void setDepartamentas(String departamentas) {
        this.departamentas = departamentas;
    }

    public BigDecimal getAlga() {
        return alga;
    }

    public void setAlga(BigDecimal alga) {
        this.alga = alga;
    }

    @Override
    public String toString(){
        return vardas+"; "+pavarde+"; "+departamentas+"; "+alga+";";
    }

//    @Override
    public int compareTo(Employee o) {

        int temp=vardas.compareTo(o.getVardas());
        if (temp!=0) return temp;

        temp=pavarde.compareTo(o.getPavarde());
        if (temp!=0) return temp;

        temp=departamentas.compareTo(o.getDepartamentas());
        if (temp!=0) return temp;

        return alga.compareTo(o.getAlga());
    }


}
