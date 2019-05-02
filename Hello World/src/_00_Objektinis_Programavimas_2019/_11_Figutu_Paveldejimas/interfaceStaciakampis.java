package _00_Objektinis_Programavimas_2019._11_Figutu_Paveldejimas;

interface interfaceStaciakampis {
    default Double getPlotas(Double krastineA, Double krastineB) {
        return krastineA * krastineB;
    }

    default Double sraciakampioPerimetras(Double krastineA, Double krastineB) {
        return 2 * (krastineA + krastineB);
    }
}
