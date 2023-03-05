package esgi.arlo.arjas.resteasy.jee.servlet.application.middleware;


import esgi.arlo.arjas.resteasy.jee.servlet.application.pojos.requests.LoginRequest;
import esgi.arlo.arjas.resteasy.jee.servlet.domain.pojos.Users;
import esgi.arlo.arjas.resteasy.jee.servlet.persistence.datasource.LoggedIn;

import javax.enterprise.context.SessionScoped;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;

@SessionScoped
@Named
public class LoginService implements Serializable {

    @Inject
    LoginRequest credentials;

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
