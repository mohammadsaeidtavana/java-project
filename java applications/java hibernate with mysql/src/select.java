import model.TO.info;
import model.TO.person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.jpa.spi.HibernateEntityManagerFactoryAware;

import javax.persistence.Query;

/**
 * Created by saeedtavana on 6/30/17.
 */
public class select {
    public static void main(String[] args) {
        SessionFactory sessionFactory= Utils.HibernateUtil.getSessionFactory();
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();
        person person= (model.TO.person) session.createQuery(" from person where id=:idd").setParameter("idd",1).uniqueResult();
        info info =person.getPersoninfo();
        System.out.println(".......person info ......");
        System.out.println(info.getId());
        System.out.println(info.getEmail());
        System.out.println(info.getHealth());
        System.out.println("----person -------");
        System.out.println(person.getId());
        System.out.println(person.getName());
        transaction.commit();
        session.close();
        System.exit(0);



    }
}
