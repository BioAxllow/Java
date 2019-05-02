package _00_Objektinis_Programavimas_2019.main;

public class Book97 {
    public static void main(String[] args) {
        int x = 5 * 4 % 3;
        System.out.println(x);
        //2

        int y = 0;
        String s = null;
        System.out.println(s);

             if(y==Integer.parseInt(s)) System.out.println("Success");
             else System.out.println("Failure");
//        failure at line if(y ==s) as it tries to compare different type of data (int to string);, to
//        succeed you need to Integer.parseInt(String) - turn string to int (if possible);
//        ------------------boolean---------------------------------
         int x1 = 50, x2 = 75;
         boolean b = x1 >= x2;    //yes it is possible to assign boolen in this way!
         System.out.println(b);     // in this case b = false;
         if(b = true) System.out.println("Success");    //if (false = true) [we rasign false to true] {if it would be == instead of = it would check the type, not reasign the value}
         else System.out.println("Failure");
//        success

//        ------------------------postincrement-----------------------
        int c=7;
        int result=4;
        result += c++; // c++ - atlieka operacija, tada padidina c, ++c - pries atliekant operacija padidina +1;
        System.out.println(result); //result=4+(++7)-> 4+8(res=4, c=8) -> 12(res=12; c=8); result=4+(7++)->4+7(res=4,c=7)->11(res=11, c=8);
        //12
//    ------------------------------while loop--------------------------

         int v = 1, g = 15;
         while (v < 10) {
             g--;
             v++;
             System.out.println("Cycle "+v+";"+g+";");
         }

        System.out.println(v+", "+g);
//         10, 6
//--------------------------------------do while--------------------------

        int y1=1;
        do {
            y1 = 1;
            System.out.print(y1++ + " ");
        } while (y1 <= 10);
//        endless loop, as we rasign y=1;

        Integer[] a={1,2,3,2,2};
        int suma = 0, i = 0;
        do {
            suma += a[i];
            i++;
        } while (i < a.length);
        System.out.println(suma);
    // 10
//-----------------------------98psl------------------------------------------

        boolean keepGoing = true;
        int result1 = 15, i2 = 10;
        do {
            i2--;
            if (i2 == 8) keepGoing = false;
            result1 -= 2;
        } while (keepGoing);
        System.out.println(result1);
        //11




    }

}
