package _00_Objektinis_Programavimas_2019._00_Uzdaviniai_From_Book._26_Telephone;

public class Telephone {
    private Integer telephoneID;
    private String telephoneName;
    private Double telephonePrice;
    private Integer telephoneSold;

    public Telephone(Integer telephoneID, String telephoneName, Double telephonePrice) {
        this.telephoneID = telephoneID;
        this.telephoneName = telephoneName;
        this.telephonePrice = telephonePrice;
        this.telephoneSold=0;
    }

    public Integer getTelephoneID() {
        return telephoneID;
    }

    public void setTelephoneID(Integer telephoneID) {
        this.telephoneID = telephoneID;
    }

    public String getTelephoneName() {
        return telephoneName;
    }

    public void setTelephoneName(String telephoneName) {
        this.telephoneName = telephoneName;
    }

    public Double getTelephonePrice() {
        return telephonePrice;
    }

    public void setTelephonePrice(Double telephonePrice) {
        this.telephonePrice = telephonePrice;
    }

    public Integer getTelephoneSold() {
        return telephoneSold;
    }

    public void setTelephoneSold(Integer telephoneSold) {
        this.telephoneSold = telephoneSold;
    }

    @Override
    public String toString(){
        return telephoneID+" "+telephoneName+" "+telephonePrice+" "+telephoneSold+";";
    }
}
