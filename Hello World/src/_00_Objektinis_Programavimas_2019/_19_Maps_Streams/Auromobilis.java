package _00_Objektinis_Programavimas_2019._19_Maps_Streams;

public class Auromobilis implements Comparable<Auromobilis> {
    private String vardas;
    private String pavarde;
    private String numeris;
    private String marke;

    public Auromobilis( String vardas, String pavarde, String numeris, String marke){
        this.vardas=vardas;
        this.pavarde=pavarde;
        this.numeris=numeris;
        this.marke=marke;
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

    public String getNumeris() {
        return numeris;
    }

    public void setNumeris(String numeris) {
        this.numeris = numeris;
    }

    public String getMarke() {
        return marke;
    }

    public void setMarke(String marke) {
        this.marke = marke;
    }

    @Override
    public String toString(){
        return vardas+"; "+pavarde+"; "+numeris+"; "+marke+";";
    }

    @Override
    public int compareTo(Auromobilis obj){
        int compare=vardas.compareTo(obj.vardas);
        if (compare!=0) return compare;

        compare=pavarde.compareTo(obj.pavarde);
        if (compare!=0) return compare;

        compare=numeris.compareTo(obj.numeris);
        if (compare!=0) return compare;

        return marke.compareTo(obj.marke);

    }
}
