package model.TO;

import javax.persistence.*;

/**
 * Created by saeedtavana on 6/30/17.
 */
@Entity
@Table(name = "car")
public class car {
    @Id
    @GeneratedValue
    @Column(name = "id" ,nullable = false )
    private  int id;
    @Column(name = "name")
    private String name;
    @Column(name = "model")
    private  String model;

    public car(String model, String name) {
        this.model = model;
        this.name = name;
    }

    public car() {
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
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
