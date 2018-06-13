import model.TO.info;
import model.TO.person;
import Utils.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 * Created by saeedtavana on 6/29/17.
 */
public class main {
    public static void main(String[] args) {

        SessionFactory sessionFactory= HibernateUtil.getSessionFactory();
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();
        person person=new person("saeed","tavana");
        info info=new info("gg@gmailc.om","good health");
        person.setPersoninfo(info);
        session.saveOrUpdate(person);
        session.save(info);
        transaction.commit();
        session.close();
        System.out.println("person has been added");
        System.exit(0);
    }
}
