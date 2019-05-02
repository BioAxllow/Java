package _00_Objektinis_Programavimas_2019._16_Enum_Tipai;

public class BendrineKlase<K,V> implements Pora<K,V>{
    private K arg;
    private V argu;

    public BendrineKlase(K arg,V argu){
        this.arg=arg;
        this.argu=argu;
    }

    @Override
    public K getKey(){
        return arg;
    }

    @Override
    public V getValue(){
        return argu;
    }


}
