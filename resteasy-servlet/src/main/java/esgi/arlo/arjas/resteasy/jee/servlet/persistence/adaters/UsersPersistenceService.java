package esgi.arlo.arjas.resteasy.jee.servlet.persistence.adaters;

import esgi.arlo.arjas.resteasy.jee.servlet.domain.SomeAppException;
import esgi.arlo.arjas.resteasy.jee.servlet.domain.pojos.Users;
import esgi.arlo.arjas.resteasy.jee.servlet.domain.ports.out.UsersPersistencePort;
import esgi.arlo.arjas.resteasy.jee.servlet.persistence.datasource.H2EntityManager;
import esgi.arlo.arjas.resteasy.jee.servlet.persistence.entities.UsersEntity;
import esgi.arlo.arjas.resteasy.jee.servlet.persistence.mappers.UsersMapper;

import javax.enterprise.context.SessionScoped;
import javax.enterprise.inject.Default;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Default
@SessionScoped
public class UsersPersistenceService implements UsersPersistencePort, Serializable  {
    private static final EntityManager entityManager = H2EntityManager.entityManager();

    @Override
    public void saveUser(String username, String password, int value, String someCode) {
        UsersEntity usersEntity = new UsersEntity();
        usersEntity.setName(username);
        usersEntity.setPassword(password);
        usersEntity.setValue(value);
        usersEntity.setSomeCode(someCode);
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(usersEntity);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            throw new SomeAppException(e.getMessage());
        }
    }

    @Override
    public Users findUser(String username) {
        try {

            entityManager.createQuery("from UsersEntity u WHERE u.name = :name", UsersEntity.class)
                .setParameter("name", username)
                .getSingleResult();
        } catch (NoResultException e){
            throw new SomeAppException("lolilol");
        }
        return UsersMapper.toDomain(entityManager.createQuery("from UsersEntity u WHERE u.name = :name", UsersEntity.class)
                .setParameter("name", username)
                .getSingleResult());
    }


    @Override
    public List<Users>  getAllUsers() {
        List<UsersEntity> responseFromDb = entityManager.createQuery( "from UsersEntity", UsersEntity.class ).getResultList();
        return responseFromDb.stream().map(UsersMapper::toDomain).collect(Collectors.toList());
    }
}
