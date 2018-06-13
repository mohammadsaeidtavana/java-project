package main.java.net.viralpalet.spring.DA;

import main.java.net.viralpalet.spring.model.person;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by saeedtavana on 4/5/18.
 */
@Component
public class DataAccess {

    public DataAccess(){

    }

    public List<person> showperson()
    {
        List<person> list=new ArrayList<>();
        person person=new person();
        person.setId(471);
        person.setName("saeed");
        person.setFamily("tavana");
        main.java.net.viralpalet.spring.model.person person1=new person();
        person1.setId(45);
        person1.setName("javad");
        person1.setFamily("tavana");
        list.add(person);
        list.add(person1);
        return list;
    }
    public person search(long id)
    {
        List<person> list=new ArrayList<>();
        person person=new person();
        person.setId(471);
        person.setName("saeed");
        person.setFamily("tavana");
        main.java.net.viralpalet.spring.model.person person1=new person();
        person1.setId(451);
        person1.setName("javad");
        person1.setFamily("tavana");
        list.add(person);
        for (person p1:list) {
            if (p1.getId()==id)
            {
                return p1;
            }

        }
        return null;

    }

}
