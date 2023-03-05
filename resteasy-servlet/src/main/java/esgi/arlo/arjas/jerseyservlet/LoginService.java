package esgi.arlo.arjas.jerseyservlet;


import esgi.arlo.arjas.jerseyservlet.domain.pojos.Users;
import esgi.arlo.arjas.jerseyservlet.persistence.datasource.LoggedIn;
import sun.security.krb5.Credentials;

import javax.enterprise.context.SessionScoped;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;

@SessionScoped
@Named
public class LoginService implements Serializable {

    @Inject
    Credentials credentials;

    private Users user;

    public void login() {
    }

    public void logout() {
        user = null;
    }

    public boolean isLoggedIn() {
        return user != null;
    }

    @Produces
    @LoggedIn
    Users getCurrentUser() {
        return user;
    }

}
