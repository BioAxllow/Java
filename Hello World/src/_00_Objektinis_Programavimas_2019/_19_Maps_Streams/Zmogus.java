package _00_Objektinis_Programavimas_2019._19_Maps_Streams;
 //vardas pavarde asmens kodas
public class Zmogus implements Comparable<Zmogus>{
    private String vardas;
    private String pavarde;
    private String asmensKodas;

    public Zmogus(String vardas,String pavarde, String asmensKodas){
        this.vardas=vardas;
        this.pavarde=pavarde;
        this.asmensKodas=asmensKodas;
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

     public String getAsmensKodas() {
         return asmensKodas;
     }

     public void setAsmensKodas(String asmensKodas) {
         this.asmensKodas = asmensKodas;
     }
     @Override
     public String toString(){
        return vardas+"; "+pavarde+"; "+asmensKodas+";";
     }
     @Override
     public int compareTo(Zmogus o) {

         int comp = getVardas().compareTo(o.getVardas());
         if (comp!=0) return comp;

         comp = getPavarde().compareTo(o.getPavarde());
         if (comp != 0) return comp;

         return getAsmensKodas().compareTo(o.getAsmensKodas());
     }
 }
