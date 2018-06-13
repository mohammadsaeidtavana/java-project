package model.bl;

import model.to.book;
import model.to.person;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import utils.HibernateUtil;

import java.awt.*;
import java.util.*;
import java.util.List;

/**
 * Created by user on 6/9/2017.
 */
public class personBL {
    private personBL()
    {

    }
    private  static personBL personBL=new personBL();
    public  static personBL getPersonBL()
    {
        return personBL;
    }

    private SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
    public void insert(person person)
    {
        try {
            Session session = sessionFactory.openSession();
            Transaction transaction = session.beginTransaction();
            session.save(person);
            transaction.commit();
            session.close();
        }
        catch (Exception e)
        {
            //e.printStackTrace();
        }


    }
    public List<person> getAll()
    {

            Session session=  sessionFactory.openSession();
            Transaction transaction=session.beginTransaction();
            Query query= session.createQuery("from model.to.person order by id");
             java.util.List<person> list=  query.list();
            transaction.commit();
            session.close();
            return list;
    }
    public void delete(int id)
    {
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();
        Query query=session.createQuery("delete from person where id=:ida").setParameter("ida",id);
        query.executeUpdate();
        transaction.commit();
        session.close();

    }
    public book getOnperosn(int id)
    {
        book book1=null;
        try {
            Session session = sessionFactory.openSession();
            Transaction transaction = session.beginTransaction();
            Query query = session.createQuery(" from person where id=:idd").setParameter("idd", id);
            person person = (model.to.person) query.uniqueResult();
            book1 = person.bookLis;


        }catch (Exception e)
        {

        }
        return book1;
    }
}

