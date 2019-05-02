package _00_Objektinis_Programavimas_2019._12_Polymorphysm;

public class Varna extends Paukstis {

    public  Varna(){
        super();
    }

    @Override
    public String GautiPavadinima() {
        return "Varna";
    }

    @Override
    public Integer GautiGyvenimoAmziu() {
        return 5;
    }

    @Override
    public Double GautiSvori() {
        return 0.7;
    }
}
