package dienynas;

import dienynas.entities.Studentas;
import dienynas.helpers.EntityManagerHelper;

import javax.persistence.EntityManager;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        EntityManager em = EntityManagerHelper.getEntityManager();

         List<Studentas> studentas= em.createQuery("SELECT s FROM Studentas s", Studentas.class).getResultList(); //studentas cia Entity name //hibernate querry langugage
//        createnativequerry  <- MySql querry language


        System.out.println(studentas.getClass().getName());

        studentas.stream().sorted(Comparator.comparing(Studentas::getName).thenComparing(Studentas::getEmail)).forEach(System.out::println);

        em.close();



    }



}

