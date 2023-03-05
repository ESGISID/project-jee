package esgi.arlo.arjas.jerseyservlet.entities;

import org.hibernate.validator.constraints.Length;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class UsersEntity {
    @Id
    @NotNull
    @Length(min=3, max=25)
    private String username;

    @NotNull
    @Length(min=6, max=20)
    private  String password;

    public String getUsername() { return username; }
    public String getPassword() { return password; }

    public void setUsername(String username) { this.username = username; }
    public void setPassword(String password) { this.password = password; }
}
