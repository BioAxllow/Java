package Bandomasis;

import java.util.*;

public class Main implements AA {

    AA aa=()->this.b(5);


    public static void main(String[] args) {
        Integer var = false ? 1: false ? 4 : 2;
        System.out.println(var);

        Integer x=2;
        Integer y=4;
        String s;
        s=x+y+"aaa";
         System.out.println(x+y+" skaciu 5 ir 7 suma ");
        System.out.println(x+y+s);


        System.out.println("=======================================");

        String st="roar";
        StringBuilder roar=new StringBuilder("roar");
        System.out.println(roar+" - "+st);

        st.concat("!!!11");
        System.out.println(st);

        roar.append("45445");
        System.out.println(roar);


        new Lion().Roar(st,roar);
        System.out.println(st+" -- "+roar);

        String a="";
        a+=2;
        a+='c';
        a+=false;
        System.out.println(a);
        if (a=="2cfalse") System.out.println("==");
        if (a.equals("2cfalse")) System.out.println("equals");

        Lion aaa=new Lion();
        System.out.println(aaa.aaa);




        System.out.println(aaa.yy || aaa.xx);

        List<Double> as= new ArrayList<>();
        Map<String, Integer> ar=new HashMap<>();
        ar.put("A",1);
        ar.put("B",3);
        ar.put("A",33);
        System.out.println(ar.size());
        System.out.println(ar.get("A"));

        System.out.println("------------------------------------------------------");
        int c=1;
        int ap=1;
        int ao=0;
        try {
            c=ap/ao;
            System.out.println(c);

        }finally {
            System.out.println(c);
        }


    }

    @Override
    public int AA() {
        return 0;
    }

    @Override
    public int b(int x) {
        return 0;
    }
}
interface AA{
    int AA();
    default int b(int x){
        return 2*x;
    }
}

class Lion{
    Integer aaa;
    boolean yy;
    boolean xx;
//    Boolean xx;
    public void Roar(String st, StringBuilder roar2){
     st.concat("!!!");
     roar2.append("!!!");

    }
}
