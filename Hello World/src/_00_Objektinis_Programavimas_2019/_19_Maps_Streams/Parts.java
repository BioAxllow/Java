package _00_Objektinis_Programavimas_2019._19_Maps_Streams;

public class Parts {
    private Double[] remontas;
    private Auromobilis masina;
    public Parts(Double[] remontas, Auromobilis masina){
        this.remontas=remontas;
        this.masina=masina;
    }

    public Double[] getRemontas() {
        return remontas;
    }

    public void setRemontas(Double[] remontas) {
        this.remontas = remontas;
    }

    public Auromobilis getMasina() {
        return masina;
    }

    public void setMasina(Auromobilis masina) {
        this.masina = masina;
    }

    public String toString2(Parts obj){
        String temp="";
        for (int i = 0; i <obj.getRemontas().length ; i++) {
            temp+=obj.getRemontas()[i]+"; ";
        }
        return temp;
    }
    public void toString(Parts obj){

            for (int i = 0; i <obj.getRemontas().length ; i++) {
                System.out.println(remontas[i]+" ");
            }
            System.out.println(" kainos; "+obj.getMasina().toString()+"\n");

    }
}
