package _00_Objektinis_Programavimas_2019._11_Figutu_Paveldejimas;

interface interfaceTrikampis {
    default Double trikampioPerimetras(Double krastineA, Double krastineB, Double krastineC) {
        return krastineA + krastineB + krastineC;
    }

    default Double getPlotas(Double krastineA, Double krastineB, Double krastineC) {
        Double temp = trikampioPerimetras(krastineA, krastineB, krastineC) / 2.0;
        return Math.sqrt(temp * (temp - krastineA) * (temp - krastineB) * (temp - krastineC));
    }
}
