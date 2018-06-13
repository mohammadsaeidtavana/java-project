package reflection;

import java.lang.reflect.Method;

/**
 * Created by saeedtavana on 5/26/18.
 */
public class main {
    public static void main(String[] args) throws Exception {

        //first way
        Class c = Class.forName("reflection.student");
        Object o= c.newInstance();
        Method m =c.getDeclaredMethod("pritnword", String.class);
        m.setAccessible(true);
        m.invoke(o, "hello parameter");
        //second way
        student student=new student();
        Class aClass=student.getClass();
        Method method1=aClass.getDeclaredMethod("pritnword",String.class);
        method1.setAccessible(true);
        method1.invoke(student,"hello saeed");

        reflection.student student1=new student();
        Class clas1=student1.getClass();
        Method method=clas1.getDeclaredMethod("sum",int.class,int.class);
        method.setAccessible(true);
       int result= (int) method.invoke(student1,5,6);
        System.out.println(result);

        Class s=Class.forName("reflection.student");
        Object o1=s.newInstance();
        Method method2=s.getDeclaredMethod("sum",int.class,int.class);
        method2.setAccessible(true);
        int result1= (int) method2.invoke(student1,5,6);
        System.out.println(result1);

    }
}
