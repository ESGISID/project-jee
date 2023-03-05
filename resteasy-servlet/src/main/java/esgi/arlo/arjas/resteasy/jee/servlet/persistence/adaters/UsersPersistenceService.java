package esgi.arlo.arjas.resteasy.jee.servlet.persistence.adaters;

import esgi.arlo.arjas.resteasy.jee.servlet.domain.pojos.Users;
import esgi.arlo.arjas.resteasy.jee.servlet.domain.ports.out.UsersPersistencePort;
import esgi.arlo.arjas.resteasy.jee.servlet.persistence.datasource.H2EntityManager;
import esgi.arlo.arjas.resteasy.jee.servlet.persistence.entities.UsersEntity;
import esgi.arlo.arjas.resteasy.jee.servlet.persistence.mappers.UsersMapper;

import javax.enterprise.context.SessionScoped;
import javax.enterprise.inject.Default;
import javax.persistence.EntityManager;

import java.io.Serializable;
import java.util.List;
import java.util.stream.Collectors;

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
    public Users findUser(String username) {
        UsersEntity usersEntity = new UsersEntity();
        usersEntity.setUsername(username);
        return UsersMapper.toDomain(entityManager.find(  UsersEntity.class, usersEntity ));
    }


    @Override
    public List<Users>  getAllUsers() {
        List<UsersEntity> responseFromDb = entityManager.createQuery( "from UsersEntity", UsersEntity.class ).getResultList();
        return responseFromDb.stream().map(UsersMapper::toDomain).collect(Collectors.toList());
    }
}
