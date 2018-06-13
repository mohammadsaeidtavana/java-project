package main.java.net.viralpalet.spring.model;

import java.io.Serializable;

/**
 * Created by saeedtavana on 4/5/18.
 */
public class person implements Serializable {
    public person(){}
    private int id;
    private String name;
    private String family;

    @Override
    public String toString() {
        return "person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", family='" + family + '\'' +
                '}';
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
