package dienynas.dao;


import dienynas.helpers.EntityManagerHelper;

import javax.persistence.EntityGraph;
import javax.persistence.EntityManager;
import java.util.HashMap;
import java.util.Map;

public class Dao<T> {

    public T create(T entity) {
        EntityManager en = EntityManagerHelper.getEntityManager();
        EntityManagerHelper.beginTransaction();

        en.persist(entity);

        EntityManagerHelper.commit();
        EntityManagerHelper.closeEntityManager();

        return entity;
    }

    public T read(Class<T> clazz, Object pk) {
        EntityManager em = EntityManagerHelper.getEntityManager();

        T entity = em.find(clazz, pk);

        EntityManagerHelper.closeEntityManager();
        return entity;
    }

    public T readGraph(Class<T> clazz, Object pk, String graph) {
        EntityManager em = EntityManagerHelper.getEntityManager();

        EntityGraph entityGraph = em.getEntityGraph(graph);
        Map<String ,Object> properties= new HashMap<>();
        properties.put(EntityManagerHelper.FETCH_GRAPH,entityGraph);
        T entity = em.find(clazz, pk, properties);

//        EntityManagerHelper.closeEntityManager();
        return entity;
    }

    public T update(T entity) {
        EntityManager em = EntityManagerHelper.getEntityManager();
        EntityManagerHelper.beginTransaction();

        entity = em.merge(entity);

        EntityManagerHelper.commit();
        EntityManagerHelper.closeEntityManager();
        return entity;
    }

    public void delete(T entity) {
        EntityManager em = EntityManagerHelper.getEntityManager();
        EntityManagerHelper.beginTransaction();

        entity = em.merge(entity);
        em.remove(entity);

        EntityManagerHelper.commit();
        EntityManagerHelper.closeEntityManager();


    }


}
