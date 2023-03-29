package esgi.arlo.arjas.resteasy.jee.servlet.domain.pojos;


public class Users {
    private String username;

    private  String password;

    private int value;

    private  String someCode;

    public Users(String username, String password, int value, String someCode) {
        this.username = username;
        this.password = password;
        this.value = value;
        this.someCode = someCode;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getSomeCode() {
        return someCode;
    }

    public void setSomeCode(String someCode) {
        this.someCode = someCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Users users = (Users) o;

        if (value != users.value) return false;
        if (!username.equals(users.username)) return false;
        if (!password.equals(users.password)) return false;
        return someCode.equals(users.someCode);
    }

    @Override
    public int hashCode() {
        int result = username.hashCode();
        result = 31 * result + password.hashCode();
        result = 31 * result + value;
        result = 31 * result + someCode.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Users{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", value=" + value +
                ", someCode='" + someCode + '\'' +
                '}';
    }
}
