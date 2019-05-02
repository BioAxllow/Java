package _00_Objektinis_Programavimas_2019._10_Paveldejimas;


public class Farm {
    private Animal[] gyvunuMasyvas = new Animal[0];


    public void pridetiGyvuna(Animal naujasGyvunas) {
        Animal[] naujasMasyvas = new Animal[gyvunuMasyvas.length + 1];
        System.arraycopy(gyvunuMasyvas, 0, naujasMasyvas, 0, gyvunuMasyvas.length);
        naujasMasyvas[naujasMasyvas.length - 1] = naujasGyvunas;
        gyvunuMasyvas = naujasMasyvas;
    }

    @Override
    public String toString() {
        Integer sunuSkaicius = 0;
        Integer kaciuSkaicius = 0;
        Integer sheepSkaicius = 0;
        Integer chickenSkaicius = 0;
        Integer cowSkaicius = 0;
        Animal anim= new Cat();


        for (int i = 0; i < gyvunuMasyvas.length; i++) {
            if (gyvunuMasyvas[i] instanceof Dog) {
                sunuSkaicius++;
            } else if (gyvunuMasyvas[i] instanceof Cat) {//instance of tikrina klases tipa
                kaciuSkaicius++;
            } else if (gyvunuMasyvas[i] instanceof Sheep) {
                sheepSkaicius++;
            } else if (gyvunuMasyvas[i] instanceof Chicken) {
                chickenSkaicius++;
            } else if (gyvunuMasyvas[i] instanceof Cow) {
                cowSkaicius++;
            }
        }
        return "Sunu skaicius = " + sunuSkaicius + " " +new Dog().toString()+ " Kaciu skaicius = "
                + kaciuSkaicius +anim.toString()+((Cat) anim).getBalsas()+"\n Aviu skaicius = " + sheepSkaicius + " Visciuku skaicius = " + chickenSkaicius +"" +
                "\nKarviu skaicius = "+cowSkaicius;//.toString somewhy it recognize it without the proper syntax, which is as we would call our ".getBalsas"
    }

    public Animal[] getGyvunuMasyvas() {
        return gyvunuMasyvas;
    }

    public void setGyvunuMasyvas(Animal[] gyvunuMasyvas) {
        this.gyvunuMasyvas = gyvunuMasyvas;
    }
}
