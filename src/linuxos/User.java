package linuxos;

/** @author Joe Corrales */
public class User {
    //Class atributes
    protected String username;
    protected String password;
    
    //Constructors
    public User() {}
    
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    //Getters and setters
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

    //toString Method
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{\nUsername: ").append(this.username);
        sb.append(", \nPassword: \n}").append(this.password);
        return sb.toString();
    }
}
