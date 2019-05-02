package _00_Objektinis_Programavimas_2019.main;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
//        System.out.println("Hello World!");


//---------------------staciakampio plotas---------------------------
//        Scanner reader = new Scanner(System.in);
//        System.out.println("Enter a staciakampio 1-aja krastine: ");
//        Double number = reader.nextDouble();
//
//        System.out.println("Enter a staciakampio 2-aja krastine: ");
//        Double number2 = reader.nextDouble();
//
//        reader.close();
//        System.out.println("Staciakampio plotas: " +number*number2);


//-----------------------------apskritimo plotas----------------------

//        Scanner reader = new Scanner(System.in);
//        System.out.println("Enter apskritimo spinduli: ");
//        Double number = reader.nextDouble();
//
//        reader.close();
//        System.out.println("Apskritimo plotas: " + Math.PI * Math.pow(number,2));

//-----------------------------neigiami/teigiami----------------------
//            Scanner reader = new Scanner(System.in);
//            System.out.println("veskite skaiciu: ");
//            Double number = reader.nextDouble();
//
//            if (number>0){
//                System.out.println("Ivestas skaicius yra teigiamas.");
//            }else if(number<0){
//                System.out.println("Ivestas skaicius yra neigiamas.");
//            }else{
//                System.out.println("Ivestas skaicius yra 0.");
//            }


 /* -----------------------------kvadratine lygtis---------------------- */
//        Scanner reader = new Scanner(System.in);
//        System.out.println("Jusu lygtis atrodys taip: F(x)= a*x^2+b*x+c;");
//        System.out.println("veskite lygties koefidiento a reiksme: ");
//        Double a = reader.nextDouble();
//
//        System.out.println("veskite lygties koefidiento b reiksme: ");
//        Double b = reader.nextDouble();
//
//        System.out.println("veskite lygties koefidiento c reiksme: ");
//        Double c = reader.nextDouble();
//
//        System.out.println("Jusu lygtis yra: F(x)="+a+"x^2+"+b+"x+"+c+";");
//
//        Double det=Math.sqrt(Math.pow(b,2)-4*a*c);
//        if (det<0){
//            System.out.println("vlygtis neturi  sprendiniu.");
//        }else if(det==0){
//            System.out.println("Lygtis turi tik viena sprendini x=" + -b/2*a);
//        }else{
//            System.out.println("Lygties pirmasis spr x1="+(-b-det)/2*a);
//            System.out.println("Lygties antrasis spr x2="+(-b+det)/2*a);
//        }
 /* -----------------------------ar lyginis skaicius---------------------- */

//        System.out.println("Iveskite skaiciu: ");
//        Scanner reader = new Scanner(System.in);
//        Double number = reader.nextDouble();
//
//        if (number %2==0){
//            System.out.println("jusu ivestas skaicius yra lyginis");
//        }else if (number ==0){
//            System.out.println("Skaicius 0 yra nei lyginis, nei nelyginis");
//        }else{
//            System.out.println("jusu ivestas skaicius nera lyginis");
//        }


/* -----------------------------atspausdinti pirma ir paskutine zodio raide-------------------*/

//         System.out.println("Parasykite zodi: ");
//         Scanner reader = new Scanner(System.in);
//         String word = reader.next();
//
//         System.out.println(word);
//        char a_char = word.charAt(0);
//         System.out.println("Zodzio pirmoji raide: "+a_char);
//
//        char b_char = word.charAt(word.length()-1);
//        System.out.println("Zodzio paskutine raide: "+b_char);

 /* -----------------------------isvesti didziausia sk is 3-------------------*/

