package _00_Objektinis_Programavimas_2019._00_Uzdaviniai_From_Book._Uzdaviniai_76psl;

public class Saldainis implements Comparable<Saldainis> {
    private String pavadinimas;
    private Integer skanumoIvertis;

    public Saldainis(String pavadinimas, Integer skanumoIvertis) {
        this.pavadinimas = pavadinimas;
        this.skanumoIvertis = skanumoIvertis;
    }

    public String getPavadinimas() {
        return pavadinimas;
    }

    public void setPavadinimas(String pavadinimas) {
        this.pavadinimas = pavadinimas;
    }

    public Integer getSkanumoIvertis() {
        return skanumoIvertis;
    }

    public void setSkanumoIvertis(Integer skanumoIvertis) {
        this.skanumoIvertis = skanumoIvertis;
    }
    @Override
    public String toString(){
        return pavadinimas+" "+skanumoIvertis+";";
    }

    @Override
    public int compareTo(Saldainis o) {

        return skanumoIvertis.compareTo(o.skanumoIvertis);
    }
}

