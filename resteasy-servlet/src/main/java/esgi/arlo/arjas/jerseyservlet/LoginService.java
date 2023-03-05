package esgi.arlo.arjas.jerseyservlet;


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