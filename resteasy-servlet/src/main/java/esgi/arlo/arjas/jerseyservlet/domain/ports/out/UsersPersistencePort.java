package esgi.arlo.arjas.jerseyservlet.domain.ports.out;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Default;


public interface UsersPersistencePort {
    void saveUser(String username, String password);
}
