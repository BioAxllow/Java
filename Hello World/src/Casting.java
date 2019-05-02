import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Casting {
    public static void main(String[] args) {
        List<Object> listas = new ArrayList<>();
//        object -> vietoje ?

        listas.add("A");
        listas.add(100);
        listas.add(2.55);
        listas.add(LocalDate.now());
        listas.add(Boolean.TRUE);

        Object o = listas.get(1);

        if (o instanceof String) {
//            String s= (String) o;
//            int length= s.length();
            int len = ((String) o).length(); //(String ) - casting is lowest priority, lower than ".", thats why we show priority with "( )" like "(String o)"
            System.out.println(len);            //Objektai nesikonvertuoja, Boolean not possible to convert to String
        }

        int ii = 10;
        int oo = 3;
        double pp = (double) ii / oo;
        int uu = (int) 100000000000L;
        System.out.println(uu);
        System.out.println("Double: " + pp);

        int x = (int) (10. / 3.);
        System.out.println(x);
    }
}
