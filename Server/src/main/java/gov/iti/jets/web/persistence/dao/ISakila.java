package gov.iti.jets.web.persistence.dao;

import gov.iti.jets.web.entities.Film;
import gov.iti.jets.web.persistence.connection.DBManagerFactory;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

import java.nio.file.attribute.UserPrincipal;
import java.util.List;

public class ISakila{
    EntityManager entityManager = DBManagerFactory.INSTANCE.getEntityManager();

    public <T> List<T> getAll(String namedQuery){
        TypedQuery<T> query = (TypedQuery<T>) entityManager.createNamedQuery(namedQuery);

        return query.getResultList();
    }

    public <T,TP> T getBy(String namedQuery, String paramName, TP id){
        TypedQuery<T> query = (TypedQuery<T>) entityManager.createNamedQuery(namedQuery);
        query.setParameter(paramName, id);
        return query.getSingleResult();
    }

    public <T> T add(T object){
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(object);
            System.out.println("after persist\n");
            entityManager.getTransaction().commit();
            entityManager.refresh(object);
            return object;
        } catch (Exception e) {
            System.out.println(e+"ERRRRROR");
            entityManager.getTransaction().rollback();
            return null;
        }
    }

    public <T> boolean update(T newObject){
        if (newObject != null) {
            entityManager.getTransaction().begin();
            entityManager.merge(newObject);
            entityManager.getTransaction().commit();
            entityManager.close();
            return true;
        }
        return false;
    }
}
