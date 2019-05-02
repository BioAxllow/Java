package _00_Objektinis_Programavimas_2019._17_Parametrizuotos_Klases_Weekend._17_Parametrizouotos_Klases_Weekend_List;

public class Cars implements Comparable<Cars>{
    private String gamintojas;
    private String modelis;
    private Integer metai;
    private Integer kaina;
    private Double variklioTuris;
    private Character kuroTipas;

    public Cars(String gamintojas, String modelis, Integer metai, Integer kaina, Double variklioTuris, Character kuroTipas){
        this.gamintojas=gamintojas;
        this.modelis=modelis;
        this.metai=metai;
        this.kaina=kaina;
        this.variklioTuris=variklioTuris;
        this.kuroTipas=kuroTipas;
    }

    public String getGamintojas() {
        return gamintojas;
    }

    public void setGamintojas(String gamintojas) {
        this.gamintojas = gamintojas;
    }

    public String getModelis() {
        return modelis;
    }

    public void setModelis(String modelis) {
        this.modelis = modelis;
    }

    public Integer getMetai() {
        return metai;
    }

    public void setMetai(Integer metai) {
        this.metai = metai;
    }

    public Integer getKaina() {
        return kaina;
    }

    public void setKaina(Integer kaina) {
        this.kaina = kaina;
    }

    public Double getVariklioTuris() {
        return variklioTuris;
    }

    public void setVariklioTuris(Double variklioTuris) {
        this.variklioTuris = variklioTuris;
    }

    public Character getKuroTipas() {
        return kuroTipas;
    }

    public void setKuroTipas(Character kuroTipas) {
        this.kuroTipas = kuroTipas;
    }

    @Override
    public String toString(){
        return "Gamintojas: "+gamintojas +"; Modelis: "+ modelis +"; Pagaminimo metai: "+ metai +"; Kaina: "+ kaina +
                "; Variklio turis: "+ variklioTuris +"; Kuro tipas: "+ kuroTipas+";";
    }

    @Override
    public int compareTo(Cars o) {
        return this.getMetai().compareTo(o.getMetai());
//        Collectors.counting() <- suranda ieskomu blabla skaiciu
//        Collections.sort(....)<- main funkcijoje iskviesti tokiu budu
//        Collections.reverseOrder()
    }
}