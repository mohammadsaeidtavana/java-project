package model.TO;

import javax.persistence.Column;
import java.util.List;

/**
 * Created by saeedtavana on 6/29/17.
 */
public class person {
    private int id;
    private String name;
    private String family;
    private  info personinfo;



    public info getPersoninfo() {
        return personinfo;
    }

    public void setPersoninfo(info personinfo) {
        this.personinfo = personinfo;
    }

    public person() {
    }

    public person( String name, String family) {

        this.name = name;
        this.family = family;
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }
}