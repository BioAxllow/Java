package _00_Objektinis_Programavimas_2019._00_Uzdaviniai_From_Book._23_Weekend_HW_BasketBall_82psl;

public class Points {
    private Integer playerNr;
    private Integer score;

    public Points(Integer playerNr, Integer score) {
        this.playerNr = playerNr;
        this.score = score;
    }

    public Integer getPlayerNr() {
        return playerNr;
    }

    public void setPlayerNr(Integer playerNr) {
        this.playerNr = playerNr;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    @Override
    public String toString(){
        return playerNr+"; "+score+";";
    }

    public int compareTo(Integer obj) {
        return playerNr.compareTo(obj);
    }
}
