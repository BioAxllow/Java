package _00_Objektinis_Programavimas_2019._10_Paveldejimas;

import java.io.File;

public class PagrindineKlase {
    public static void main(String[] args) {

        String filePath = new File("").getAbsolutePath();
        System.out.println (filePath);
        Animal gyvunas = new Animal();
        Dog suo = new Dog();
        Cat kate = new Cat();
        Sheep avis=new Sheep();
        Cow karve=new Cow();

        System.out.println(gyvunas.toString());
        System.out.println(suo.toString());
        System.out.println(kate.toString());

        Animal suoAnimal = new Dog();
        Animal kateAnimal = new Cat();

        System.out.println(((Dog) suoAnimal).suoFainas());
        System.out.println(kateAnimal.toString());

        Farm fermyte = new Farm();
        fermyte.pridetiGyvuna(suo);
        fermyte.pridetiGyvuna(kate);
        fermyte.pridetiGyvuna(suoAnimal);
        fermyte.pridetiGyvuna(kateAnimal);
        fermyte.pridetiGyvuna(suo);
        fermyte.pridetiGyvuna(avis);
        fermyte.pridetiGyvuna(karve);
        fermyte.pridetiGyvuna(avis);
        fermyte.pridetiGyvuna(avis);

        System.out.println(fermyte.toString());
        System.out.println();
    }
}
