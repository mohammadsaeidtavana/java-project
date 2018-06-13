import Utils.HibernateUtil;
import model.TO.car;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 * Created by saeedtavana on 6/30/17.
 */
public class main2 {
    public static void main(String[] args) {
        SessionFactory sessionFactory= HibernateUtil.getSessionFactory();
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();
        car car =new car("20117","honda acccored");
        session.save(car);
        transaction.commit();
        session.close();
        System.out.println("car has been addes");
        System.exit(0);
    }
}
