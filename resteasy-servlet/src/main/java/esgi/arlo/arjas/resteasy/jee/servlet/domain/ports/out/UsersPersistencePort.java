package esgi.arlo.arjas.resteasy.jee.servlet.domain.ports.out;

import esgi.arlo.arjas.resteasy.jee.servlet.domain.pojos.Users;

import java.util.List;


public interface UsersPersistencePort {
    void saveUser(String username, String password, int value, String someCode);

    Users findUser(String username);

    List<Users> getAllUsers();
}
