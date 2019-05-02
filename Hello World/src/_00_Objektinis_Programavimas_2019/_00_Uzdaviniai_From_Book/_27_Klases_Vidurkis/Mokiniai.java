package _00_Objektinis_Programavimas_2019._00_Uzdaviniai_From_Book._27_Klases_Vidurkis;

public class Mokiniai {
    private String vardas;
    private String pavarde;
    private String klase;
    private Integer dalykuSk;
    private Integer[] pazymiai;

    public Mokiniai(String vardas, String pavarde, String klase, Integer dalykuSk) {
        this.vardas = vardas;
        this.pavarde = pavarde;
        this.klase = klase;
        this.dalykuSk = dalykuSk;
        this.pazymiai = new Integer[dalykuSk];
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

    public String getKlase() {
        return klase;
    }

    public void setKlase(String klase) {
        this.klase = klase;
    }

    public Integer getDalykuSk() {
        return dalykuSk;
    }

    public void setDalykuSk(Integer dalykuSk) {
        this.dalykuSk = dalykuSk;
    }

    public Integer[] getPazymiai() {
        return pazymiai;
    }

    public void setPazymiai(String[] pazymiai) {
        Integer[] all=new Integer[dalykuSk];
        for (int i=4, j=0; i<pazymiai.length; i++, j++){
            all[j]=Integer.parseInt(pazymiai[i]);
        }
        this.pazymiai = all;
    }
    @Override
    public String toString(){
        String pazymiaiString="|";
        for (int i=0; i<pazymiai.length-1; i++){
            pazymiaiString+=pazymiai[i]+"|";
        }

        return vardas+"; "+pavarde+"; "+klase+"; "+dalykuSk+"; "+pazymiaiString+";";
    }

    public Double getVidurkis(Integer[] allPaz){
        Double suma=0.0;
        for (int i = 0; i <allPaz.length ; i++) {
            suma+=allPaz[i];
        }
        Double vidurkis=suma/allPaz.length;
        return vidurkis;

    }
}
