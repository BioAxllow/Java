//package ErrorHandling;
//
//import java.io.BufferedReader;
//import java.io.FileNotFoundException;
//import java.io.FileReader;
//import java.io.IOException;
//
//public class ParseInt {
//    public static void main(String[] args) {
//        String file = "C:\\Users\\bioax_000\\IdeaProjects\\Hello World\\src\\ErrorHandling\\Data1.txt";
//        String atsakymai = "C:\\Users\\bioax_000\\IdeaProjects\\Hello World\\src\\ErrorHandling\\Rezultatai.22txt";
//        String skaiciaiString = Skaityti(file);
//    }
//
//    public static String Skaityti(String failas){
//        String atsarginisFailas = "C:\\Users\\bioax_000\\IdeaProjects\\Hello World\\src\\ErrorHandling\\Data2.txt";
//        String visosEilutes=" ";
//        try (BufferedReader br = new BufferedReader(new FileReader(failas))) {
//            String line = br.readLine();
//            while (line != null) {
//                visosEilutes += line + " ";
//                line = br.readLine();
//            }
//        }catch (FileNotFoundException ex){
//            System.out.println("Failas nerastas");
//            visosEilutes=Skaityti(atsarginisFailas);
//        }catch (IOException ex){
//            System.out.println("Failas nerastas");
//        }
//    }
//}
