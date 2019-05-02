package Bandomasis;

public class MainMain {
    public static void main(String[] args) {
        Season season1= new Season();
        season1.name="SSS";
        season1.surname="ooo";

        System.out.println(season1.name +" "+season1.surname);
        Season season2= new Season();
        season2.name="aaa";

        System.out.println(season2.name +" "+season2.surname);
        season1=season2;

        System.out.println(season1.name+" - "+season2.name);
        System.out.println(season1.surname+" - "+season2.surname);
    }
}

class Season{
    String name;
    String surname;
}
