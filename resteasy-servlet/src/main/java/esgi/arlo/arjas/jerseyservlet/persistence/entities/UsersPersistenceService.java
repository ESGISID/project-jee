package esgi.arlo.arjas.jerseyservlet.persistence.entities;

import esgi.arlo.arjas.jerseyservlet.domain.ports.out.UsersPersistencePort;
import esgi.arlo.arjas.jerseyservlet.persistence.datasource.H2EntityManager;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Default;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import java.util.List;

@Default
@RequestScoped
public class UsersPersistenceService implements UsersPersistencePort {
    @PersistenceContext // or even @Autowired
    private EntityManager entityManager = H2EntityManager.entityManager();

    @Override
    public void saveUser(String username, String password) {

        entityManager.getTransaction().begin();

        UsersEntity usersEntity = new UsersEntity();
        usersEntity.setUsername(username);
        usersEntity.setPassword(password);
        entityManager.persist(usersEntity);
        entityManager.getTransaction().commit();
        List<UsersEntity> responseFromDb = entityManager.createQuery( "from UsersEntity", UsersEntity.class ).getResultList();
        for (UsersEntity article : responseFromDb) {
            System.out.println( article );
        }
    }
}
