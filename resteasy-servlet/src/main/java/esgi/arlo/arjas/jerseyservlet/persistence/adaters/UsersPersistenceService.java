package esgi.arlo.arjas.jerseyservlet.persistence.adaters;

import esgi.arlo.arjas.jerseyservlet.domain.ports.out.UsersPersistencePort;
import esgi.arlo.arjas.jerseyservlet.persistence.datasource.H2EntityManager;
import esgi.arlo.arjas.jerseyservlet.persistence.entities.UsersEntity;

import javax.enterprise.context.SessionScoped;
import javax.enterprise.inject.Default;
import javax.persistence.EntityManager;

import java.io.Serializable;
import java.util.List;
@Default
@SessionScoped
public class UsersPersistenceService implements UsersPersistencePort, Serializable  {
    private static final EntityManager entityManager = H2EntityManager.entityManager();

    @Override
    public void saveUser(String username, String password) {
        UsersEntity usersEntity = new UsersEntity();
        usersEntity.setUsername(username);
        usersEntity.setPassword(password);
        entityManager.getTransaction().begin();
        entityManager.persist(usersEntity);
        entityManager.getTransaction().commit();
    }

    @Override
    public UsersEntity findUser(String username) {
        UsersEntity usersEntity = new UsersEntity();
        usersEntity.setUsername(username);
        return entityManager.find(  UsersEntity.class, usersEntity );
    }


    @Override
    public List<UsersEntity>  getAllUsers() {
        List<UsersEntity> responseFromDb = entityManager.createQuery( "from UsersEntity", UsersEntity.class ).getResultList();
        for (UsersEntity article : responseFromDb) {
            System.out.println( article );
        }
        return responseFromDb;
    }
}
