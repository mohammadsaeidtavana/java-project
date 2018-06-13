package socketobj;

import java.io.Serializable;

/**
 * Created by saeedtavana on 5/26/17.
 */
public class person implements Serializable {
    public int age;
    public String name;
    public void show(int a)
    {
        System.out.println(a);
    }
}
