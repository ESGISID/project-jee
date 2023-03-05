package esgi.arlo.arjas.jerseyservlet.entities;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import static esgi.arlo.arjas.jerseyservlet.qualifiers.H2DataSource.entityManager;

public class UsersService {
    @PersistenceContext // or even @Autowired
    private EntityManager entityManager = entityManager();

    public void saveUser() {

        entityManager.getTransaction().begin();

        UsersEntity usersEntity = new UsersEntity();
        usersEntity.setUsername("Sidoudou");
        usersEntity.setPassword("Sidoufou");
        entityManager.persist(usersEntity);
        entityManager.getTransaction().commit();
        Query q = entityManager.createNativeQuery("SELECT * FROM USERS");
        System.out.println(q.getResultList().toString());

    }
}
