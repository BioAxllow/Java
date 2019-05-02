package _00_Objektinis_Programavimas_2019._11_Figutu_Paveldejimas;

interface interfaceKvadratas {

    default Double perimetras(Double krastine) {
        return 4 * krastine;
    }

    default Double getPlotas(Double krastine) {
        return Math.pow(krastine, 2);
    }


}
