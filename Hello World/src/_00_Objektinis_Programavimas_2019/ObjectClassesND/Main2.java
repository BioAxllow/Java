package _00_Objektinis_Programavimas_2019.ObjectClassesND;

import java.io.*;


public class Main2 {
    public static void main(String[] args) {
        String duomenys = "C:\\Users\\bioax_000\\IdeaProjects\\Hello World\\src\\ObjectClassesND\\Data.txt";
        String atsakymai = "C:\\Users\\bioax_000\\IdeaProjects\\Hello World\\src\\ObjectClassesND\\Atsakymai.txt";

        Zmogus[] zmoniuMasyvas = skaityti(duomenys);
        Integer vyriausias= rastiVyriausia(zmoniuMasyvas);




        rasyti(atsakymai, zmoniuMasyvas, vyriausias);
    }

    public static Zmogus[] skaityti(String failas) {
        Zmogus[] objektuMasyvas = new Zmogus[0];
        String[] objektas = null;
        try (BufferedReader br = new BufferedReader(new FileReader(failas))) {
            String line = br.readLine();
            while (line != null) {
                objektas = line.split(" ");
                String vardas = objektas[0];
                String pavarde = objektas[1];
                Integer amzius = Integer.parseInt(objektas[2]);
                String profesija = objektas[3];

                Zmogus obj = new Zmogus(vardas, pavarde, amzius, profesija);
                objektuMasyvas = pridetiZmogu(objektuMasyvas, obj);
                line = br.readLine();
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Failas nerastas");
        } catch (Exception e) {
            System.out.println("something else went wrong");
        }

        return objektuMasyvas;
    }

    public static void rasyti(String failas, Zmogus[] zmoniuMasyvas, Integer vyriausias) {
        try (BufferedWriter output = new BufferedWriter(new FileWriter(failas))) {
            for (int i = 0; i < zmoniuMasyvas.length; i++) {
                output.write(zmoniuMasyvas[i].toString());
            }
            output.write("Vyriausiam zmogui: "+vyriausias+" metai;\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static Zmogus[] pridetiZmogu(Zmogus[] products, Zmogus productToAdd) {
        Zmogus[] newProducts = new Zmogus[products.length + 1];
        System.arraycopy(products, 0, newProducts, 0, products.length);
        newProducts[newProducts.length - 1] = productToAdd;
        return newProducts;
    }

    public static Integer rastiVyriausia(Zmogus[] zmoniuMasyvas) {
        Integer temp = 0;
        for (int i = 0; i <zmoniuMasyvas.length; i++){
            if (zmoniuMasyvas[i].getAmzius()>temp){
                temp=zmoniuMasyvas[i].getAmzius();
            }
        }
        return temp;
    }
}
