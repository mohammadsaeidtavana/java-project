package model.TO.bl;

import model.TO.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.annotations.Table;
import utils.HibernateUtil;

import java.io.Serializable;

/**
 * Created by saeedtavana on 5/1/18.
 */
public class StudentBL  implements Serializable{
    private static StudentBL ourInstance = new StudentBL();

    public static StudentBL getInstance() {
        return ourInstance;
    }

    private StudentBL() {
    }

    public void addAttendance(Student student)throws Exception
    {
        SessionFactory sessionFactory= HibernateUtil.getSessionFactory();
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();
        session.save(student);
        transaction.commit();
        session.close();
    }
}
