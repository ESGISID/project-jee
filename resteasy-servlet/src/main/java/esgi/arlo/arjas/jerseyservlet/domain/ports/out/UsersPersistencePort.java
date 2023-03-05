package esgi.arlo.arjas.jerseyservlet.domain.ports.out;

import esgi.arlo.arjas.jerseyservlet.domain.pojos.Users;
import esgi.arlo.arjas.jerseyservlet.persistence.entities.UsersEntity;

import java.util.List;


public interface UsersPersistencePort {
    void saveUser(String username, String password);

    Users findUser(String username);

    List<Users> getAllUsers();
}
