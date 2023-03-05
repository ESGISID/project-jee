package esgi.arlo.arjas.jerseyservlet.domain.ports.out;

import esgi.arlo.arjas.jerseyservlet.persistence.entities.UsersEntity;

import java.util.List;


public interface UsersPersistencePort {
    void saveUser(String username, String password);

    UsersEntity findUser(String username);

    List<UsersEntity> getAllUsers();
}
