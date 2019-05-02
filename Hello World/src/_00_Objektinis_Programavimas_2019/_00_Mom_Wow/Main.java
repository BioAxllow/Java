package _00_Objektinis_Programavimas_2019._00_Mom_Wow;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
    String[] raides=new String[]{"A","I","N","T","L","S","P"};
    String[] allWords=galimiZodziai(raides);
        System.out.println(allWords.length);
        for (int i = 0; i <allWords.length ; i++) {
            System.out.println(allWords[i]);
        }

    }

    public static String[] galimiZodziai(String[] raides){
        String[] zodziuMasyas=new String[0];
        String laikinas;
        for (int i=0; i<raides.length; i++){
            for (int j=0; j<raides.length; j++ ){
                if (j!=i){
                    for (int k = 0; k <raides.length; k++) {
                        if (k!=j && k!=i){
                            for (int l = 0; l <raides.length; l++) {
                                if (l!=k && l!=j && l!=i){
                                    laikinas=raides[i]+"I"+raides[j]+raides[k]+raides[l];
                                    zodziuMasyas=addString(zodziuMasyas,laikinas);
                                }
                            }
                        }
                    }
                }
            }
        }
        return zodziuMasyas;
    }

    public static String[] addString(String[] allWords, String zodis){
        allWords= Arrays.copyOf(allWords,allWords.length+1);
        allWords[allWords.length-1]=zodis;
        return allWords;

    }
}
