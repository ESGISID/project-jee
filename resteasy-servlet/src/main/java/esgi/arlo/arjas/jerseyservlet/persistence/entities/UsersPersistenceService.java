package esgi.arlo.arjas.jerseyservlet.persistence.entities;

import esgi.arlo.arjas.jerseyservlet.persistence.datasource.H2EntityManager;

import javax.enterprise.context.SessionScoped;
import javax.enterprise.inject.Default;
import javax.persistence.EntityManager;

import java.io.Serializable;
import java.util.List;
@Default
@SessionScoped
public class UsersPersistenceService implements Serializable {
    private static final EntityManager entityManager = H2EntityManager.entityManager();

    public void saveUser(String username, String password) {

        entityManager.getTransaction().begin();

        UsersEntity usersEntity = new UsersEntity();
        usersEntity.setUsername(username);
        usersEntity.setPassword(password);
        entityManager.persist(usersEntity);
        entityManager.getTransaction().commit();
    }

    public static List<UsersEntity>  getAllUsers() {
        List<UsersEntity> responseFromDb = entityManager.createQuery( "from UsersEntity", UsersEntity.class ).getResultList();
        for (UsersEntity article : responseFromDb) {
            System.out.println( article );
        }
        return responseFromDb;
    }
}
