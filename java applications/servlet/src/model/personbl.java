package model;

import java.util.ArrayList;

/**
 * Created by saeedtavana on 6/8/17.
 */
public class personbl {
    private personbl()
    {

    }
    private static personbl personbl=new personbl();
    public static personbl getPersonbl()
    {
        return personbl;
    }
    private ArrayList<person> list=new ArrayList<person>();
    public void insert(person person)
    {
        list.add(person);
    }
    public ArrayList<person> getList()
    {
        /*ArrayList<person> list1e=new ArrayList<person>();
        person person=new person();
        person.setName("saeed");
        person.setFmaily("tavana");
        person person2=new person();
        person2.setName("saeed");
        person2.setFmaily("tavana");
        list1e.add(person);
        list1e.add(person2);*/
        return list;
    }
}
