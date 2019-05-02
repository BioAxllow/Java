import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        int[] sveikiskaiciai={1,2,3,4};

        System.out.println(sveikiskaiciai[0]);


        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a number: ");
        Integer number = reader.nextInt();
        reader.close();
        System.out.println(number);

    }





};
