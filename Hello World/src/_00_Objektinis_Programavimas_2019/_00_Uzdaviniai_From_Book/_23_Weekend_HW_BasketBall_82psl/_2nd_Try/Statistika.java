package _00_Objektinis_Programavimas_2019._00_Uzdaviniai_From_Book._23_Weekend_HW_BasketBall_82psl._2nd_Try;

public class Statistika implements Comparable<Statistika> {
    private Integer playerNr;
    private Integer nepataikyti;
    private Integer baudos;
    private Integer dvitaskiai;
    private Integer tritaskiai;
    private Double taiklumas;
    private Integer allPoints;

    public Statistika(Integer playerNr, Integer nepataikyti, Integer baudos, Integer dvitaskiai, Integer tritaskiai) {
        this.playerNr = playerNr;
        this.nepataikyti = nepataikyti;
        this.baudos = baudos;
        this.dvitaskiai = dvitaskiai;
        this.tritaskiai = tritaskiai;
        setTaiklumas();
        setAllPoints();
    }

    public Integer getPlayerNr() {
        return playerNr;
    }

    public void setPlayerNr(Integer playerNr) {
        this.playerNr = playerNr;
    }

    public Integer getNepataikyti() {
        return nepataikyti;
    }

    public void setNepataikyti(Integer nepataikyti) {
        this.nepataikyti = nepataikyti;
    }

    public Integer getBaudos() {
        return baudos;
    }

    public void setBaudos(Integer baudos) {
        this.baudos = baudos;
    }

    public Integer getDvitaskiai() {
        return dvitaskiai;
    }

    public void setDvitaskiai(Integer dvitaskiai) {
        this.dvitaskiai = dvitaskiai;
    }

    public Integer getTritaskiai() {
        return tritaskiai;
    }

    public void setTritaskiai(Integer tritaskiai) {
        this.tritaskiai = tritaskiai;
    }

    public Double getTaiklumas() {
        return taiklumas;
    }

//    public void setTaiklumas(Integer nepataikyti, Integer baudos, Integer dvitaskiai, Integer tritaskiai) {
    public void setTaiklumas() {
        this.taiklumas = (0d*nepataikyti+baudos+dvitaskiai+tritaskiai)/(1.0*nepataikyti+1.0*baudos+1.0*dvitaskiai+1.0*tritaskiai)*100.00;
    }

    public Integer getAllPoints(){
        return allPoints;
    }

//    public void setAllPoints(Integer baudos, Integer dvitaskiai, Integer tritaskiai){
    public void setAllPoints(){
        allPoints=baudos+2*dvitaskiai+3*tritaskiai;
    }

    @Override
    public String toString(){
        return playerNr+" "+nepataikyti+" "+baudos+" "+dvitaskiai+" "+tritaskiai+" "+taiklumas+" "+allPoints+";";
    }

    public int compareTo(Statistika obj) {
        int temp=this.allPoints.compareTo(obj.getAllPoints());
        if (temp!=0) return temp;

        temp=this.tritaskiai.compareTo(obj.getTritaskiai());
        if (temp!=0) return temp;

        return this.taiklumas.compareTo(obj.getTaiklumas());
    }
}
