package _00_Objektinis_Programavimas_2019._00_Uzdaviniai_From_Book._23_Weekend_HW_BasketBall_82psl._2nd_Try;

public class Player2 implements Comparable<Player2>{
    private String vardas;
    private String pavarde;
    private Integer playerNr;

    public Player2(String name, String pavarde, Integer playerNr) {
        this.vardas = name;
        this.pavarde = pavarde;
        this.playerNr = playerNr;
    }

    public String getVardas() {
        return vardas;
    }

    public void setVardas(String name) {
        this.vardas = name;
    }

    public String getPavarde() {
        return pavarde;
    }

    public void setPavarde(String pavarde) {
        this.pavarde = pavarde;
    }

    public Integer getPlayerNr() {
        return playerNr;
    }

    public void setPlayerNr(Integer playerNr) {
        this.playerNr = playerNr;
    }

    @Override
    public String toString(){
        return vardas+"; "+pavarde+"; "+playerNr+";";
    }

    @Override
    public int compareTo(Player2 obj) {
            int temp=this.playerNr.compareTo(obj.getPlayerNr());
            if (temp!=0) return temp;

            temp=this.pavarde.compareTo(obj.getPavarde());
            if (temp!=0) return temp;

            return this.vardas.compareTo(obj.getVardas());
    }
}
