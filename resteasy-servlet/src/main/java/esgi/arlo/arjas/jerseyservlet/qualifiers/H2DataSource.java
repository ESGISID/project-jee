package esgi.arlo.arjas.jerseyservlet.qualifiers;


import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.text.html.parser.Entity;

public class H2DataSource {

    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("esgi.arlo.arjas");
    public static EntityManager entityManager() {
        return emf.createEntityManager();
    }

}
