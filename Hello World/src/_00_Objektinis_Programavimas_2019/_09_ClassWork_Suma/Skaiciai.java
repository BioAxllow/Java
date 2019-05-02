package _00_Objektinis_Programavimas_2019._09_ClassWork_Suma;

public class Skaiciai {
    private Integer pirmasSkaicius;
    private Integer antrasSkaicius;

    public Skaiciai(Integer primasSaicius, Integer antrasSkaicius){
        this.pirmasSkaicius=primasSaicius;
        this.antrasSkaicius=antrasSkaicius;
    }

    public Integer getPirmasSkaicius() {
        return pirmasSkaicius;
    }

    public void setPirmasSkaicius(Integer pirmasSkaicius) {
        this.pirmasSkaicius = pirmasSkaicius;
    }

    public Integer getAntrasSkaicius() {
        return antrasSkaicius;
    }

    public void setAntrasSkaicius(Integer antrasSkaicius) {
        this.antrasSkaicius = antrasSkaicius;
    }

    public String  suma(){
        return (pirmasSkaicius+antrasSkaicius)+"";
    }
}
