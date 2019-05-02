package _00_Objektinis_Programavimas_2019._00_Uzdaviniai_From_Book._25_Programuotoju_Klase;

public class Data implements Comparable<Data> {
    private String vardasPavarde;
    private Integer ivertis;

    public Data(String vardasPavarde, Integer ivertis) {
        this.vardasPavarde = vardasPavarde;
        this.ivertis = ivertis;
    }

    public String getVardasPavarde() {
        return vardasPavarde;
    }

    public void setVardasPavarde(String vardasPavarde) {
        this.vardasPavarde = vardasPavarde;
    }

    public Integer getIvertis() {
        return ivertis;
    }

    public void setIvertis(Integer ivertis) {
        this.ivertis = ivertis;
    }

    @Override
    public String toString(){
        return vardasPavarde+" "+ivertis+";";
    }

    @Override
    public int compareTo(Data o) {
        int compare=ivertis.compareTo(o.getIvertis());
        if (compare!=0) return compare;

        return vardasPavarde.compareTo(o.getVardasPavarde());
    }
}
