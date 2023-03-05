package esgi.arlo.arjas.jerseyservlet;


import esgi.arlo.arjas.jerseyservlet.entities.UsersEntity;
import esgi.arlo.arjas.jerseyservlet.qualifiers.LoggedIn;

import javax.enterprise.context.SessionScoped;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;

/**
@SessionScoped
@Named
public class LoginService implements Serializable {

    @Inject
    Credentials credentials;

    private UsersEntity user;

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
    UsersEntity getCurrentUser() {
        return user;
    }

}
*/