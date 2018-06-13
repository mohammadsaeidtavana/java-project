package model.TO;

/**
 * Created by saeedtavana on 6/29/17.
 */
public class info {
    private int id;
    private String health;
    private String email;

    public info() {
    }

    public info(String email, String health) {

        this.email = email;
        this.health = health;
    }

    public String getEmail() {

        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHealth() {
        return health;
    }

    public void setHealth(String health) {
        this.health = health;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
