package esgi.arlo.arjas.jerseyservlet.persistence.datasource;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class H2EntityManager {

    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("esgi.arlo.arjas");
    public static EntityManager entityManager() {
        return emf.createEntityManager();
    }

}