//        System.out.println("iveskite 3 skaicius: ");
//        Scanner reader = new Scanner(System.in);
//        Double pirmas = reader.nextDouble();
//
////        Scanner reader = new Scanner(System.in);
//        Double antras = reader.nextDouble();
//
////        Scanner reader = new Scanner(System.in);
//        Double trecias = reader.nextDouble();
//
//        System.out.println("Is ivestu skaiciu: "+pirmas+"; "+antras+"; "+trecias+"; surasime didziausia/didziauusius: ");
//        if (pirmas>=antras & pirmas>=trecias ){
//
//            if (pirmas!=antras & pirmas!=trecias){
//                System.out.println(pirmas+";....");
//            }else if(pirmas==antras & pirmas!=trecias){
//                System.out.println("Didziausi yra keli skaiciai: "+pirmas+"; ir "+antras+";");
//            }else if(pirmas!=antras & pirmas==trecias){
//                System.out.println("Didziausi yra keli skaiciai: "+pirmas+"; ir "+trecias+";");
//            }else{
//                System.out.println("Visi ivesti skaiciai yra vienodo dydzio: "+pirmas+"; ir "+trecias+"; ir "+trecias+";");
//            }
//
//        }else if(antras>=pirmas & antras>=trecias){
//            System.out.println(antras+";...");
//        }else{
//            System.out.println(trecias+";");
//        }


/* -----------------------------grazintu atitinkama pavadinima 1-7-------------------*/
//
//        System.out.println("iveskite skaiciu nuo 1-7: ");
//        Scanner reader = new Scanner(System.in);
//        Integer diena = reader.nextInt();
//        int i=0;
//        while (diena<1 | diena >7 | diena!=(int)diena){
//            System.out.println("Nemokate skaityti salygos, prasome laikytis instrukciju ir ivesti sveika skaiciu nuo 1-7!!: (Tries left: "+(3-i) +"):");
//            Integer diena2 = reader.nextInt();
//            diena=diena2;
//            i++;
//            if (i>2){
//                System.out.println("You are too stupid for this assignment ^^, stay awesome!");
//                break;
//            }
//
//        }
//        if (diena==1){
//            System.out.println("Pirmadienis;");
//        }else if(diena==2){
//            System.out.println("Antradienis;");
//        }else if(diena==3){
//            System.out.println("Treciadienis;");
//        }else if(diena==4){
//            System.out.println("Ketvirtadienis;");
//        }else if(diena==5){
//            System.out.println("Penktadienis;");
//        }else if(diena==6){
//            System.out.println("Sestadienis;");
//        }else if(diena==7){
//            System.out.println("Sekmadienis;");
//        }
//--------------------------------------uzd2----------------------------------------------

//        Integer Turis=1001;
//        Integer n=50;
//        Double vv=0.1;
//        System.out.println( Turis/(n*vv));
//
//---------------------------------------------ar polindromas---------------------------------

//        System.out.println("iveskite zodi, patikrinsime ar jis simetriskas: ");
//        Scanner reader = new Scanner(System.in);
//        String word = reader.next();
//        int j=0;
//        if(word.length()%2==0){
//            j=word.length()/2;
//        }else{
//            j=(word.length()-1)/2;
//        }
//
//        int mm=0;
//        for(int i=0;  i<j; i++ ){
//            if (word.charAt(i)==word.charAt(word.length()-1-i)){
//                mm=i+1;
//            }else{
//                break;
//            }
//        }
//        if(mm==j){
//            System.out.println("Zodis yra polindromas;");
//        }else{
//            System.out.println("Zodis nera polindromas;");
//        }
//        -------------------------------------------17-1-----------------------------------------------
        System.out.println("Iveskite kiek valandu treniravotės pirmadieni: ");
        Scanner reader = new Scanner(System.in);
        Double first = reader.nextDouble();

        System.out.println("Iveskite kiek valandu treniravotės antradieni: ");
        Double second = reader.nextDouble();
        System.out.println("Iveskite kiek valandu treniravotės treciadieni: ");
        Double third = reader.nextDouble();
        System.out.println("Iveskite kiek valandu treniravotės ketvirtadieni: ");
        Double fourth = reader.nextDouble();
        System.out.println("Iveskite kiek valandu treniravotės penktadieni: ");
        Double fifth = reader.nextDouble();

        System.out.println("Jus isviso sportavote: "+((first+second+third+fourth+fifth)*60)+" min;");
    }
}

//psvm - uzraso public static void main(){}