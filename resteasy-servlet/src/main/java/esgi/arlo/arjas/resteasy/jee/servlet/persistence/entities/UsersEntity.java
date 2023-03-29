package esgi.arlo.arjas.resteasy.jee.servlet.persistence.entities;

import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Objects;

@Entity
@Table(name = "USERS")
public class UsersEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Length(min=3, max=25)
    private String name;

    @NotNull
    @Length(min=6, max=20)
    private  String password;

    @NotNull
    private int value;

    @NotNull
    @Length(min=6, max=20)
    private  String someCode;
    public String getSomeCode() {
        return someCode;
    }

    public void setSomeCode(String someCode) {
        this.someCode = someCode;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() { return name; }
    public String getPassword() { return password; }

    public void setName(String username) { this.name = username; }
    public void setPassword(String password) { this.password = password; }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UsersEntity that = (UsersEntity) o;

        if (value != that.value) return false;
        if (!Objects.equals(id, that.id)) return false;
        if (!name.equals(that.name)) return false;
        if (!password.equals(that.password)) return false;
        return someCode.equals(that.someCode);
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + name.hashCode();
        result = 31 * result + password.hashCode();
        result = 31 * result + value;
        result = 31 * result + someCode.hashCode();
        return result;
    }
}
