package model.bl;

import model.to.CarTO;
import model.to.PersonTO;
import model.util.HibernateUtil;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Expression;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Bahador
 * Date: 8/9/14
 * Time: 5:09 PM
 * To change this template use File | Settings | File Templates.
 */


public class PersonManager {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();

        List<PersonTO> personTOs = session.createQuery("from PersonTO person").list();


        for (PersonTO personTO : personTOs) {
            System.out.println(personTO.getName());
            System.out.println(personTO.getFamily());
            System.out.println("before");
            for (CarTO carTO :personTO.getCarTOs())
            {
                System.out.println("  "+carTO.getName());
            }
            System.out.println("after");
            System.out.println("----");
        }
        session.close();



    }
}
