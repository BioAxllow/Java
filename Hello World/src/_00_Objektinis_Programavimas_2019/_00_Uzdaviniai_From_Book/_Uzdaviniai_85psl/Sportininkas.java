package _00_Objektinis_Programavimas_2019._00_Uzdaviniai_From_Book._Uzdaviniai_85psl;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Sportininkas implements Comparable<Sportininkas>{
    private Integer sportininkoNr;
    private String vardas;
    private String pavarde;
    private String startTime;
    private String endTime;
    private List<Integer> punktai;

    public Sportininkas(Integer sportininkoNr, String vardas, String pavarde, String startTime, String endTime) {
        this.sportininkoNr = sportininkoNr;
        this.vardas = vardas;
        this.pavarde = pavarde;
        this.startTime = startTime;
        this.endTime = endTime;
        this.punktai=new ArrayList<>();
    }

    public Integer getSportininkoNr() {
        return sportininkoNr;
    }

    public void setSportininkoNr(Integer sportininkoNr) {
        this.sportininkoNr = sportininkoNr;
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

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public List<Integer> getPunktai() {
        return punktai;
    }

    public void setPunktai(Integer punktas) {
        punktai.add(punktas);
    }


    public String getArrayString(){
        String array="";
        for (Integer each: punktai){
            array+=" "+each;
        }
        return array;
    }


    @Override
    public String toString(){
        return sportininkoNr+" "+vardas+" "+pavarde+" "+startTime+" "+endTime+" "+gautiBegimoLaika()+" "+getArrayString();
    }

    public String gautiBegimoLaika() {
        DateFormat df = new SimpleDateFormat("hh:mm:ss");
        long diff = 0;
        try {
            Date date1 = df.parse(getStartTime());
            Date date2 = df.parse(getEndTime());
            diff = date2.getTime() - date1.getTime();
        } catch (Exception ex) {
            System.out.println(ex);
        }

//        long millis = diff % 1000;
        long second = (diff / 1000) % 60;
        long minute = (diff / (1000 * 60)) % 60;
        long hour = (diff / (1000 * 60 * 60)) % 24;

        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    @Override
    public int compareTo(Sportininkas o) {
        return gautiBegimoLaika().compareTo(o.gautiBegimoLaika());
    }
}
