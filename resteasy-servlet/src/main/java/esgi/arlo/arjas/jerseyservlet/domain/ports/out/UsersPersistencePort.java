package esgi.arlo.arjas.jerseyservlet.domain.ports.out;

import esgi.arlo.arjas.jerseyservlet.persistence.entities.UsersEntity;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Default;
import java.util.List;


public interface UsersPersistencePort {
    void saveUser(String username, String password);

    List<UsersEntity> getAllUsers();
}
