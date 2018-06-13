package webserv;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 * Created by saeedtavana on 5/28/17.
 */

public class person implements Serializable{

    private int age;
    private String name;
    private  String family;
    private int id;

    public int salary( int age , String name)
    {
        int salary=0;
        if (name.equals("saeed"))
        {
            salary=200000;


        }
        else if (name.equals("javad"))
        {
            salary=1000;
        }
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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
}
