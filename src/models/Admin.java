package models;

public class Admin {

    private Long aid;
    private String username;
    private String password;


    public Admin() {
    }

    public Admin(Long aid, String username, String password) {
        this.aid = aid;
        this.username = username;
        this.password = password;
    }

    public Long getAid() {
        return aid;
    }

    public void setAid(Long aid) {
        this.aid = aid;
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
}
