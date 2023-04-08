package gov.iti.jets.web.persistence.dao;

import gov.iti.jets.web.persistence.connection.DBManagerFactory;
import jakarta.persistence.EntityManager;

public class FilmDao extends ISakila {
    EntityManager entityManager = DBManagerFactory.INSTANCE.getEntityManager();

}
