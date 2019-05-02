package _00_Objektinis_Programavimas_2019._13_Abstract_Figures;

public class Main {
    public static void main(String[] args) {

        Double plotas=100.0;
        Double per1=new Apskritimas().plotuTikrinimas(plotas);
        Double per2=new Kvadratas().plotuTikrinimas(plotas);
        Double per3=new Trikampis().plotuTikrinimas(plotas);

        Double plot1=new Apskritimas().perimetruTikrinimas(plotas);
        Double plot2=new Kvadratas().perimetruTikrinimas(plotas);
        Double plot3=new Trikampis().perimetruTikrinimas(plotas);

        System.out.println("kad butu vienodas visu figuru plotas: "+plotas+", Figutu perimetrai turi buti:\n" +
                " Apskritimo: "+per1+"; Kvadrato: "+per2+"; Trikampio: "+per3+";");
        System.out.println("-----------------------------------------------------------");
        System.out.println("kad butu vienodas visu figuru pperimetras: "+plotas+", Figutu plotai turi buti:\n" +
                " Apskritimo: "+plot1+"; Kvadrato: "+plot2+"; Trikampio: "+plot3+";");


    }
}
